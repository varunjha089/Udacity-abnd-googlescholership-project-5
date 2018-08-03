package com.example.bharatmk257.guide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.MyViewHolder> {
    private Context mContext;
    private List<Places> placesList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nameOfPlace,locate;
        public ImageView imageOfPlace;

        public MyViewHolder(View view){
            super(view);
            nameOfPlace = (TextView) view.findViewById(R.id.name_of_place);
            locate = (Button) view.findViewById(R.id.locate_button);
            imageOfPlace = (ImageView) view.findViewById(R.id.image_of_place);
        }
    }

    public PlaceAdapter(Context mContext, List<Places> placesList){
        this.mContext = mContext;
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_card,parent,false);
        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Places places = placesList.get(position);
        holder.nameOfPlace.setText(places.getNameOfPlace());

        //loading images
        Glide.with(mContext).load(places.getImageOfPlace()).into(holder.imageOfPlace);
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

}

