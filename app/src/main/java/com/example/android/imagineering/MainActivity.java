package com.example.android.imagineering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//Initialize ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

//Loading image from below url into imageView
        Glide.with(this)
                .load("http://wallpaperrs.com/uploads/cars/bmw-7-series-3725.jpg")
                .into(imageView);
    }
}
