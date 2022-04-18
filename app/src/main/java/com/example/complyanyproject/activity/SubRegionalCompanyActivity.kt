package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityGlobalCompanyBinding
import com.example.complyanyproject.databinding.ActivitySubRegionalCompanyBinding

class SubRegionalCompanyActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubRegionalCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubRegionalCompanyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backSubRegionalCompany.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}