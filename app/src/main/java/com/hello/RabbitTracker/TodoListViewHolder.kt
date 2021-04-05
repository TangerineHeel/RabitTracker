package com.hello.RabbitTracker

import androidx.recyclerview.widget.RecyclerView
import com.hello.RabbitTracker.databinding.TodoListItemBinding

class TodoListViewHolder(private val binding: TodoListItemBinding) : RecyclerView.ViewHolder(binding.root){

    private var currentImg: Int = 0

    fun bind(item: Todo) {
        with(binding) {
            tvTodoListItem.text = item.todo

            ivCheckBoxTodoListItem.apply {
                setOnClickListener {
                    currentImg++
                    if (currentImg >= 3 ) currentImg %= 3
                    when(currentImg) {
                        0 -> setImageResource(R.drawable.check_box_incomplete)
                        1 -> setImageResource(R.drawable.check_box_postpone)
                        2 -> setImageResource(R.drawable.check_box_complete)
                    }
                }

//                setOnLongClickListener {
//
//                }
            }
        }
    }
}