package com.example.complyanyproject.activity

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCalenderManagementBinding

class CalenderManagementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalenderManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalenderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addCalenderManagement.setOnClickListener {
            Intent(this, CreateCalenderManagementActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.backCalenderManagement.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

}