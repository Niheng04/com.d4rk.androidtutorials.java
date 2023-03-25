package com.d4rk.androidtutorials.java.ui.android.images;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.d4rk.androidtutorials.java.databinding.ActivityImagesBinding;
public class ImagesActivity extends AppCompatActivity {
    private ActivityImagesBinding binding;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImagesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.floatingButtonShowSyntax.setOnClickListener(v -> startActivity(new Intent(ImagesActivity.this, ImagesCodeActivity.class)));
        handler.postDelayed(() -> binding.floatingButtonShowSyntax.shrink(), 5000);
    }
}