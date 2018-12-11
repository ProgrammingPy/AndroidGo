package com.example.ekin.dynamicfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    private Button redButton = null;
    private Button greenButton = null;
    private Button blueButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        redButton = findViewById(R.id.red_button);
        redButton.setOnClickListener(this);
        greenButton = findViewById(R.id.green_button);
        greenButton.setOnClickListener(this);
        blueButton = findViewById(R.id.blue_button);
        blueButton.setOnClickListener(this);
    }


    private void repalceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layout, fragment);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red_button:
                repalceFragment(new ButtomRedFragment());
                break;
            case R.id.green_button:
                repalceFragment(new ButtomGreenFragment());
                break;
            case R.id.blue_button:
                repalceFragment(new ButtomBlueFragment());
                break;
        }
    }
}
