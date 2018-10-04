package com.lontoc.august;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void processSecond (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.prev2) {
            i = new Intent(this, FirstActivity.class);
            startActivity(i);
        }
    }
}
