package com.sample.samplemessaging;

import com.google.firebase.messaging.FirebaseMessaging;

import com.sample.samplemessaging.databinding.ActivityMainBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        binding.setFirebaseModel(new FirebaseModel(this));
        FirebaseMessaging.getInstance().subscribeToTopic("hello");
    }
}
