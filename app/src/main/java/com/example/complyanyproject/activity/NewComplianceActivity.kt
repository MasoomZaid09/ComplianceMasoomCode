package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityNewComplianceBinding

class NewComplianceActivity : AppCompatActivity() {

    var flag1 = false
    var flag2 = false
    var flag3 = false
    var flag4 = false

    private lateinit var binding : ActivityNewComplianceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewComplianceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method
        binding.backNewComplaince.setOnClickListener {
            onBackPressed()
        }

        // added click on Select Entity option
        binding.selectEntityCreateCompliance.setOnClickListener {

            if (flag1 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.VISIBLE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.GONE

            }
            else{
                flag1 = true
            }
        }

        // added clicks on law and user
        binding.rlSelectLawAndUserLayout.setOnClickListener {

            if (flag2 != true){
                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.VISIBLE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.GONE
            }
            else{
                flag2 = true
            }
        }

        // added clicks on define compliance
        binding.rlSelectDefineComplianceLayout.setOnClickListener {

            if(flag3 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.VISIBLE
                binding.cvReminderLayout.visibility = View.GONE

            }
            else{
                flag3 = true
            }
        }

        // added clicks on reminder and escalation
        binding.rlReminderLayout.setOnClickListener {

            if (flag4 != true){

                binding.selectEntityLayoutCreateCompliance.visibility = View.GONE
                binding.cvSelectLawAndUserCreateCompliance.visibility = View.GONE
                binding.cvDefineComplianceLayout.visibility = View.GONE
                binding.cvReminderLayout.visibility = View.VISIBLE

            }
            else{
                flag4 = true
            }
        }

        // added toasts on every  buttons
        binding.btnReview.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnComplianceDialog.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnAdd.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnRecurring.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnClientSubGroupbutton.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnClientNew.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        binding.btnComplianceType.setOnClickListener {
            Toast.makeText(this, "Clicked...", Toast.LENGTH_SHORT).show()
        }

        // added clicks selector box

    }

    override fun onBackPressed() {
        finish()
    }
}