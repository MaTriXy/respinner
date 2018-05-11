package com.santalu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.santalu.respinner.ReSpinner;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final ReSpinner spinner = findViewById(R.id.spinner);

    ArrayList<String> items = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      items.add(String.format("Item %s", i));
    }

    spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    spinner.setOnItemClickListener((adapterView, view, i, l) -> {
      String message = String.format("%s clicked", adapterView.getSelectedItem());
      Log.v("DEBUG", message);
      Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    });

    //this will call onItemClick
    //spinner.setSelection(3);

    //this will not call onItemClick
    //spinner.setSelection(3, false);
  }
}
