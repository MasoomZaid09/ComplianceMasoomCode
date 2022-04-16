package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.complyanyproject.R

class EmailContactUsActivity : AppCompatActivity() {

    lateinit var userNameEmail: EditText
    lateinit var Helpemail: EditText
    lateinit var subjectEmail: EditText
    lateinit var messageEmail: EditText
    lateinit var backEmailContact: TextView
    lateinit var SubmitBtnEmail: Button
    lateinit var userNameEmail_error: TextView
    lateinit var emailEmail_error: TextView
    lateinit var subjectEmail_error: TextView
    lateinit var messageEmail_error: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_contact_us)

        userNameEmail = findViewById(R.id.userNameEmail)
        Helpemail = findViewById(R.id.Helpemail)
        subjectEmail = findViewById(R.id.subjectEmail)
        messageEmail = findViewById(R.id.messageEmail)
        backEmailContact = findViewById(R.id.backEmailContact)
        SubmitBtnEmail = findViewById(R.id.SubmitBtnEmail)
        userNameEmail_error = findViewById(R.id.userNameEmail_error)
        emailEmail_error = findViewById(R.id.emailEmail_error)
        subjectEmail_error = findViewById(R.id.subjectEmail_error)
        messageEmail_error = findViewById(R.id.messageEmail_error)


        SubmitBtnEmail.setOnClickListener {

            if (userNameEmail.text.toString().isEmpty()) {
                userNameEmail_error.text = "Username is required"


            } else if (Helpemail.text.toString().isEmpty()) {
                userNameEmail_error.text = ""
                emailEmail_error.text = "email is required"

            } else if (subjectEmail.text.toString().isEmpty()) {
                emailEmail_error.text = ""
                subjectEmail_error.text = "Subject is required"

            } else if (messageEmail.text.toString().isEmpty()) {
                subjectEmail_error.text = ""
                messageEmail_error.text = "Message is required"
            } else {
                messageEmail_error.text = ""
                Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()

                Intent(this, HelpContactActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }
        backEmailContact.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}