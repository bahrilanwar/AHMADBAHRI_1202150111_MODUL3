package com.example.thecore.ahmad_1202150111_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Intan Gantira on 2/25/2018.
 */

public class ListAir extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter mAdapter;

    public static ArrayList<Item> DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listair);

        DATA = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList);
        mAdapter = new Adapter(DATA);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<Item> isi(){
        ArrayList<Item> data = new ArrayList<>();
        data.add(new Item("Aqua","Ini adalah air minum merk AQUA","PT. Tirta Investama",R.drawable.aqua));
        data.add(new Item("Amidis","Ini adalah air minum merk AMIDIS","PT. Amidis Tirta Mulia",R.drawable.amidis));
        data.add(new Item("Cleo","Ini adalah air minum merk CLEO","PT. Sariguna Primatirta",R.drawable.cleo));
        data.add(new Item("Club","Ini adalah air minum merk CLUB","PT. Tirta Sukses Perkasa",R.drawable.club));
        data.add(new Item("Equil","Ini adalah air minum merk EQUIL","PT. Equilindo Lestari",R.drawable.equil));
        data.add(new Item("Evian","Ini adalah air minum merk EVIAN","PT. Tirta Investama",R.drawable.evian));
        data.add(new Item("Le Minerale","Ini adalah air minum merk LE MINERALE","PT. Tirta Fresindo Jaya",R.drawable.leminerale));
        data.add(new Item("Nestle","Ini adalah air minum merk NESTLE","PT. Nestle Indonesia",R.drawable.nestle));
        data.add(new Item("Pristine","Ini adalah air minum merk PRISTINE","PT. Sinarmas Cakrawala Persada",R.drawable.pristine));
        data.add(new Item("Vit","Ini adalah air minum merk VIT","PT. Tirta Yakin Sejahtera",R.drawable.vit));
        return data;
    }
}


