package edu.temple.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val colors = arrayOf("Gray", "Magenta", "Yellow", "Red", "Purple")

        val adapter = ColorAdapter(this, colors)

        spinner.adapter = adapter

        val eventListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }

        spinner.onItemSelectedListener = eventListener

    }
}