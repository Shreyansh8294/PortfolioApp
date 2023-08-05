package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEducation = findViewById<Button>(R.id.button3)

        buttonEducation.setOnClickListener{
            intent= Intent(this,educationView::class.java)
            startActivity(intent)
            Toast.makeText(this@MainActivity, "Education Details", Toast.LENGTH_SHORT).show()
        }


        val buttonAchievements = findViewById<Button>(R.id.button4)

        buttonAchievements.setOnClickListener{
            intent=Intent(this,achievements::class.java)
            startActivity(intent)
            Toast.makeText(this@MainActivity, "Achievements", Toast.LENGTH_SHORT).show()
        }

        val buttonSkill= findViewById<Button>(R.id.btnSkills)

        buttonSkill.setOnClickListener{
            Toast.makeText(this@MainActivity,"Skills",Toast.LENGTH_SHORT).show()
        }

        val buttonWork= findViewById<Button>(R.id.button5)

        buttonWork.setOnClickListener{
            Toast.makeText(this@MainActivity,"Work",Toast.LENGTH_SHORT).show()
        }

    }
}