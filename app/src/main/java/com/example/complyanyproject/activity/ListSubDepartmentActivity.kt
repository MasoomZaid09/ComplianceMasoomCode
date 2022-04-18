package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.complyanyproject.R

class ListSubDepartmentActivity : AppCompatActivity() {

    lateinit  var txt1: TextView
    lateinit  var txt2: TextView
    lateinit  var txt3: TextView
    lateinit var Back: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sub_department)


        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        txt3 = findViewById(R.id.txt3)
        Back = findViewById(R.id.backClientGroupName)

        Back.setOnClickListener{
            onBackPressed()
        }

        with(txt1) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt1.text.toString()
                val intent = Intent(applicationContext, CreateSubDepartmentActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })
        }

        with(txt2) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt2.text.toString()
                val intent = Intent(applicationContext, CreateSubDepartmentActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })
        }
        with(txt3) {
            this?.setOnClickListener(View.OnClickListener {

                val str = txt3.text.toString()
                val intent = Intent(applicationContext, CreateSubDepartmentActivity::class.java)
                intent.putExtra("message_key", str)
                startActivity(intent)
                finish()
            })


        }

    }

    override fun onBackPressed() {
        finish()
    }

}