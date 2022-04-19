package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.complyanyproject.R

class CreateSubDepartmentActivity : AppCompatActivity() {

    lateinit var saveSubDepartment : ImageView
    lateinit var txtSelectDeparmentName : TextView
    lateinit var checkDepartmentName : TextView
    lateinit var SelectSubDepartmentName : EditText
    lateinit var checkSubDepartmentName : TextView
    lateinit var backCreateSubDepartment : TextView
    lateinit var selectDepartment : RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_sub_department)

        saveSubDepartment = findViewById(R.id.saveSubDepartment)
        txtSelectDeparmentName = findViewById(R.id.txtSelectDeparmentName)
        checkDepartmentName = findViewById(R.id.checkDepartmentName)
        SelectSubDepartmentName = findViewById(R.id.SelectSubDepartmentName)
        checkSubDepartmentName = findViewById(R.id.checkSubDepartmentName)
        backCreateSubDepartment = findViewById(R.id.backCreateSubDepartment)
        selectDepartment = findViewById(R.id.selectDepartment)


        saveSubDepartment.setOnClickListener{

            if (txtSelectDeparmentName.text.toString().isEmpty()){
                checkDepartmentName.text = "*Select Department"
            }
            else if(SelectSubDepartmentName.text.toString().isEmpty()){
                checkDepartmentName.text =""
                checkSubDepartmentName.text = "*Please enter Client Sub Group Name"
            }
            else {
                checkDepartmentName.text = ""
                checkSubDepartmentName.text = ""

                Toast.makeText(this,"successfully Created...", Toast.LENGTH_SHORT).show()
                Intent(this, SubDepartmentActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }


        backCreateSubDepartment.setOnClickListener{
            onBackPressed()
        }
//
        selectDepartment.setOnClickListener {
            Intent(this, ListSubDepartmentActivity::class.java).also {
                startActivity(it)
            }

        }

        var receiver_msg: TextView? = null

        receiver_msg = findViewById(R.id.txtSelectDeparmentName)

        val intent = intent

        val str = intent.getStringExtra("message_key")

        with(receiver_msg) {

            this?.text = str.toString()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}