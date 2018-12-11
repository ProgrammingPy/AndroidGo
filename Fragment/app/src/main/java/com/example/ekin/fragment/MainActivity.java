package com.example.ekin.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private static int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Button点击事件1",Toast.LENGTH_LONG).show();
                android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();

                if (1 == (count % 2)) {
                    ButtomFragment buttomFragment = new ButtomFragment();
                    transaction.add(R.id.layout, buttomFragment).commit();
                } else {
                    TopFragment topFragment = new TopFragment();
                    transaction.add(R.id.layout, topFragment).commit();
                }
                count++;
            }
        });

        //ButtomFragment fm = new ButtomFragment();
        //getSupportFragmentManager().beginTransaction(R.id.layout, fm).commit();
        /*
        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment f1 = new Fragment();
                ft.add(R.id.top_fragment, f1);
                ft.commit();
            }
        });*/
    }
}
