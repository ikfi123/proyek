package com.dycode.edu.instaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void Profile(View view) {
        Intent intent = new Intent(profile.this, pp.class);
        startActivity(intent);
    }
}