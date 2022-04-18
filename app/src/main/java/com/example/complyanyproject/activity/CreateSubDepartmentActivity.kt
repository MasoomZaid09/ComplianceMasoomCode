package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateClientSubGroupBinding
import com.example.complyanyproject.databinding.ActivityCreateSubDepartmentBinding

class CreateSubDepartmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateSubDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateSubDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveSubDepartment.setOnClickListener{

            if (binding.txtDepartmentName.text.toString().isEmpty()){
                binding.tvCreateSubDepartment.text = "*Select Department"
            }
            else if(binding.SubDepartmentName.text.toString().isEmpty()){
                binding.tvCreateSubDepartment.text =""
                binding.tvSubDepartmentName.text = "*Please enter Client Sub Group Name"
            }
            else {
                binding.tvCreateSubDepartment.text = ""
                binding.tvSubDepartmentName.text = ""

                Toast.makeText(this,"successfully Created...", Toast.LENGTH_SHORT).show()
                Intent(this, SubDepartmentActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }


        binding.backCreateSubDepartment.setOnClickListener{
            onBackPressed()
        }

        binding.selectDepartment.setOnClickListener {
            Intent(this, ListSubDepartmentActivity::class.java).also {
                startActivity(it)
            }

        }
        var receiver_msg: TextView? = null


//        receiver_msg = findViewById(R.id.DepatmentGroup);

        val intent = intent

        val str = intent.getStringExtra("message_key")

        with(binding.txtDepartmentName) {

            this?.text = str.toString()
        }
    }


    override fun onBackPressed() {
        finish()
    }
}