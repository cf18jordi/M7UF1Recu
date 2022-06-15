package com.example.appm7recuperacio.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appm7recuperacio.R;
import com.example.appm7recuperacio.Weather;


import java.util.ArrayList;

public class AdapterToday extends RecyclerView.Adapter<AdapterToday.ViewHolder>{
    private ArrayList<Weather> arrayList;

    public AdapterToday(ArrayList<Weather> arr){
        this.arrayList = arr;
    }

    @NonNull
    @Override
    public AdapterToday.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemtoday, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterToday.ViewHolder holder, int position) {

        holder.txtMoment.setText(arrayList.get(position).getDay());
        /*imageView = findViewbyId(R.id.imageView);
        String temps = findImageName(R.id.imageView);
        if(name.equals(snow))
        {

        }
        else{
            //do something
        }*/
        //holder.imageView.setImageDrawable(arrayList.get(position).());
        holder.txtPercent2.setText(arrayList.get(position).getPercent());
        holder.txtTemp2.setText(arrayList.get(position).getTemp_min());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtMoment, txtPercent2, txtTemp2, txtTemps;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMoment = itemView.findViewById(R.id.txtMoment);
            imageView = itemView.findViewById(R.id.imageView);
            txtPercent2 = itemView.findViewById(R.id.txtPercent2);
            txtTemp2 = itemView.findViewById(R.id.txtTemp2);

        }
    }

}

