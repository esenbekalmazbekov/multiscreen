package com.company.multiplescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.multiplescreen.dualpane.DualPaneActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        phone_or_tablet.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }
        dual_pane.setOnClickListener { startActivity(Intent(this, DualPaneActivity::class.java )) }
    }
}