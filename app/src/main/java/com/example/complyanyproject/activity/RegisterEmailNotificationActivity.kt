package com.example.complyanyproject.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

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
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivityForResult(it, 1)
            }
        }

        backButton.setOnClickListener {
            finish()
        }

        imgFilter.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==  1){
            if (resultCode == Activity.RESULT_OK){
                etSelectEntity.text = data?.getStringExtra("hello")
            }
        }
    }
}