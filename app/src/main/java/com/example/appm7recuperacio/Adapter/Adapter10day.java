package com.example.appm7recuperacio.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appm7recuperacio.Weather;

import java.util.ArrayList;

public class Adapter10day  extends RecyclerView.Adapter<Adapter10day.ViewHolder>{

    public Adapter10day(ArrayList<Weather> tenday_prediction) {

    }

    @NonNull
    @Override
    public Adapter10day.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter10day.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

}

