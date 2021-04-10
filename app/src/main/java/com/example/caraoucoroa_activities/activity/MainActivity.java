package com.example.caraoucoroa_activities.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.caraoucoroa_activities.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button_play ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_play = findViewById(R.id.button);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                int result = new Random().nextInt(2);
                intent.putExtra("playKey", result);
                startActivity(intent);

            }
        });


//        button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//
//                // Passar dados
//                intent.putExtra("chaveNome", "eddie");
//                intent.putExtra("chaveCPF", "07793700902");
//
//                startActivity(intent);
//
//            }
//        });

    }
}