package com.example.ekin.simplelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button backButton = null;
    private Button relativeOneButton = null;
    private Button relativeTwoButton = null;
    private Button backMainButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeOneButton = findViewById(R.id.relative_one_button);
        relativeOneButton.setOnClickListener(this);
        relativeTwoButton = findViewById(R.id.relative_two_button);
        relativeTwoButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.back_button: {
                View view = getLayoutInflater().inflate(R.layout.activity_main, null);
                setContentView(view);
                relativeOneButton = findViewById(R.id.relative_one_button);
                relativeOneButton.setOnClickListener(this);
                relativeTwoButton = findViewById(R.id.relative_two_button);
                relativeTwoButton.setOnClickListener(this);
                break;
            }

            case R.id.backmain_button: {
                View view = getLayoutInflater().inflate(R.layout.activity_main, null);
                setContentView(view);
                relativeOneButton = findViewById(R.id.relative_one_button);
                relativeOneButton.setOnClickListener(this);
                relativeTwoButton = findViewById(R.id.relative_two_button);
                relativeTwoButton.setOnClickListener(this);
                break;
            }

            case R.id.relative_one_button: {
                View view = getLayoutInflater().inflate(R.layout.relativelayout, null);
                setContentView(view);
                backButton = findViewById(R.id.back_button);
                backButton.setOnClickListener(this);
                break;
            }

            case R.id.relative_two_button: {
                View view = getLayoutInflater().inflate(R.layout.relativeone_layout, null);
                setContentView(view);
                backMainButton = findViewById(R.id.backmain_button);
                backMainButton.setOnClickListener(this);
            }
        }
    }
}
