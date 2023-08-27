// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPassword2Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText emailVerification;

  @NonNull
  public final Button sendEmailVerification;

  private ActivityForgotPassword2Binding(@NonNull ScrollView rootView,
      @NonNull EditText emailVerification, @NonNull Button sendEmailVerification) {
    this.rootView = rootView;
    this.emailVerification = emailVerification;
    this.sendEmailVerification = sendEmailVerification;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPassword2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPassword2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPassword2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_verification;
      EditText emailVerification = ViewBindings.findChildViewById(rootView, id);
      if (emailVerification == null) {
        break missingId;
      }

      id = R.id.send_email_verification;
      Button sendEmailVerification = ViewBindings.findChildViewById(rootView, id);
      if (sendEmailVerification == null) {
        break missingId;
      }

      return new ActivityForgotPassword2Binding((ScrollView) rootView, emailVerification,
          sendEmailVerification);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
