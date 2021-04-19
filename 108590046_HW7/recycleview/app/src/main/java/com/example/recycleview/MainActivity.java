package com.example.recycleview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mWordList.addLast("Buttermilk Fried Chicken");
        mWordList2.addLast("Old fashioned, buttermilk marinated, flour coated, crispy, tender fried chicken recipe.");
        mWordList.addLast("Quesadilla Pie");
        mWordList2.addLast("This Quesadilla Pie is an EASY casserole of layers of flour tortillas and shredded cheese, with beans, chiles, tomato, onions, baked in pie dish until browned and crispy. So good!");
        mWordList.addLast("Whiskey Chocolate Truffles");
        mWordList2.addLast("If you have a whiskey lover in your life these chocolate truffles are for you! They are easy to make and store well so whip up a batch and gift them to your favorite whiskey (or chocolate) aficionado.");
        mWordList.addLast("Grilled Korean BBQ Pork Ribs (Dwaeji Galbi)");
        mWordList2.addLast("Korean Barbecue is easy to make at home. A slightly spicy, sweet and salty sauce made with ginger, garlic, gochujang and pineapple juice is used to marinade the pork ribs and provide a final flavor baste just before serving.");
        mWordList.addLast("New England Cioppino");
        mWordList2.addLast("New England Cioppino seafood stew with haddock, lobster, clams, and mussels. Perfect for a casual dinner party!");

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList,mWordList2);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}