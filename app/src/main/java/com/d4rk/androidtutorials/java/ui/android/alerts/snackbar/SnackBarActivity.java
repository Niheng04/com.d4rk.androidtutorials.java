package com.d4rk.androidtutorials.java.ui.android.alerts.snackbar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.d4rk.androidtutorials.java.R;
import com.d4rk.androidtutorials.java.databinding.ActivitySnackBarBinding;
import com.google.android.material.snackbar.Snackbar;
public class SnackBarActivity extends AppCompatActivity {
    private ActivitySnackBarBinding binding;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySnackBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v -> {
            Snackbar snackbar = Snackbar.make(binding.getRoot(), R.string.this_is_a_snackbar, Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction(android.R.string.ok, v1 -> snackbar.dismiss());
            snackbar.show();
        });
        binding.floatingButtonShowSyntax.setOnClickListener(v -> startActivity(new Intent(this, SnackBarCodeActivity.class)));
        handler.postDelayed(() -> binding.floatingButtonShowSyntax.shrink(), 5000);
    }
}