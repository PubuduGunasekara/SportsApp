package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
// This class is an adapter class
// It's a bridge between your Data (List<Sport>) and the RecyclerView + CardView
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportViewHolder> {

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,
                parent,false);
        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imgView.setImageResource(sport.sportImg);

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imgView;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imgView = itemView.findViewById(R.id.imageViewCard);
        }
    }
}
