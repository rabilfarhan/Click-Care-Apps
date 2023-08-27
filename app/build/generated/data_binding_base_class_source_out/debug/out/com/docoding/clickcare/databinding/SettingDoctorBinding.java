// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SettingDoctorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout changeLanguage;

  @NonNull
  public final LinearLayout changePassword;

  @NonNull
  public final LinearLayout changeProfile;

  @NonNull
  public final LinearLayout logoutUser;

  @NonNull
  public final View view;

  private SettingDoctorBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout changeLanguage,
      @NonNull LinearLayout changePassword, @NonNull LinearLayout changeProfile,
      @NonNull LinearLayout logoutUser, @NonNull View view) {
    this.rootView = rootView;
    this.changeLanguage = changeLanguage;
    this.changePassword = changePassword;
    this.changeProfile = changeProfile;
    this.logoutUser = logoutUser;
    this.view = view;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingDoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingDoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.setting_doctor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingDoctorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.change_language;
      LinearLayout changeLanguage = ViewBindings.findChildViewById(rootView, id);
      if (changeLanguage == null) {
        break missingId;
      }

      id = R.id.change_password;
      LinearLayout changePassword = ViewBindings.findChildViewById(rootView, id);
      if (changePassword == null) {
        break missingId;
      }

      id = R.id.change_profile;
      LinearLayout changeProfile = ViewBindings.findChildViewById(rootView, id);
      if (changeProfile == null) {
        break missingId;
      }

      id = R.id.logout_user;
      LinearLayout logoutUser = ViewBindings.findChildViewById(rootView, id);
      if (logoutUser == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new SettingDoctorBinding((LinearLayout) rootView, changeLanguage, changePassword,
          changeProfile, logoutUser, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}