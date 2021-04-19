package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class recipes extends AppCompatActivity {

    private ImageView ShowImage;
    private TextView Showtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        int position = getIntent().getIntExtra("position", 0);
        ShowImage = findViewById(R.id.imageView2);
        Showtext = findViewById(R.id.textView);
        switch (position) {
            case 0:
                Showtext.setText(R.string.recipes_1);
                ShowImage.setImageDrawable(getResources().getDrawable(R.drawable.chicken));
                break;
            case 1:
                Showtext.setText(R.string.recipes_2);
                ShowImage.setImageDrawable(getResources().getDrawable(R.drawable.pie));
                break;
            case 2:
                Showtext.setText(R.string.recipes_3);
                ShowImage.setImageDrawable(getResources().getDrawable(R.drawable.chocolate));
                break;
            case 3:
                Showtext.setText(R.string.recipes_4);
                ShowImage.setImageDrawable(getResources().getDrawable(R.drawable.pork));
                break;
            case 4:
                Showtext.setText(R.string.recipes_5);
                ShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup));
                break;

            default:
                break;

        }
    }
}