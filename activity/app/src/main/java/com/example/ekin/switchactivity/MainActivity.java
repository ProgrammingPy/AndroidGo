package com.example.ekin.switchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText = null;
    public static final String REQUEST_RESULT="REQUEST_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSwitchActivity(View view) {
        editText = (EditText)findViewById(R.id.editText);
        String text = editText.getText().toString();
        Intent intent = new Intent(this, SecnodActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        //startActivity(intent);
        startActivityForResult(intent, 55);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 55) {
            Toast.makeText(this, Integer.toString(
                    data.getIntExtra(REQUEST_RESULT, 0)
            ), Toast.LENGTH_LONG).show();
        }
    }
}
