package com.example.android.jaysyurahman_1202154199_si3907;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String idTempat = "com.example.android.jaysyurahman_1202154199_si3907.extra.ID_TEMPAT";
    public final static String UANG = "com.example.android.jaysyurahman_1202154199_si3907.extra.UANG";

    public final static String makananNama = "com.example.android.jaysyurahman_1202154199_si3907.extra.MAKANAN_NAMA";
    public final static String porsiJumlah = "com.example.android.jaysyurahman_1202154199_si3907.extra.PORSI_JUMLAH";

    //Element Attribut
    private EditText txtNamaMakanan, txtJumlahPorsi;
    private String namaMakanan;
    private int jumlahPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaMakanan = (EditText)findViewById(R.id.namaMakanan);
        txtJumlahPorsi = (EditText)findViewById(R.id.jumlahPorsi);
    }

    public void setMenu(String id){
        Intent n = new Intent(this,Main2Activity.class);

        namaMakanan = txtNamaMakanan.getText().toString();
        jumlahPorsi = Integer.parseInt(txtJumlahPorsi.getText().toString());

        String nama = namaMakanan;
        int porsi = jumlahPorsi;

        n.putExtra(idTempat,id);
        n.putExtra(makananNama,nama);
        n.putExtra(porsiJumlah,""+porsi);
        n.putExtra(UANG,"65000");
        startActivity(n);
    }


    public void eatbus(View view){
        setMenu("1");
    }

    public void abnormal(View view){
        setMenu("2");
    }
}
