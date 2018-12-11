package com.example.ekin.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox = null;
    private TextView checkBoxText = null;
    private Switch mswitch = null;
    private TextView switchText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.mcheckbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    checkBoxText.setText("Check Box is checked");
                } else {
                    checkBoxText.setText("Check Box is not checked");

                }
            }
        });
        checkBoxText = findViewById(R.id.mcheckboxText);

        mswitch = findViewById(R.id.mswitch);
        mswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    switchText.setText("Switch ON");
                } else {
                    switchText.setText("Switch OFF");
                }
            }
        });
        switchText = findViewById(R.id.switchText);
    }
}
