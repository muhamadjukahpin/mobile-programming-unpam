package com.android.muhamad_jukahpin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText email;
    EditText password;
    String sEmail, sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("logout", false)) {
            Toast toast = Toast.makeText(getApplicationContext(), "Anda berhasil keluar.", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 500);
            toast.show();
        }

        login = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Home.class);

                sEmail = email.getText().toString();
                sPassword = password.getText().toString();

                if (sEmail.contentEquals("admin@gmail.com") && sPassword.contentEquals("admin123")) {
                    i.putExtra("email", sEmail);
                    i.putExtra("password", sPassword);
                    i.putExtra("login", true);

                    startActivity(i);
                    finish();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Email atau Password yang anda masukkan salah.", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 500);
                    toast.show();
                }
            }
        });
    }
}
