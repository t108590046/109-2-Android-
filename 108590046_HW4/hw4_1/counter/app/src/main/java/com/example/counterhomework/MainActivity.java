package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;
    private Button mCount1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mCount1 = (Button) findViewById(R.id.button_count);
        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState
                    .getBoolean("count_visible");
            if (isVisible) {
                mShowCount.setText(savedInstanceState
                        .getString("count_text"));
                mCount= Integer.parseInt(savedInstanceState.getString("count_text"));
                mShowCount.setVisibility(View.VISIBLE);
            }
        }

    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mShowCount.getVisibility() == View.VISIBLE) {
            outState.putBoolean("count_visible", true);
            outState.putString("count_text", mShowCount.getText().toString());
            Log.d(LOG_TAG, "onSaveInstanceState");
        }
    }

}