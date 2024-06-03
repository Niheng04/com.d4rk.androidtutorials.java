// Generated by view binder compiler. Do not edit!
package com.d4rk.androidtutorials.java.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.d4rk.androidtutorials.java.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySnackBarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton button;

  @NonNull
  public final ExtendedFloatingActionButton floatingButtonShowSyntax;

  private ActivitySnackBarBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton button,
      @NonNull ExtendedFloatingActionButton floatingButtonShowSyntax) {
    this.rootView = rootView;
    this.button = button;
    this.floatingButtonShowSyntax = floatingButtonShowSyntax;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySnackBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_snack_bar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySnackBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      MaterialButton button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.floating_button_show_syntax;
      ExtendedFloatingActionButton floatingButtonShowSyntax = ViewBindings.findChildViewById(rootView, id);
      if (floatingButtonShowSyntax == null) {
        break missingId;
      }

      return new ActivitySnackBarBinding((ConstraintLayout) rootView, button,
          floatingButtonShowSyntax);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
