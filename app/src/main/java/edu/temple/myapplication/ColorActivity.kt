package edu.temple.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val colors = arrayOf(
            "Gray",
            "Magenta",
            "Yellow",
            "Red",
            "Purple",
            "Black",
            "Blue",
            "Green",
            "Cyan",
            "White"
        )

        val adapter = ColorAdapter(this, colors)

        spinner.adapter = adapter

        spinner.setSelection(0,false)
        val eventListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cd = spinner.getChildAt(0).background as ColorDrawable
                val colorCode = cd.color
                spinner.getChildAt(0).setBackgroundColor(Color.WHITE)
                findViewById<View>(R.id.main_layout).setBackgroundColor(colorCode)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }

        spinner.onItemSelectedListener = eventListener

    }
}