package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View view) {

        CheckBox checkBox1 =findViewById(R.id.checkBox3);
        CheckBox checkBox2 =findViewById(R.id.checkBox4);
        CheckBox checkBox3 =findViewById(R.id.checkBox5);
        CheckBox checkBox4 =findViewById(R.id.checkBox6);
        CheckBox checkBox5 =findViewById(R.id.checkBox7);
        String output="Toppings: ";
        if(checkBox1.isChecked()){
            output+="Chocolate syrup ";
        }
        if(checkBox2.isChecked()){
            output+="Sprinkles ";
        }
        if(checkBox3.isChecked()){
            output+="Crushed nuts ";
        }
        if(checkBox4.isChecked()){
            output+="Cherries ";
        }
        if(checkBox5.isChecked()){
            output+="Orio cookie crumbles ";
        }


        displayToast(output);

    }
    public void displayToast(String message) {
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
    }
}