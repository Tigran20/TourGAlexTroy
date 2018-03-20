package com.alextroy.tourguidealextroy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.alextroy.tourguidealextroy.R;
import com.alextroy.tourguidealextroy.model.Attraction;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Attraction> attractions;

    public RecyclerAdapter(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int index) {
        final Attraction attr = attractions.get(index);

        holder.attrName.setText(attr.getName());
        holder.attrRating.setRating(attr.getRating());
        holder.attrImage.setImageResource(attr.getImageResourceId());
        holder.attrDesc.setText(attr.getDescription());
    }

    @Override
    public int getItemCount() {
        return attractions.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView attrName;
        private final ImageView attrImage;
        private final RatingBar attrRating;
        private final TextView attrDesc;

        private ViewHolder(View view) {
            super(view);
            attrName = view.findViewById(R.id.attraction_name);
            attrImage = view.findViewById(R.id.attraction_image);
            attrRating = view.findViewById(R.id.attraction_rating);
            attrDesc = view.findViewById(R.id.attraction_desc);
        }
    }
}
