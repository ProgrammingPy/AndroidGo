package com.example.ekin.simplelistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private static final String[] items = {"one", "two", "three", "four",
        "five", "six", "seven"};
    private TextView selection = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items));
        selection = (TextView)findViewById(R.id.selection);
    }

    @Override
    public void onListItemClick(ListView parent, View v, int pos, long id) {
        selection.setText(items[pos]);
    }
}
