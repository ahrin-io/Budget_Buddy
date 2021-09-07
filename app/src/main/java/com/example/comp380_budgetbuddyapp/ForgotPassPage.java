package com.example.comp380_budgetbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPassPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_page);
    }

    //Intent
    public void startValidCodePage(View view) {
        Intent intent = new Intent(this, ValidCodePage.class);
        startActivity(intent);
    }
}
