package com.example.tugas2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil);

        TextView txtNama     = findViewById(R.id.tv_nama);
        TextView txtNim      = findViewById(R.id.tv_nim);
        TextView txtNilai = findViewById(R.id.tv_nilai);

        Bundle extras = getIntent().getExtras();

        String nama = extras.getString("Nama");
        txtNama.setText(String.format(": %s", nama));

        String nim = extras.getString("NIM");
        txtNim.setText(String.format(": %s", nim));

        String hasil = extras.getString("Hasil");
        txtNilai.setText(String.format(": %s", hasil));
    }
}
