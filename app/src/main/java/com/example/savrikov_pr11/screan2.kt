package com.example.savrikov_pr11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screan2)

        val btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            val intent = Intent(this, screan3 :: class.java)
            startActivity(intent)
        }
    }
}