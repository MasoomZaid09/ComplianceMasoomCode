package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCountryCompanyBinding
import com.example.complyanyproject.databinding.ActivityCountryRegionCompanyBinding
import com.example.complyanyproject.databinding.ActivityGlobalCompanyBinding

class CountryCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCountryCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backCountryCompany.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}