package com.example.complyanyproject.subscriptionTabs

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.ListSubDepartmentActivity
import com.example.complyanyproject.databinding.ActivitySubscriptionBinding
import com.example.complyanyproject.databinding.ActivitySubscriptionSettingBinding
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

class SubscriptionSettingActivity : AppCompatActivity() {


    private lateinit var binding : ActivitySubscriptionSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubscriptionSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)



        /////////////////professinals///////////////////////
        binding.btnProfessional.setBackgroundColor(Color.parseColor("#003B79"))
        binding.btnProfessional.setTextColor(Color.parseColor("#FFFFFF"))
        binding.btnBusiness.setBackgroundColor(Color.parseColor("#FFFFFF"))
        binding.btnBusiness.setTextColor(Color.parseColor("#000000"))
        binding.btnEnterprise.setBackgroundColor(Color.parseColor("#FFFFFF"))
        binding.btnEnterprise.setTextColor(Color.parseColor("#000000"))
        binding.btnIndividual.setBackgroundColor(Color.parseColor("#FFFFFF"))
        binding.btnIndividual.setTextColor(Color.parseColor("#000000"))


        // added clicks on professionals
        binding.btnProfessional.setOnClickListener {
            binding.btnProfessional.setBackgroundColor(Color.parseColor("#003B79"))
            binding.btnProfessional.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnBusiness.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnBusiness.setTextColor(Color.parseColor("#000000"))
            binding.btnEnterprise.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnEnterprise.setTextColor(Color.parseColor("#000000"))
            binding.btnIndividual.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnIndividual.setTextColor(Color.parseColor("#000000"))

            binding.llProfessional.visibility = View.VISIBLE
            binding.llBusiness.visibility = View.GONE
            binding.llEnterprise.visibility = View.GONE
            binding.llIndivisual.visibility = View.GONE
        }

        // added clicks on business
        binding.btnBusiness.setOnClickListener {
            binding.btnBusiness.setBackgroundColor(Color.parseColor("#003B79"))
            binding.btnBusiness.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setTextColor(Color.parseColor("#000000"))
            binding.btnIndividual.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnIndividual.setTextColor(Color.parseColor("#000000"))
            binding.btnEnterprise.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnEnterprise.setTextColor(Color.parseColor("#000000"))

            binding.llProfessional.visibility = View.GONE
            binding.llBusiness.visibility = View.VISIBLE
            binding.llEnterprise.visibility = View.GONE
            binding.llIndivisual.visibility = View.GONE
        }

        // added clicks on enterprise
        binding.btnEnterprise.setOnClickListener {
            binding.btnEnterprise.setBackgroundColor(Color.parseColor("#003B79"))
            binding.btnEnterprise.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setTextColor(Color.parseColor("#000000"))
            binding.btnIndividual.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnIndividual.setTextColor(Color.parseColor("#000000"))
            binding.btnBusiness.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnBusiness.setTextColor(Color.parseColor("#000000"))

            binding.llProfessional.visibility = View.GONE
            binding.llBusiness.visibility = View.GONE
            binding.llEnterprise.visibility = View.VISIBLE
            binding.llIndivisual.visibility = View.GONE
        }

        // added clicks on indivisuals
        binding.btnIndividual.setOnClickListener {
            binding.btnIndividual.setBackgroundColor(Color.parseColor("#003B79"))
            binding.btnIndividual.setTextColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnProfessional.setTextColor(Color.parseColor("#000000"))
            binding.btnEnterprise.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnEnterprise.setTextColor(Color.parseColor("#000000"))
            binding.btnBusiness.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnBusiness.setTextColor(Color.parseColor("#000000"))

            binding.llProfessional.visibility = View.GONE
            binding.llBusiness.visibility = View.GONE
            binding.llEnterprise.visibility = View.GONE
            binding.llIndivisual.visibility = View.VISIBLE

        }

        // added clicks on back
        binding.backSubscription.setOnClickListener {
            onBackPressed()
        }

        // added clicks on upgrade button
        binding.btnUpgrade.setOnClickListener {
            Toast.makeText(this, "Upgraded...", Toast.LENGTH_SHORT).show()
        }

        // added clicks on search button
        binding.btnSearch.setOnClickListener {

            val search = binding.etTransactionSearch.text.toString().trim()
            Toast.makeText(this, "Searching $search", Toast.LENGTH_SHORT).show()
        }

        // added clicks on reset button
        binding.btnReset.setOnClickListener {
            Toast.makeText(this, "Reset.", Toast.LENGTH_SHORT).show()
        }

        // added click on select
        binding.txtSelectCity.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also {
                startActivityForResult(it, 1)
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                binding.txtSelectCity.text = data?.getStringExtra("hello")
            }
        }
    }
}