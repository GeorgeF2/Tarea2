package com.iteso.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    Button cartB;
    boolean cartIsAdded;
    String colorConstant = "color";
    String sizeConstant =  "size";
    String cartConstant = "cart";
    int colorS;
    int sizeS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartB = findViewById(R.id.activity_main_cart);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt(colorConstant, colorS);
        outState.putInt(sizeConstant, sizeS);
        outState.putInt(cartConstant, cartIsAdded ? 1 : 0);
    }

    public void Color(View v){

    }

    public void Like(View v){
        Toast.makeText(this, R.string.like, Toast.LENGTH_LONG).show();
    }

    public void Size(View v){

    }

    public void Cart(View v){
        if(cartIsAdded){
            Toast.makeText(this, R.string.added_toast, Toast.LENGTH_LONG).show();
        }
        else{
            cartIsAdded = true;
            cartB.setText(R.string.added);
            Toast.makeText(this, R.string.added, Toast.LENGTH_LONG).show();
        }
    }
}
