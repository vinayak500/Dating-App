package com.example.dating_app_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseRegistrationLoginActivity extends AppCompatActivity {
Button login;
Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_registration_login);

        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(ChooseRegistrationLoginActivity.this , LoginActivity.class);
                 startActivity(intent);
                 finish();
                 return;
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseRegistrationLoginActivity.this , RegistrationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

    }
}