package com.d4rk.androidtutorials.java.ui.android.basics.shortcuts.tabs;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.d4rk.androidtutorials.java.databinding.ActivityShortcutsCodeBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import me.zhanghai.android.fastscroll.FastScrollerBuilder;
public class CodeShortcutsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityShortcutsCodeBinding binding = ActivityShortcutsCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MobileAds.initialize(this);
        binding.adView.loadAd(new AdRequest.Builder().build());
        new FastScrollerBuilder(binding.scrollView).useMd2Style().build();
    }
}