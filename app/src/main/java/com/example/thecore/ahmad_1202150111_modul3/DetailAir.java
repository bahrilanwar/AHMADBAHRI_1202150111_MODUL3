package com.example.thecore.ahmad_1202150111_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Intan Gantira on 2/25/2018.
 */

public class DetailAir extends AppCompatActivity {

    private Button plus, minus;
    private ImageView progress, gambar;
    private TextView judul, Detail, Stats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailair);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        progress = findViewById(R.id.isiBatre);

        judul = findViewById(R.id.lblJudul);
        Detail = findViewById(R.id.lblDetail);
        gambar = findViewById(R.id.gambar);
        Stats = findViewById(R.id.Status);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Hayolo\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        judul.setText(title);
        Detail.setText(description);
        gambar.setImageResource(imgRes);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }


    public void tambahIsi(){

        if(level==7){Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
        status();
    }

    public void kurangIsi(){
        if(level<1){Toast.makeText(this,"Air Terlalu Sedikit",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
        status();
    }

    public void status(){ Stats.setText(""+level+" L"); }
}
