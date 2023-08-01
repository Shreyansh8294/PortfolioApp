package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEducation = findViewById<Button>(R.id.button3)

        buttonEducation.setOnClickListener{
            intent= Intent(this,educationView::class.java)
            startActivity(intent)
        }
        val buttonAchievements = findViewById<Button>(R.id.button4)

        buttonAchievements.setOnClickListener{
            intent=Intent(this,achievements::class.java)
            startActivity(intent)
        }
    }
}