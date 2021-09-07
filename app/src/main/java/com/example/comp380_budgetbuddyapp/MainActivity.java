package com.example.comp380_budgetbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Intent for starting the sign up page
    public void startSignUp(View view) {
        Intent intent = new Intent(this, SignUpPage.class);
        startActivity(intent);
    }

    //Intent for starting the reset password sequence
    public void startForgotPass(View view) {
        Intent intent = new Intent(this, ForgotPassPage.class);
        startActivity(intent);
    }
}
