package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.databinding.ActivityDepartmentBinding

class DepartmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backDepartment.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
