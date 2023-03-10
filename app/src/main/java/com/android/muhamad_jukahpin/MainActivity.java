package com.android.muhamad_jukahpin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText email;
    EditText password;
    String sEmail, sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Home.class);

                sEmail = email.getText().toString();
                sPassword = password.getText().toString();

                i.putExtra("email", sEmail);
                i.putExtra("password", sPassword);

                startActivity(i);
                finish();
            }
        });
    }
}
