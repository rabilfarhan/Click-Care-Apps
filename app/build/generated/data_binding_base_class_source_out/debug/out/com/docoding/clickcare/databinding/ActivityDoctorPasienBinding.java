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

public final class ActivityDoctorPasienBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout bottomSheetContainer;

  @NonNull
  public final Button dokterDua;

  @NonNull
  public final Button dokterEmpat;

  @NonNull
  public final Button dokterSatu;

  @NonNull
  public final Button dokterTiga;

  private ActivityDoctorPasienBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout bottomSheetContainer, @NonNull Button dokterDua,
      @NonNull Button dokterEmpat, @NonNull Button dokterSatu, @NonNull Button dokterTiga) {
    this.rootView = rootView;
    this.bottomSheetContainer = bottomSheetContainer;
    this.dokterDua = dokterDua;
    this.dokterEmpat = dokterEmpat;
    this.dokterSatu = dokterSatu;
    this.dokterTiga = dokterTiga;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorPasienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorPasienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_pasien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorPasienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout bottomSheetContainer = (LinearLayout) rootView;

      id = R.id.dokter_dua;
      Button dokterDua = ViewBindings.findChildViewById(rootView, id);
      if (dokterDua == null) {
        break missingId;
      }

      id = R.id.dokter_empat;
      Button dokterEmpat = ViewBindings.findChildViewById(rootView, id);
      if (dokterEmpat == null) {
        break missingId;
      }

      id = R.id.dokter_satu;
      Button dokterSatu = ViewBindings.findChildViewById(rootView, id);
      if (dokterSatu == null) {
        break missingId;
      }

      id = R.id.dokter_tiga;
      Button dokterTiga = ViewBindings.findChildViewById(rootView, id);
      if (dokterTiga == null) {
        break missingId;
      }

      return new ActivityDoctorPasienBinding((LinearLayout) rootView, bottomSheetContainer,
          dokterDua, dokterEmpat, dokterSatu, dokterTiga);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
