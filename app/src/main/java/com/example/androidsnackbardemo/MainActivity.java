package com.example.androidsnackbardemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    Button btnShowSnackBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = findViewById(R.id.myCoordinatorLayout);
        btnShowSnackBar = findViewById(R.id.btnShowSnackBar);
        btnShowSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackBar(coordinatorLayout);
            }
        });
    }

    private void showSnackBar(CoordinatorLayout coordinatorLayout){
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "This is a SnackBar", Snackbar.LENGTH_LONG);
        snackbar.show();
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}