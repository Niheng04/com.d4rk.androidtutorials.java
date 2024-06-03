// Generated by view binder compiler. Do not edit!
package com.d4rk.androidtutorials.java.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.d4rk.androidtutorials.java.R;
import com.google.android.gms.ads.AdView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.zhanghai.android.fastscroll.FastScrollScrollView;

public final class ActivityPermissionsTutorialBinding implements ViewBinding {
  @NonNull
  private final FastScrollScrollView rootView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final MaterialButton buttonMore;

  @NonNull
  public final MaterialCardView cardViewAd;

  @NonNull
  public final MaterialCardView cardViewLottieAnimation;

  @NonNull
  public final LinearLayoutCompat linearLayoutViewAd;

  @NonNull
  public final LottieAnimationView lottieAnimation;

  @NonNull
  public final FastScrollScrollView scrollView;

  @NonNull
  public final MaterialTextView textViewPermissionsBeginning;

  @NonNull
  public final MaterialTextView textViewPermissionsDialog;

  private ActivityPermissionsTutorialBinding(@NonNull FastScrollScrollView rootView,
      @NonNull AdView adView, @NonNull MaterialButton buttonMore,
      @NonNull MaterialCardView cardViewAd, @NonNull MaterialCardView cardViewLottieAnimation,
      @NonNull LinearLayoutCompat linearLayoutViewAd, @NonNull LottieAnimationView lottieAnimation,
      @NonNull FastScrollScrollView scrollView,
      @NonNull MaterialTextView textViewPermissionsBeginning,
      @NonNull MaterialTextView textViewPermissionsDialog) {
    this.rootView = rootView;
    this.adView = adView;
    this.buttonMore = buttonMore;
    this.cardViewAd = cardViewAd;
    this.cardViewLottieAnimation = cardViewLottieAnimation;
    this.linearLayoutViewAd = linearLayoutViewAd;
    this.lottieAnimation = lottieAnimation;
    this.scrollView = scrollView;
    this.textViewPermissionsBeginning = textViewPermissionsBeginning;
    this.textViewPermissionsDialog = textViewPermissionsDialog;
  }

  @Override
  @NonNull
  public FastScrollScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPermissionsTutorialBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPermissionsTutorialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_permissions_tutorial, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPermissionsTutorialBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_view;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.button_more;
      MaterialButton buttonMore = ViewBindings.findChildViewById(rootView, id);
      if (buttonMore == null) {
        break missingId;
      }

      id = R.id.card_view_ad;
      MaterialCardView cardViewAd = ViewBindings.findChildViewById(rootView, id);
      if (cardViewAd == null) {
        break missingId;
      }

      id = R.id.card_view_lottie_animation;
      MaterialCardView cardViewLottieAnimation = ViewBindings.findChildViewById(rootView, id);
      if (cardViewLottieAnimation == null) {
        break missingId;
      }

      id = R.id.linear_layout_view_ad;
      LinearLayoutCompat linearLayoutViewAd = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutViewAd == null) {
        break missingId;
      }

      id = R.id.lottie_animation;
      LottieAnimationView lottieAnimation = ViewBindings.findChildViewById(rootView, id);
      if (lottieAnimation == null) {
        break missingId;
      }

      FastScrollScrollView scrollView = (FastScrollScrollView) rootView;

      id = R.id.text_view_permissions_beginning;
      MaterialTextView textViewPermissionsBeginning = ViewBindings.findChildViewById(rootView, id);
      if (textViewPermissionsBeginning == null) {
        break missingId;
      }

      id = R.id.text_view_permissions_dialog;
      MaterialTextView textViewPermissionsDialog = ViewBindings.findChildViewById(rootView, id);
      if (textViewPermissionsDialog == null) {
        break missingId;
      }

      return new ActivityPermissionsTutorialBinding((FastScrollScrollView) rootView, adView,
          buttonMore, cardViewAd, cardViewLottieAnimation, linearLayoutViewAd, lottieAnimation,
          scrollView, textViewPermissionsBeginning, textViewPermissionsDialog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
