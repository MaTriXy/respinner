package com.santalu.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.spinner

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val items = ArrayList<String>()
    for (i in 0..10) {
      items.add("Item $i")
    }

    spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
    spinner.setOnItemClickListener { parent, view, position, id ->
      Toast.makeText(
        this,
        "${parent.selectedItem} clicked",
        Toast.LENGTH_SHORT
      ).show()
    }

    // this will trigger onItemClick
    // spinner.setSelection(3)

    // this will not trigger onItemClick
    // spinner.setSelection(3, false)
  }
}
