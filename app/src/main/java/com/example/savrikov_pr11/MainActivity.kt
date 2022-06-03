package com.example.savrikov_pr11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoOver = findViewById<Button>(R.id.btn0);

        btnGoOver.setOnClickListener {
            val intent = Intent(this, screan2 :: class.java)
            startActivity(intent)
        }

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnClickListener {
            val selection = findViewById<TextView>(R.id.selection)
            // Получаем, отмечен ли данный флажок
            if (checkBox.isChecked) {
                selection.text = "Включено"
                checkBox.text = "Выключить"
            } else {
                selection.text = "Выключено"
                checkBox.text = "Включить"
            }
        }

        fun onCheckboxClicked(view: View) {
            // Получаем Функция перехода на другой экран:
            val checkBox = view as CheckBox

        }

    }
}