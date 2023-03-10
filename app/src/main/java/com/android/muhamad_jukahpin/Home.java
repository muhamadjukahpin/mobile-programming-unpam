package com.android.muhamad_jukahpin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView textEmail;
    TextView textPassword;
    String sEmail;
    String sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);

        sEmail = getIntent().getExtras().getString("email");
        sPassword = getIntent().getExtras().getString("password");

        textEmail.setText("Email : " + sEmail);
        textPassword.setText("Password : "+ sPassword);
    }
}