package com.dycode.edu.instaseni;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class search extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);
    }

    // ...

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {

        performSearch(query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        return true;
    }

    private void performSearch(String query) {

    }

}