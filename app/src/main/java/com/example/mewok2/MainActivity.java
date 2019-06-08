package com.example.mewok2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void numberClick(View view) {
        Intent numberIntent = new Intent(MainActivity.this, NumberActivity.class);
        startActivity(numberIntent);
    }

    public void familyClick(View view) {
        Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(familyIntent);
    }

    public void colorClick(View view) {
        Intent colorIntent = new Intent(MainActivity.this, ColorActivity.class);
        startActivity(colorIntent);
    }

    public void phrasesClick(View view) {
        Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(phrasesIntent);
    }
}
