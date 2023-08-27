// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegisterBottomSheetBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText confirmPasswordRegister;

  @NonNull
  public final EditText emailRegister;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText passwordRegister;

  @NonNull
  public final ScrollView registerBottomSheetTwo;

  @NonNull
  public final TextView registerBottomTitle;

  @NonNull
  public final ProgressBar registerProses;

  @NonNull
  public final Button registrasi;

  @NonNull
  public final EditText usernameRegister;

  @NonNull
  public final View view;

  private RegisterBottomSheetBinding(@NonNull ScrollView rootView,
      @NonNull EditText confirmPasswordRegister, @NonNull EditText emailRegister,
      @NonNull Button login, @NonNull EditText passwordRegister,
      @NonNull ScrollView registerBottomSheetTwo, @NonNull TextView registerBottomTitle,
      @NonNull ProgressBar registerProses, @NonNull Button registrasi,
      @NonNull EditText usernameRegister, @NonNull View view) {
    this.rootView = rootView;
    this.confirmPasswordRegister = confirmPasswordRegister;
    this.emailRegister = emailRegister;
    this.login = login;
    this.passwordRegister = passwordRegister;
    this.registerBottomSheetTwo = registerBottomSheetTwo;
    this.registerBottomTitle = registerBottomTitle;
    this.registerProses = registerProses;
    this.registrasi = registrasi;
    this.usernameRegister = usernameRegister;
    this.view = view;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static RegisterBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegisterBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.register_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegisterBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_password_register;
      EditText confirmPasswordRegister = ViewBindings.findChildViewById(rootView, id);
      if (confirmPasswordRegister == null) {
        break missingId;
      }

      id = R.id.email_register;
      EditText emailRegister = ViewBindings.findChildViewById(rootView, id);
      if (emailRegister == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.password_register;
      EditText passwordRegister = ViewBindings.findChildViewById(rootView, id);
      if (passwordRegister == null) {
        break missingId;
      }

      ScrollView registerBottomSheetTwo = (ScrollView) rootView;

      id = R.id.register_bottom_title;
      TextView registerBottomTitle = ViewBindings.findChildViewById(rootView, id);
      if (registerBottomTitle == null) {
        break missingId;
      }

      id = R.id.register_proses;
      ProgressBar registerProses = ViewBindings.findChildViewById(rootView, id);
      if (registerProses == null) {
        break missingId;
      }

      id = R.id.registrasi;
      Button registrasi = ViewBindings.findChildViewById(rootView, id);
      if (registrasi == null) {
        break missingId;
      }

      id = R.id.username_register;
      EditText usernameRegister = ViewBindings.findChildViewById(rootView, id);
      if (usernameRegister == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new RegisterBottomSheetBinding((ScrollView) rootView, confirmPasswordRegister,
          emailRegister, login, passwordRegister, registerBottomSheetTwo, registerBottomTitle,
          registerProses, registrasi, usernameRegister, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
