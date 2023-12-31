// Generated by view binder compiler. Do not edit!
package com.docoding.clickcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.docoding.clickcare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeUserLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout googleMap;

  @NonNull
  public final ImageView imgItemPhotoUserNoLogin;

  @NonNull
  public final Button infoAppActivity;

  @NonNull
  public final Button konsultasiActivity;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final Button loginBottom;

  @NonNull
  public final RecyclerView newsList;

  @NonNull
  public final ImageView notifBgNoLogin;

  @NonNull
  public final Button registerBottom;

  @NonNull
  public final Button registrasiActivity;

  @NonNull
  public final CardView thumbnailCardUserNoLogin;

  private FragmentHomeUserLoginBinding(@NonNull ScrollView rootView,
      @NonNull LinearLayout googleMap, @NonNull ImageView imgItemPhotoUserNoLogin,
      @NonNull Button infoAppActivity, @NonNull Button konsultasiActivity,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2,
      @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4,
      @NonNull Button loginBottom, @NonNull RecyclerView newsList,
      @NonNull ImageView notifBgNoLogin, @NonNull Button registerBottom,
      @NonNull Button registrasiActivity, @NonNull CardView thumbnailCardUserNoLogin) {
    this.rootView = rootView;
    this.googleMap = googleMap;
    this.imgItemPhotoUserNoLogin = imgItemPhotoUserNoLogin;
    this.infoAppActivity = infoAppActivity;
    this.konsultasiActivity = konsultasiActivity;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.linearLayout4 = linearLayout4;
    this.loginBottom = loginBottom;
    this.newsList = newsList;
    this.notifBgNoLogin = notifBgNoLogin;
    this.registerBottom = registerBottom;
    this.registrasiActivity = registrasiActivity;
    this.thumbnailCardUserNoLogin = thumbnailCardUserNoLogin;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeUserLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeUserLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_user_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeUserLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.google_map;
      LinearLayout googleMap = ViewBindings.findChildViewById(rootView, id);
      if (googleMap == null) {
        break missingId;
      }

      id = R.id.img_item_photo_user_no_login;
      ImageView imgItemPhotoUserNoLogin = ViewBindings.findChildViewById(rootView, id);
      if (imgItemPhotoUserNoLogin == null) {
        break missingId;
      }

      id = R.id.info_app_activity;
      Button infoAppActivity = ViewBindings.findChildViewById(rootView, id);
      if (infoAppActivity == null) {
        break missingId;
      }

      id = R.id.konsultasi_activity;
      Button konsultasiActivity = ViewBindings.findChildViewById(rootView, id);
      if (konsultasiActivity == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.login_bottom;
      Button loginBottom = ViewBindings.findChildViewById(rootView, id);
      if (loginBottom == null) {
        break missingId;
      }

      id = R.id.news_list;
      RecyclerView newsList = ViewBindings.findChildViewById(rootView, id);
      if (newsList == null) {
        break missingId;
      }

      id = R.id.notif_bg_no_login;
      ImageView notifBgNoLogin = ViewBindings.findChildViewById(rootView, id);
      if (notifBgNoLogin == null) {
        break missingId;
      }

      id = R.id.register_bottom;
      Button registerBottom = ViewBindings.findChildViewById(rootView, id);
      if (registerBottom == null) {
        break missingId;
      }

      id = R.id.registrasi_activity;
      Button registrasiActivity = ViewBindings.findChildViewById(rootView, id);
      if (registrasiActivity == null) {
        break missingId;
      }

      id = R.id.thumbnail_card_user_no_login;
      CardView thumbnailCardUserNoLogin = ViewBindings.findChildViewById(rootView, id);
      if (thumbnailCardUserNoLogin == null) {
        break missingId;
      }

      return new FragmentHomeUserLoginBinding((ScrollView) rootView, googleMap,
          imgItemPhotoUserNoLogin, infoAppActivity, konsultasiActivity, linearLayout, linearLayout2,
          linearLayout3, linearLayout4, loginBottom, newsList, notifBgNoLogin, registerBottom,
          registrasiActivity, thumbnailCardUserNoLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
