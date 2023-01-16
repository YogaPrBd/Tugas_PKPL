package com.example.tugasproyek;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class Antrian extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbhelper;
    String namaPs, namars, noAntri;
    TextView namaPasien, noAntrian, namaRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        namaPs = getIntent().getStringExtra("namapasien");
        namars = getIntent().getStringExtra("namaRS");
        noAntri = getIntent().getStringExtra("noAntrian");
        setContentView(R.layout.activity_antrian);
        namaRS = (TextView) findViewById(R.id.namaRS);
        namaPasien = (TextView) findViewById(R.id.namaPasien);
        noAntrian = (TextView) findViewById(R.id.noAntrian);

        namaPasien.setText(namaPs);
        namaRS.setText(namars);
        noAntrian.setText(noAntri);
    }
}