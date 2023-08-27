// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivitySplashscreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private ActivitySplashscreenBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splashscreen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashscreenBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ActivitySplashscreenBinding((LinearLayout) rootView);
  }
}
