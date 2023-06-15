package com.hasnatjanirafin.chinesefood;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedPrefs";
    private static final String RATING_KEY = "rating";

    private FoodItem foodItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);


        Intent intent = getIntent();
        foodItem = (FoodItem) intent.getSerializableExtra("foodItem");


        ImageView foodImage = findViewById(R.id.foodImage);
        TextView foodName = findViewById(R.id.foodName);
        TextView foodDescription = findViewById(R.id.foodDescription);


        foodImage.setImageResource(foodItem.getImageResourceId());
        foodName.setText(foodItem.getName());
        foodDescription.setText(foodItem.getDescription());


        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        float rating = sharedPreferences.getFloat(RATING_KEY + foodItem.getName(), 0);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(rating);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float newRating, boolean fromUser) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putFloat(RATING_KEY + foodItem.getName(), newRating);
                editor.apply();
            }
        });

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }
}
