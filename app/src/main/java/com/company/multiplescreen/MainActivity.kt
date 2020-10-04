package com.company.multiplescreen

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(this, "We are in portrait Mode", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "We are in landscape Mode", Toast.LENGTH_SHORT).show()
            }
        }
    }
}