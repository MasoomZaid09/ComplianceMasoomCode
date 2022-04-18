package com.example.complyanyproject.activity

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCountryCompanyBinding
import com.example.complyanyproject.databinding.ActivityEntityBinding

class EntityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEntityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backEntity.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
