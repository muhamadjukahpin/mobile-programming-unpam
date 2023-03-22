package com.android.muhamad_jukahpin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    TextView textEmail;
    TextView textPassword;
    String sEmail;
    String sPassword;
    Button btnLogout;
    Boolean login;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        login = getIntent().getExtras().getBoolean("login");

        if (login) {
            Toast toast = Toast.makeText(getApplicationContext(), "Selamat, anda berhasil masuk.", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 500);
            toast.show();
        }

        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);

        sEmail = getIntent().getExtras().getString("email");
        sPassword = getIntent().getExtras().getString("password");

        textEmail.setText("Email : " + sEmail);
        textPassword.setText("Password : " + sPassword);

        // Logout
        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogLogout();
            }
        });
    }

    private void showDialogLogout() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Apakah anda akan keluar ?");
        alertDialogBuilder
                .setMessage("Klik ya untuk keluar")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Jika memilih tombol ya
                        Intent i = new Intent(Home.this, MainActivity.class);

                        i.putExtra("logout", true);

                        startActivity(i);
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Jika memilih tombol tidak
                        Toast toast = Toast.makeText(getApplicationContext(), "Anda masih di dalam halaman ini.", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.TOP, 0, 500);
                        toast.show();

                        dialog.cancel();
                    }
                });

        // Membuat alert dialog dari alert builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}