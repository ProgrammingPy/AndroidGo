package com.example.ekin.switchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecnodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnod);
        TextView textView = (TextView)findViewById(R.id.textViewText);
        if (getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)) {
            textView.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
    }

    public void onClickClose(View view) {
        Intent intent = new Intent();
        intent.putExtra(MainActivity.REQUEST_RESULT, 33);
        setResult(RESULT_OK, intent);
        finish();
    }
}
