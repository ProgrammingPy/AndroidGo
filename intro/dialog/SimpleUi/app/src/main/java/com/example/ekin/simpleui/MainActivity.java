package com.example.ekin.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {
    private Button oneButton;
    private Button twoButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneButton = findViewById(R.id.one_button);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView = findViewById(R.id.webView);
                webView.loadUrl("http://www.baidu.com");
            }
        });

        twoButton = findViewById(R.id.two_button);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Socket sock = new Socket("192.168.1.80", 8000);
                            //OutputStream os = sock.getOutputStream();
                            PrintWriter os = new PrintWriter(sock.getOutputStream());
                            //os.write("dummy it");
                            JSONObject obj = new JSONObject();
                            obj.put("name", "John");
                            obj.put("sex", "male");
                            obj.put("age", 22);
                            os.write(obj.toString());
                            os.flush();
                            sock.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }).start();
            }
        });

    }
}
