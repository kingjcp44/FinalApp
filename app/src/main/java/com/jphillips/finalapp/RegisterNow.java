package com.jphillips.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterNow extends AppCompatActivity {

    public void goToCancel(View view){
        Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reigister_now);
    }
}
