package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_hasil = findViewById(R.id.btn_hasil);
        EditText etnama = findViewById(R.id.nama);
        EditText etnim = findViewById(R.id.nim);
        EditText etnilai = findViewById(R.id.nilai);

        btn_hasil.setOnClickListener(v -> {
            try {


                String sNama = etnama.getText().toString();
                String sNIM = etnim.getText().toString();
                String sNilai = etnilai.getText().toString();
                Intent i = new Intent(MainActivity.this, Hasil.class);
                i.putExtra("Nama", sNama);
                i.putExtra("NIM", sNIM);


                double nilai = Double.parseDouble(sNilai);
                if (nilai <= 4) {
                    if (nilai == 1) {
                        i.putExtra("Hasil", "D");
                    } else if (nilai <= 1.33) {
                        i.putExtra("Hasil", "D+");
                        ;
                    } else if (nilai <= 1.66) {
                        i.putExtra("Hasil", "C-");
                        ;
                    } else if (nilai <= 2) {
                        i.putExtra("Hasil", "C");
                        ;
                    } else if (nilai <= 2.33) {
                        i.putExtra("Hasil", "C+");
                        ;
                    } else if (nilai <= 2.66) {
                        i.putExtra("Hasil", "B-");
                        ;
                    } else if (nilai <= 3) {
                        i.putExtra("Hasil", "B");
                        ;
                    } else if (nilai <= 3.33) {
                        i.putExtra("Hasil", "B+");
                        ;
                    } else if (nilai <= 3.66) {
                        i.putExtra("Hasil", "A-");
                        ;
                    } else if (nilai <= 4) {
                        i.putExtra("Hasil", "A");
                        ;
                    }
                    startActivity(i);
                } else {
                    Toast.makeText(getApplication(), "Nilai tidak boleh di atas 4.00!", Toast.LENGTH_SHORT).show();
                }
            }catch (Exception e){
                e.printStackTrace();
                Toast.makeText(getApplication(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
            }



        });
    }


}
