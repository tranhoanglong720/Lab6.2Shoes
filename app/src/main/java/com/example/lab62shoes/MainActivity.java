package com.example.lab62shoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragShoes fragShoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragShoes=new FragShoes();
       getSupportFragmentManager().beginTransaction().add(R.id.frmshoes, fragShoes).commit();
    }
}