// Generated by view binder compiler. Do not edit!
package com.d4rk.androidtutorials.java.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.d4rk.androidtutorials.java.R;
import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FragmentContainerView navHostFragmentActivityMain;

  @NonNull
  public final BottomNavigationView navView;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull AdView adView,
      @NonNull ConstraintLayout container,
      @NonNull FragmentContainerView navHostFragmentActivityMain,
      @NonNull BottomNavigationView navView, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.adView = adView;
    this.container = container;
    this.navHostFragmentActivityMain = navHostFragmentActivityMain;
    this.navView = navView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_view;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.nav_host_fragment_activity_main;
      FragmentContainerView navHostFragmentActivityMain = ViewBindings.findChildViewById(rootView, id);
      if (navHostFragmentActivityMain == null) {
        break missingId;
      }

      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, adView, container,
          navHostFragmentActivityMain, navView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
