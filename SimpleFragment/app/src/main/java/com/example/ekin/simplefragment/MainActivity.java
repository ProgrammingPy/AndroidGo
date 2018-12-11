package com.example.ekin.simplefragment;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button page1Button = null;
    private Button page2Button = null;
    private Button page3Button = null;
    private String TAG = "SimpleFragment";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        page1Button = (Button)findViewById(R.id.button_page1);
        page1Button.setOnClickListener(this);
        page2Button = (Button)findViewById(R.id.button_page2);
        page2Button.setOnClickListener(this);
        page3Button = (Button)findViewById(R.id.button_page3);
        page3Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.button_page1: {
                Log.d(TAG, "button 1 fragment");
                trans.replace(R.id.fragment_id, new FragmentOne());
                trans.commit();
                break;
            }

            case R.id.button_page2: {
                trans.replace(R.id.fragment_id, new FragmentTwo());
                trans.commit();
                break;
            }

            case R.id.button_page3: {
                trans.replace(R.id.fragment_id, new FragmentThree());
                trans.commit();
                break;
            }
        }
    }
}
