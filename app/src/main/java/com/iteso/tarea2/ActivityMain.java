package com.iteso.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Color(View v){

    }

    public void Like(View v){
        Toast.makeText(this, R.string.like, Toast.LENGTH_LONG).show();
    }

    public void Size(View v){

    }
}
