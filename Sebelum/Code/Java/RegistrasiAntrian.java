package com.example.tugasproyek;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrasiAntrian extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbhelper;
    Button submit;
    EditText namaPasien, noTelp;
    TextView txt1;
    String namaRS;
    Integer noAntrian;
    Integer[] noAntrianArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_antrian);

        dbhelper = new DataHelper(this);
        namaRS = getIntent().getStringExtra("namaRS");
        namaPasien = (EditText) findViewById(R.id.namaPasien);
        noTelp = (EditText) findViewById(R.id.noHPPasien);
        txt1 = findViewById(R.id.judulRS);
        txt1.setText(namaRS);

        lihatAntrian();

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db2 = dbhelper.getWritableDatabase();
                db2.execSQL("insert into antrianRS(namaRS, namaPasien, noHpPasien, noAntrian) values " +
                        "( '" + namaRS +
                        "', '" + namaPasien.getText().toString() +
                        "', '" + noTelp.getText().toString() +
                        "', '" + noAntrian + "');");

                Intent a = new Intent(getBaseContext(), Antrian.class);
                a.putExtra("namapasien", namaPasien.getText().toString());
                a.putExtra("namaRS", namaRS);
                a.putExtra("noAntrian", String.valueOf(noAntrian));
                startActivity(a);
            }
        });
    }

    public void lihatAntrian(){
        SQLiteDatabase db1 = dbhelper.getReadableDatabase();
        cursor = db1.rawQuery("SELECT noAntrian FROM antrianRS WHERE namaRS = '"+ namaRS +"' ORDER BY idAntrian DESC LIMIT 1", null);
        noAntrianArr = new Integer[cursor.getCount()];
        for (int cc = 0; cc < cursor.getCount(); cc++) {
            cursor.moveToPosition(cc);
            noAntrianArr[cc] = cursor.getInt(0);
        }

        noAntrian = noAntrianArr[0] + 1;
    }
}