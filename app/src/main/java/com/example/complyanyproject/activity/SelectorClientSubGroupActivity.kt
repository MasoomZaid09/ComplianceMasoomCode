package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.complyanyproject.R

class SelectorClientSubGroupActivity : AppCompatActivity() {

    lateinit  var txt1: TextView
    lateinit  var txt2: TextView
    lateinit  var txt3: TextView
    lateinit var backSelector : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selector_client_sub_group)

        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        txt3 = findViewById(R.id.txt3)
        backSelector = findViewById(R.id.backSelector)



        with(txt1) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt1.text.toString()
                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })
        }

        with(txt2) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt2.text.toString()
                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })
        }
        with(txt3) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt3.text.toString()
                val intent = Intent(applicationContext, CreateClientSubGroupActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })
        }

        backSelector.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}