package com.salihturkoglu.kennyyakalamaoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonBasla.setOnClickListener {
            val intent= Intent(applicationContext,TheKenny::class.java)
            startActivity(intent)
            finish()
        }
    }

}