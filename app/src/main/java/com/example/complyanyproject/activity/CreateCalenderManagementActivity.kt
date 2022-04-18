package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateCalenderManagementBinding

class CreateCalenderManagementActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateCalenderManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCalenderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}