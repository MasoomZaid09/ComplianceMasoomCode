package com.example.complyanyproject.selectorActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCompanySelectorBinding

class CompanySelectorActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCompanySelectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanySelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backCountry.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}