// Generated by view binder compiler. Do not edit!
package com.hello.RabbitTracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.hello.RabbitTracker.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final SlidingUpPanelLayout rootView;

  @NonNull
  public final TextView addTodoListBtn;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final ConstraintLayout drawer;

  @NonNull
  public final EditText editAddTodoList;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final SlidingUpPanelLayout panelLayout;

  @NonNull
  public final RecyclerView rvTodoList;

  @NonNull
  public final TextView tvDate;

  private ActivityMainBinding(@NonNull SlidingUpPanelLayout rootView,
      @NonNull TextView addTodoListBtn, @NonNull CalendarView calendarView,
      @NonNull ConstraintLayout drawer, @NonNull EditText editAddTodoList,
      @NonNull ImageView imageView, @NonNull SlidingUpPanelLayout panelLayout,
      @NonNull RecyclerView rvTodoList, @NonNull TextView tvDate) {
    this.rootView = rootView;
    this.addTodoListBtn = addTodoListBtn;
    this.calendarView = calendarView;
    this.drawer = drawer;
    this.editAddTodoList = editAddTodoList;
    this.imageView = imageView;
    this.panelLayout = panelLayout;
    this.rvTodoList = rvTodoList;
    this.tvDate = tvDate;
  }

  @Override
  @NonNull
  public SlidingUpPanelLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_todo_list_btn;
      TextView addTodoListBtn = rootView.findViewById(id);
      if (addTodoListBtn == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = rootView.findViewById(id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.drawer;
      ConstraintLayout drawer = rootView.findViewById(id);
      if (drawer == null) {
        break missingId;
      }

      id = R.id.edit_add_todo_list;
      EditText editAddTodoList = rootView.findViewById(id);
      if (editAddTodoList == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      SlidingUpPanelLayout panelLayout = (SlidingUpPanelLayout) rootView;

      id = R.id.rv_todo_list;
      RecyclerView rvTodoList = rootView.findViewById(id);
      if (rvTodoList == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = rootView.findViewById(id);
      if (tvDate == null) {
        break missingId;
      }

      return new ActivityMainBinding((SlidingUpPanelLayout) rootView, addTodoListBtn, calendarView,
          drawer, editAddTodoList, imageView, panelLayout, rvTodoList, tvDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
