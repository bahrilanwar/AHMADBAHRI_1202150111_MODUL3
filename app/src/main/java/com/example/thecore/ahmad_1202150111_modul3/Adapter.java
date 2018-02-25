package com.example.thecore.ahmad_1202150111_modul3;

/**
 * Created by Intan Gantira on 2/25/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MineralViewHolder>{

    public ArrayList<Item> data;

    public Adapter(ArrayList<Item> data) {
        this.data = data;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override
    public MineralViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_item, parent, false);
        return new MineralViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MineralViewHolder holder, int position) {
        final  Item item = data.get(position);
        holder.bindTo(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailAir.class);
                go.putExtra("etitle",item.getJudul());
                go.putExtra("edesc",item.getDetail());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MineralViewHolder extends RecyclerView.ViewHolder{

        private TextView mMineralJudul;
        private TextView mMineralInfo;
        private ImageView mMineralImg;
        private Context mContext;
        private Item mCurrentMineral;

        public MineralViewHolder(View itemView) {
            super(itemView);
            mMineralJudul = (TextView)itemView.findViewById(R.id.itemjudul);
            mMineralInfo = (TextView)itemView.findViewById(R.id.itemDeskripsi);
            mMineralImg = (ImageView)itemView.findViewById(R.id.itemMenu);
        }

        public void bindTo(Item mineral){
            mCurrentMineral = mineral;
            mMineralImg.setImageResource(mineral.getGambar());
            mMineralJudul.setText(mineral.getJudul());
            mMineralInfo.setText(mineral.getInfo());
        }
    }
}
