// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityDetailRegistrasiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnBac;

  @NonNull
  public final TextView dateRegister;

  @NonNull
  public final TextView dokterRegister;

  @NonNull
  public final TextView keluhanRegister;

  @NonNull
  public final TextView nameRegister;

  @NonNull
  public final TextView noAntrianRegister;

  @NonNull
  public final Button registrasiAcc;

  private ActivityDetailRegistrasiBinding(@NonNull LinearLayout rootView, @NonNull Button btnBac,
      @NonNull TextView dateRegister, @NonNull TextView dokterRegister,
      @NonNull TextView keluhanRegister, @NonNull TextView nameRegister,
      @NonNull TextView noAntrianRegister, @NonNull Button registrasiAcc) {
    this.rootView = rootView;
    this.btnBac = btnBac;
    this.dateRegister = dateRegister;
    this.dokterRegister = dokterRegister;
    this.keluhanRegister = keluhanRegister;
    this.nameRegister = nameRegister;
    this.noAntrianRegister = noAntrianRegister;
    this.registrasiAcc = registrasiAcc;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailRegistrasiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailRegistrasiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_registrasi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailRegistrasiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBac;
      Button btnBac = ViewBindings.findChildViewById(rootView, id);
      if (btnBac == null) {
        break missingId;
      }

      id = R.id.date_register;
      TextView dateRegister = ViewBindings.findChildViewById(rootView, id);
      if (dateRegister == null) {
        break missingId;
      }

      id = R.id.dokterRegister;
      TextView dokterRegister = ViewBindings.findChildViewById(rootView, id);
      if (dokterRegister == null) {
        break missingId;
      }

      id = R.id.keluhanRegister;
      TextView keluhanRegister = ViewBindings.findChildViewById(rootView, id);
      if (keluhanRegister == null) {
        break missingId;
      }

      id = R.id.nameRegister;
      TextView nameRegister = ViewBindings.findChildViewById(rootView, id);
      if (nameRegister == null) {
        break missingId;
      }

      id = R.id.no_antrian_register;
      TextView noAntrianRegister = ViewBindings.findChildViewById(rootView, id);
      if (noAntrianRegister == null) {
        break missingId;
      }

      id = R.id.registrasi_acc;
      Button registrasiAcc = ViewBindings.findChildViewById(rootView, id);
      if (registrasiAcc == null) {
        break missingId;
      }

      return new ActivityDetailRegistrasiBinding((LinearLayout) rootView, btnBac, dateRegister,
          dokterRegister, keluhanRegister, nameRegister, noAntrianRegister, registrasiAcc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}