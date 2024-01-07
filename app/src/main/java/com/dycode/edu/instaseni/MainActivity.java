package com.dycode.edu.instaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    final EditText editTextPassword = findViewById(R.id.editTextPassword);

    public void login(View view) {
        Intent intent = new Intent(MainActivity.this, profile.class);
        startActivity(intent);
    }

    public void REGISTER(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }
}