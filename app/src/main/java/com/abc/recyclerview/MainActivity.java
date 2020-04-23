package com.abc.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generics
        List<Source> imageList = new ArrayList<>();//composicion y polimorfismo

        imageList.add(new SourceMau("Image 1", R.drawable.imagen1,"Name1"));
        imageList.add(new SourceMau("Image 2", R.drawable.imagen2, "Name2"));
        imageList.add(new SourceMau("Image 3", R.drawable.imagen3, "Name3"));
        imageList.add(new SourceMau("Image 4", R.drawable.imagen4, "Name4"));
        imageList.add(new SourceMau("Mi foto", R.drawable.yop, "Mauricio"));

        RecyclerView container = findViewById(R.id.container);

        container.setItemViewCacheSize(20);
        container.setDrawingCacheEnabled(true);
        container.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        container.setAdapter(new Adapter(imageList));
        container.setLayoutManager(layout);
    }
}
