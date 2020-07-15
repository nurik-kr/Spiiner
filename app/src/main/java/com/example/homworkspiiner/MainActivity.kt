package com.example.homworkspiiner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Cities = resources.getStringArray(R.array.Cities)
        val tvCity = findViewById<TextView>(R.id.tvCity)

        // access the spinner
        val spCity = findViewById<Spinner>(R.id.spCity)
        if (spCity != null) {
            val adapter = ArrayAdapter(
                this, android.R.layout.simple_spinner_item, Cities
            )
            spCity.adapter = adapter

            spCity.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    tvCity.text = "Selected : "+Cities.get(position)
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
    }
}