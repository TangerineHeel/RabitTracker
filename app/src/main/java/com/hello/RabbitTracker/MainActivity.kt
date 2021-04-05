package com.hello.RabbitTracker

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hello.RabbitTracker.databinding.ActivityMainBinding
import com.sothree.slidinguppanel.SlidingUpPanelLayout

class MainActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
    private var todoList: ArrayList<Todo> = ArrayList()

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val todoListAdapter = TodoListAdapter(todoList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        with(binding) {
            rvTodoList.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = todoListAdapter
            }
            addTodoListBtn.setOnClickListener {
                val todoListString = editAddTodoList.text.toString()
                if (todoListString.isEmpty()) {
//                    Toast.makeText(applicationContext, "주라 주라 입력해주라", Toast.LENGTH_SHORT).show()
                    todoList.add(Todo("후딱하는 테스트용"))
                    todoListAdapter.notifyDataSetChanged()
                    rvTodoList.scrollToPosition(todoListAdapter.itemCount - 1)
                    editAddTodoList.text = null
                } else {
                    todoList.add(Todo(todoListString))
                    todoListAdapter.notifyDataSetChanged()
                    rvTodoList.scrollToPosition(todoListAdapter.itemCount - 1) // 제일 마지막 리스트가 보이도록 스크롤
                    editAddTodoList.text = null
                    Toast.makeText(
                        applicationContext,
                        "'$todoListString' 이/가 추가되었다!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            panelLayout.addPanelSlideListener(object : SlidingUpPanelLayout.PanelSlideListener {
                override fun onPanelSlide(panel: View?, slideOffset: Float) {

                }

                override fun onPanelStateChanged(
                    panel: View?,
                    previousState: SlidingUpPanelLayout.PanelState?,
                    newState: SlidingUpPanelLayout.PanelState?
                ) {
                    if (newState == SlidingUpPanelLayout.PanelState.EXPANDED) {
                        tvDate.visibility = View.VISIBLE
                    } else if(newState == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                        tvDate.visibility = View.GONE
                    }
                }

            })
        }
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - backPressedTime >= 2000) {
            if (binding.panelLayout.panelState == SlidingUpPanelLayout.PanelState.EXPANDED) {
                binding.panelLayout.panelState = SlidingUpPanelLayout.PanelState.COLLAPSED
            } else {
                backPressedTime = System.currentTimeMillis()
                Toast.makeText(applicationContext, "한 번 더 누르면 종료", Toast.LENGTH_SHORT).show()
            }
        } else {
            finish()
        }
    }
}