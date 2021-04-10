package com.example.caraoucoroa_activities.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.caraoucoroa_activities.R;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView_back, imageView_coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView_coin.findViewById(R.id.imageView_coin);
        imageView_back.findViewById(R.id.imageView_back);

        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("playKey");

        if (result == 0) {
            imageView_coin.setImageResource(R.drawable.moeda_cara);
        } else {
            imageView_coin.setImageResource(R.drawable.moeda_coroa);
        }

        imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}