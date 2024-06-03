// Generated by view binder compiler. Do not edit!
package com.d4rk.androidtutorials.java.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.d4rk.androidtutorials.java.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.zhanghai.android.fastscroll.FastScrollScrollView;

public final class ActivityRelativeLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton button1;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final ExtendedFloatingActionButton floatingButtonShowSyntax;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final FastScrollScrollView scrollView;

  private ActivityRelativeLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton button1, @NonNull MaterialCardView cardView,
      @NonNull ExtendedFloatingActionButton floatingButtonShowSyntax,
      @NonNull AppCompatImageView imageView, @NonNull FastScrollScrollView scrollView) {
    this.rootView = rootView;
    this.button1 = button1;
    this.cardView = cardView;
    this.floatingButtonShowSyntax = floatingButtonShowSyntax;
    this.imageView = imageView;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRelativeLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRelativeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_relative_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRelativeLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_1;
      MaterialButton button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.card_view;
      MaterialCardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.floating_button_show_syntax;
      ExtendedFloatingActionButton floatingButtonShowSyntax = ViewBindings.findChildViewById(rootView, id);
      if (floatingButtonShowSyntax == null) {
        break missingId;
      }

      id = R.id.image_view;
      AppCompatImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      FastScrollScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      return new ActivityRelativeLayoutBinding((ConstraintLayout) rootView, button1, cardView,
          floatingButtonShowSyntax, imageView, scrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
