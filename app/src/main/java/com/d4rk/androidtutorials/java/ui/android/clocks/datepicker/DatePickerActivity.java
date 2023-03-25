package com.d4rk.androidtutorials.java.ui.android.clocks.datepicker;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.d4rk.androidtutorials.java.databinding.ActivityDatePickerBinding;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class DatePickerActivity extends AppCompatActivity {
    private ActivityDatePickerBinding binding;
    private final Handler handler = new Handler();
    private final Calendar calendar = Calendar.getInstance();
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        updateDateInView();
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, monthOfYear, dayOfMonth) -> {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDateInView();
        };
        binding.changeDateButton.setOnClickListener(v -> new DatePickerDialog(DatePickerActivity.this,
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)).show());
        binding.floatingButtonShowSyntax.setOnClickListener(v -> startActivity(new Intent(DatePickerActivity.this,
                DatePickerCodeActivity.class)));
        handler.postDelayed(() -> binding.floatingButtonShowSyntax.shrink(), 5000);
    }
    private void updateDateInView() {
        binding.dateTextView.setText(dateFormat.format(calendar.getTime()));
    }
}