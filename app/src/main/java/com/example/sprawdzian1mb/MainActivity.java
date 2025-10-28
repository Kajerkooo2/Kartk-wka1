package com.example.sprawdzian1mb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button buttonPrev, buttonNext, buttonOpis;

    private Zdjecia[] zdjecia;

    private int aktualnyIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zdjecia = new Zdjecia[]{
                new Zdjecia(R.drawable.fox, "Ten Lis jest pomarańczowy"),
                new Zdjecia(R.drawable.ghost,"Ten duch ma na imie Kacperek"),
                new Zdjecia(R.drawable.wolf,"To jest szary wilk")
        };


        imageView = findViewById(R.id.imageView);
        buttonPrev = findViewById(R.id.buttonPrev);
        buttonNext = findViewById(R.id.buttonNext);
        buttonOpis = findViewById(R.id.buttonOpis);

        ustawObrazek();


        buttonPrev.setOnClickListener(v -> {
            if(aktualnyIndex != 0) {
                aktualnyIndex--;
                buttonOpis.setVisibility(View.VISIBLE);
            }
            ustawObrazek();
        });

        buttonNext.setOnClickListener(v -> {
            if(aktualnyIndex != 2) {
                aktualnyIndex++;
                buttonOpis.setVisibility(View.VISIBLE);
            }
            ustawObrazek();
        });

        buttonOpis.setOnClickListener(v ->{
            buttonOpis.setVisibility(View.GONE);
            zdjecia[aktualnyIndex].setOpisUsuniety(true);
        });

    }

    private void ustawObrazek() {
        Zdjecia aktualne = zdjecia[aktualnyIndex];
        imageView.setImageResource(aktualne.getObrazekResId());
        buttonOpis.setText(aktualne.getOpis());
        if (aktualne.isOpisUsuniety()){
            buttonOpis.setVisibility((View.GONE));
        }
        else{
            buttonOpis.setVisibility(View.VISIBLE);
        }
    }

}
