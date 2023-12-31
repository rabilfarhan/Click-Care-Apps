// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailDoctorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView doctorDetailExperience;

  @NonNull
  public final TextView doctorDetailNumber;

  @NonNull
  public final TextView doctorDetailPasien;

  @NonNull
  public final TextView doctorDetailPrice;

  @NonNull
  public final TextView doctorDetailReview;

  private FragmentDetailDoctorBinding(@NonNull LinearLayout rootView,
      @NonNull TextView doctorDetailExperience, @NonNull TextView doctorDetailNumber,
      @NonNull TextView doctorDetailPasien, @NonNull TextView doctorDetailPrice,
      @NonNull TextView doctorDetailReview) {
    this.rootView = rootView;
    this.doctorDetailExperience = doctorDetailExperience;
    this.doctorDetailNumber = doctorDetailNumber;
    this.doctorDetailPasien = doctorDetailPasien;
    this.doctorDetailPrice = doctorDetailPrice;
    this.doctorDetailReview = doctorDetailReview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailDoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailDoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail_doctor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailDoctorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.doctor_detail_experience;
      TextView doctorDetailExperience = ViewBindings.findChildViewById(rootView, id);
      if (doctorDetailExperience == null) {
        break missingId;
      }

      id = R.id.doctor_detail_number;
      TextView doctorDetailNumber = ViewBindings.findChildViewById(rootView, id);
      if (doctorDetailNumber == null) {
        break missingId;
      }

      id = R.id.doctor_detail_pasien;
      TextView doctorDetailPasien = ViewBindings.findChildViewById(rootView, id);
      if (doctorDetailPasien == null) {
        break missingId;
      }

      id = R.id.doctor_detail_price;
      TextView doctorDetailPrice = ViewBindings.findChildViewById(rootView, id);
      if (doctorDetailPrice == null) {
        break missingId;
      }

      id = R.id.doctor_detail_review;
      TextView doctorDetailReview = ViewBindings.findChildViewById(rootView, id);
      if (doctorDetailReview == null) {
        break missingId;
      }

      return new FragmentDetailDoctorBinding((LinearLayout) rootView, doctorDetailExperience,
          doctorDetailNumber, doctorDetailPasien, doctorDetailPrice, doctorDetailReview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
