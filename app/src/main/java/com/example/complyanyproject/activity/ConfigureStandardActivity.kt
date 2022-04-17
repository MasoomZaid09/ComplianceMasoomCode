package com.example.complyanyproject.activity

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityConfigureStandardBinding

class ConfigureStandardActivity : AppCompatActivity() {

    private lateinit var binding : ActivityConfigureStandardBinding

    // Buttons
    lateinit var btnNextStandardCompilance : Button
    lateinit var btnNextApplicableLaws : Button
    lateinit var btnBackAssignUserAndDepartment : Button

    // card view as layout
    lateinit var cvAssignUserLayout : CardView
    lateinit var cvAppilicableLayout : CardView

    // textview
    lateinit var backStandardComplience : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfigureStandardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Buttons
        btnNextStandardCompilance = findViewById(R.id.btnNextStandardCompilance)
        btnNextApplicableLaws = findViewById(R.id.btnNextApplicableLaws)
        btnBackAssignUserAndDepartment = findViewById(R.id.btnBackAssignUserAndDepartment)

        // card view
        cvAssignUserLayout = findViewById(R.id.cvAssignUserLayout)
        cvAppilicableLayout = findViewById(R.id.cvAppilicableLayout)

        // adding back btn method
        backStandardComplience = findViewById(R.id.backStandardComplience)
        backStandardComplience.setOnClickListener {
            onBackPressed()
        }

        // added clicks on standard next
        btnNextStandardCompilance.setOnClickListener {
            cvAppilicableLayout.visibility = View.VISIBLE
            cvAssignUserLayout.visibility = View.GONE
        }

        // added clicks on applicable law next
        btnNextApplicableLaws.setOnClickListener {
            cvAppilicableLayout.visibility = View.GONE
            cvAssignUserLayout.visibility = View.VISIBLE
        }

        // added clicks on Assign user back
        btnBackAssignUserAndDepartment.setOnClickListener {
            cvAssignUserLayout.visibility = View.GONE
            cvAppilicableLayout.visibility = View.VISIBLE
        }

    }

    override fun onBackPressed() {
        finish()
    }
}