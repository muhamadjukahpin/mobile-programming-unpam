package com.android.muhamad_jukahpin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListFruitBaseAdapter extends BaseAdapter {
    Context context;
    String listFruitName[];
    int listFruitImage[];
    LayoutInflater inflater;

    public CustomListFruitBaseAdapter(Context ctx, String[] listFruitName, int[] listFruitImage) {
        this.context = ctx;
        this.listFruitName = listFruitName;
        this.listFruitImage = listFruitImage;
        this.inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listFruitName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view_fruit, null);
        TextView textViewFruit = (TextView) convertView.findViewById(R.id.textViewFruit);
        ImageView imageViewFruit = (ImageView) convertView.findViewById(R.id.imageViewFruit);

        textViewFruit.setText(listFruitName[position]);
        imageViewFruit.setImageResource(listFruitImage[position]);

        return convertView;
    }
}
