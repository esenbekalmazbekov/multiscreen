package com.company.multiplescreen.dualpane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.multiplescreen.R
import com.company.multiplescreen.dualpane.fragments.FragmentB

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve data coming from MainActivity.java
        val description = intent.getStringExtra("description")
        val title = intent.getStringExtra("title")

        // Pass the data to FragmentB to display it
        val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
        fragmentB?.displayDetails(title ?: "", description ?: "")
    }
}