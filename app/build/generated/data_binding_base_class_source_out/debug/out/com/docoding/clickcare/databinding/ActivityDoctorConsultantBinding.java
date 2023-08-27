// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorConsultantBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final Button buttonBack;

  @NonNull
  public final RecyclerView doctorList;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final Button filterDrawer;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textErrorMessage;

  private ActivityDoctorConsultantBinding(@NonNull DrawerLayout rootView,
      @NonNull Button buttonBack, @NonNull RecyclerView doctorList,
      @NonNull DrawerLayout drawerLayout, @NonNull Button filterDrawer,
      @NonNull LinearLayout linearLayout5, @NonNull ProgressBar progressBar,
      @NonNull TextView textErrorMessage) {
    this.rootView = rootView;
    this.buttonBack = buttonBack;
    this.doctorList = doctorList;
    this.drawerLayout = drawerLayout;
    this.filterDrawer = filterDrawer;
    this.linearLayout5 = linearLayout5;
    this.progressBar = progressBar;
    this.textErrorMessage = textErrorMessage;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorConsultantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorConsultantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_consultant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorConsultantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonBack;
      Button buttonBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.doctor_list;
      RecyclerView doctorList = ViewBindings.findChildViewById(rootView, id);
      if (doctorList == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.filter_drawer;
      Button filterDrawer = ViewBindings.findChildViewById(rootView, id);
      if (filterDrawer == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textErrorMessage;
      TextView textErrorMessage = ViewBindings.findChildViewById(rootView, id);
      if (textErrorMessage == null) {
        break missingId;
      }

      return new ActivityDoctorConsultantBinding((DrawerLayout) rootView, buttonBack, doctorList,
          drawerLayout, filterDrawer, linearLayout5, progressBar, textErrorMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}