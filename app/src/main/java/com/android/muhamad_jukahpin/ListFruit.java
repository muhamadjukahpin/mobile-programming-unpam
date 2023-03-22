package com.android.muhamad_jukahpin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListFruit extends AppCompatActivity {
    String listFruitName[] = {"Apel", "Pisang", "Pepaya", "Jeruk", "Melon", "Semangka", "Alpukat"};
    int listFruitImage[] = {R.drawable.apel, R.drawable.pisang, R.drawable.pepaya, R.drawable.jeruk, R.drawable.melon, R.drawable.semangka, R.drawable.alpukat};

    ListView listViewFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fruit);

        listViewFruit = (ListView) findViewById(R.id.listViewFruit);
        CustomListFruitBaseAdapter customListFruitBaseAdapter = new CustomListFruitBaseAdapter(getApplicationContext(), listFruitName, listFruitImage);

        listViewFruit.setAdapter(customListFruitBaseAdapter);
    }
}