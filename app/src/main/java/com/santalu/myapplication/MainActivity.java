package com.santalu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.santalu.respinner.ReSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReSpinner spinner = findViewById(R.id.spinner);

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(String.format("Item %s", i));
        }

        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
        spinner.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, String.format("%s clicked", adapterView.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }
        });

        //this will call onItemClick
        //spinner.setSelection(3);

        //this will not call onItemClick
        //spinner.setSelection(3, false);
    }
}
