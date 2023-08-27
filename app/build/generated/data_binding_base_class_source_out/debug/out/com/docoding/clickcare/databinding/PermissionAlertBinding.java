// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PermissionAlertBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button noPermission;

  @NonNull
  public final Button yesPermission;

  private PermissionAlertBinding(@NonNull LinearLayout rootView, @NonNull Button noPermission,
      @NonNull Button yesPermission) {
    this.rootView = rootView;
    this.noPermission = noPermission;
    this.yesPermission = yesPermission;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PermissionAlertBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PermissionAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.permission_alert, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PermissionAlertBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.no_permission;
      Button noPermission = ViewBindings.findChildViewById(rootView, id);
      if (noPermission == null) {
        break missingId;
      }

      id = R.id.yes_permission;
      Button yesPermission = ViewBindings.findChildViewById(rootView, id);
      if (yesPermission == null) {
        break missingId;
      }

      return new PermissionAlertBinding((LinearLayout) rootView, noPermission, yesPermission);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}