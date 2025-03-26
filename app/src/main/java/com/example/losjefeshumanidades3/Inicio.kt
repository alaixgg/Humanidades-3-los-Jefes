package com.example.losjefeshumanidades3

import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent



class Inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val buttonCap1 = findViewById<Button>(R.id.buttonind)
        buttonCap1.setOnClickListener {
            val intent = Intent(this, main::class.java)
            startActivity(intent)
        }
        val buttonmenu = findViewById<Button>(R.id.buttonmenu)
        buttonCap1.setOnClickListener {
            val intent = Intent(this, ResumenActivity::class.java)
            startActivity(intent)
        }
    }
}