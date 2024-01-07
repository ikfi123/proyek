package com.dycode.edu.instaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp);
    }
    public void selesai(View view) {
        Intent intent = new Intent(pp.this, profile.class);
        startActivity(intent);
    }
    public void Logout(View view) {
        Intent intent = new Intent(pp.this, MainActivity.class);
        startActivity(intent);
    }
}