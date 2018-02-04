package com.example.android.jaysyurahman_1202154199_si3907;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends Activity {

    //Element Attribut
    private TextView namaTempat, namaMakanan, jumlahPorsi, HargaMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaTempat = (TextView)findViewById(R.id.tempatMakan);
        namaMakanan = (TextView)findViewById(R.id.namaMakanan);
        jumlahPorsi = (TextView)findViewById(R.id.jumlahPorsi);
        HargaMakanan = (TextView)findViewById(R.id.harga);

        Intent n = getIntent();
        String idtempat, nama, porsi;
        int uang;

        idtempat = n.getStringExtra(MainActivity.idTempat);
        nama = n.getStringExtra(MainActivity.makananNama);
        porsi = n.getStringExtra(MainActivity.porsiJumlah);
        uang = Integer.parseInt(n.getStringExtra(MainActivity.UANG));
        String tempat = "";
        long harga = 0;
        if(idtempat.equals("1")){
            tempat = "Eatbus";
            harga = 50000;
            harga = harga*Integer.parseInt(porsi);
        }else if(idtempat.equals("2")){
            tempat = "Abnormal";
            harga = 30000;
            harga = harga*Integer.parseInt(porsi);
        }

        if(harga<=uang){
            Toast.makeText(this,"Duit lu cukup kok. Makan disini aja",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Lu lagi bokek, jangan makan disini.",Toast.LENGTH_LONG).show();
        }
        namaTempat.setText(tempat);
        namaMakanan.setText(nama);
        jumlahPorsi.setText(porsi);
        HargaMakanan.setText(""+harga);
    }


    public void tutup(View view){

        finish();
    }
}
