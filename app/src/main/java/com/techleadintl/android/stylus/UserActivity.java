package com.techleadintl.android.stylus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techleadintl.android.stylus.login.AndroidClass;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        AndroidClass androidClass = new AndroidClass();
        androidClass.setCurrentSalary(50);

    }
}