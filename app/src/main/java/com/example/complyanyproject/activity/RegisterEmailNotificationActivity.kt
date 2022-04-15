package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R

class RegisterEmailNotificationActivity : AppCompatActivity() {

    lateinit var etSelectEntity: TextView
    lateinit var backButton : LinearLayout
    lateinit var imgFilter : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email_notification)

        etSelectEntity = findViewById(R.id.etSelectEntity)
        backButton = findViewById(R.id.backButton)
        imgFilter = findViewById(R.id.imgFilter)

        etSelectEntity.setOnClickListener {
            Toast.makeText(this, "Selecting Entity", Toast.LENGTH_SHORT).show()
        }

        backButton.setOnClickListener {
            finish()
        }

        imgFilter.setOnClickListener {
            Toast.makeText(this, "clicked Save....", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}