package com.dycode.edu.instaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tambh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambh);
    }
    public void kirim(View view) {
        Intent intent = new Intent(tambh.this, beranda.class);
        startActivity(intent);
    }
}