package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<ModelClass> {

    public MyAdapter(@NonNull Context context, ArrayList<ModelClass> modelArrayList) {
        super(context,0, modelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View viewList = convertView;
        if(viewList == null){
            viewList = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_item,parent, false);
        }
        ModelClass modelClass = getItem(position);
        TextView textView = viewList.findViewById(R.id.gridTextView);
        ImageView imageView = viewList.findViewById(R.id.gridImageView);

        textView.setText(modelClass.getTextView());
        imageView.setImageResource(modelClass.getImageView());

        return viewList;
    }
}
