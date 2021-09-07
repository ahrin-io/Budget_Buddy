package com.example.comp380_budgetbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ValidCodePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valid_code_page);
    }

    //Intent for starting the reset password sequence
    public void startResetPass(View view) {
        Intent intent = new Intent(this, ResetPassPage.class);
        startActivity(intent);
    }
}
