// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class WidgetCheckBinding implements ViewBinding {
  @NonNull
  private final CheckBox rootView;

  private WidgetCheckBinding(@NonNull CheckBox rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public CheckBox getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetCheckBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetCheckBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_check, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetCheckBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new WidgetCheckBinding((CheckBox) rootView);
  }
}
