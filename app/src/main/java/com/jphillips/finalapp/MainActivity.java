package com.jphillips.finalapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void goToReigster(View view){
        //Create an Intent in order to launch the Reigster Activity
        Intent intent= new Intent(getApplicationContext(), RegisterNow.class);

        startActivity(intent);
    }

    public void goToRegister(View view){
        Intent intent= new Intent(getApplicationContext(), RegisterNow.class);
    }

    public void goToManage(View view){}
        Intent intent= new Intent(getApplicationContext(), ManageActivity.class);

    public void tryLogin(View view){
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.jphillips.sharedpreferences", Context.MODE_PRIVATE);

        EditText usernameEditText = (EditText) findViewById(R.id.emailText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordText);

        String username = usernameEditText.getText().toString();
        String passwordEntered = passwordEditText.getText().toString();

        String passwordStored= sharedPreferences .getString(username,"");

        Log.i("Info", "Username is:"+username);
        Log.i("Info", "Password entered is"+passwordEntered);
        Log.i("Info", "Password store is:"+passwordStored);

        if (passwordStored.equals(passwordEntered)){
            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            goToManage(view);
        }

    }

        EditText usernameEditText= (EditText) findViewById(R.id.emailText);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.jphillips.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("test@test.com", "password").apply();
    }
}