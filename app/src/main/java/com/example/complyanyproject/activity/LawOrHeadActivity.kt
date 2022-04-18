package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityLawOrHeadBinding

class LawOrHeadActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLawOrHeadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLawOrHeadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backLawOrHead.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}