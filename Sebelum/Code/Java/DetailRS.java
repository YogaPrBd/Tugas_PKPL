package com.example.tugasproyek;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailRS extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    ImageButton ton1;
    Button ton2;
    TextView text1, text2, text3;
    String namaRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rs);
        dbHelper = new DataHelper(this);
        text1 = (TextView) findViewById(R.id.namars);
        text2 = (TextView) findViewById(R.id.alamat);
        text3 = (TextView) findViewById(R.id.notelp);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM daftarRS WHERE namaRS LIKE '" + getIntent().getStringExtra("namaRS") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            text1.setText(cursor.getString(1).toString());
            text2.setText(cursor.getString(2).toString());
            text3.setText(cursor.getString(3).toString());
        }
        namaRS = text1.getText().toString();
        ton1 = (ImageButton) findViewById(R.id.back);
        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                finish();
            }
        });

        ton2 = (Button) findViewById(R.id.antri);
        ton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getBaseContext(), RegistrasiAntrian.class);
                        j.putExtra("namaRS", namaRS);
                        startActivity(j);
            }
        });
    }
}