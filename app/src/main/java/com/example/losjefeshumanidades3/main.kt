package com.example.losjefeshumanidades3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCap1 = findViewById<Button>(R.id.buttonc1)
        val buttonCap2 = findViewById<Button>(R.id.buttonc2)
        val buttonCap3 = findViewById<Button>(R.id.buttonc3)
        val buttonCap4 = findViewById<Button>(R.id.buttonc4)


        buttonCap1.setOnClickListener { v: View? ->
            startActivity(
                Intent(
                    this,
                    Cap1Activity::class.java
                )
            )
        }
        buttonCap2.setOnClickListener { v: View? ->
            startActivity(
                Intent(
                    this,
                    Cap2Activity::class.java
                )
            )
        }

        }
    }
