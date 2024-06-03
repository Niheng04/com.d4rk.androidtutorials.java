package com.d4rk.androidtutorials.java.ui.android.notifications.simple;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.d4rk.androidtutorials.java.R;
import com.d4rk.androidtutorials.java.databinding.ActivityNotificationBinding;
public class SimpleNotificationActivity extends AppCompatActivity {
    private final String simpleChannelId = "simple_notification";
    private final int simpleNotificationId = 1;
    private ActivityNotificationBinding binding;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonShowNotification.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 1);
            }
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            NotificationChannel simpleChannel = new NotificationChannel(simpleChannelId, "Simple Notifications", NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(simpleChannel);
            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, simpleChannelId)
                    .setSmallIcon(R.drawable.ic_notification_important)
                    .setContentTitle("Title")
                    .setContentText("Look! You've added notifications to your app!")
                    .setAutoCancel(true);
            notificationManager.notify(simpleNotificationId, notificationBuilder.build());
        });
        binding.floatingButtonShowSyntax.setOnClickListener(v -> startActivity(new Intent(this, SimpleNotificationCodeActivity.class)));
        handler.postDelayed(() -> binding.floatingButtonShowSyntax.shrink(), 5000);
    }
}