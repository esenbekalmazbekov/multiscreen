package com.company.multiplescreen.dualpane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.company.multiplescreen.R
import com.company.multiplescreen.dualpane.fragments.FragmentB
import com.company.multiplescreen.dualpane.helpers.MyCommunicator
import kotlinx.android.synthetic.main.activity_dual_pane.*

class DualPaneActivity : AppCompatActivity() , MyCommunicator {
    private var mIsDualPane = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dual_pane)

        val fragmentBView = findViewById<View>(R.id.fragmentB)
        mIsDualPane = fragmentBView?.visibility == View.VISIBLE
    }

    override fun displayDetails(title: String, description: String) {
        if (mIsDualPane) { // If we are in Tablet
            val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
            fragmentB?.displayDetails(title, description)
        } else { // When we are in Smart phone
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("title", title)
            intent.putExtra("description", description)
            startActivity(intent)
        }
    }
}