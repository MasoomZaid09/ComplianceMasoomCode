package com.example.complyanyproject.settingsActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.complyanyproject.adapter.SubscriptionViewPager
import com.example.complyanyproject.adapter.ViewPagerAdapter
import com.example.complyanyproject.databinding.ActivitySubscriptionBinding
import com.example.complyanyproject.fragment.BusinessPartnerFragment
import com.example.complyanyproject.fragment.UserFragment
import com.example.complyanyproject.subscriptionTabs.BusinessFragment
import com.example.complyanyproject.subscriptionTabs.EnterpriseFragment
import com.example.complyanyproject.subscriptionTabs.IndivisualFragment
import com.example.complyanyproject.subscriptionTabs.ProfessionalFragment

class SubscriptionActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySubscriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubscriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added tablaouts
        setupTabLayouts()

        // added clicks on back
        binding.backSubscription.setOnClickListener {
            onBackPressed()
        }

        // added clicks on upgrade button
        binding.btnUpgrade.setOnClickListener {
            Toast.makeText(this, "Upgraded...", Toast.LENGTH_SHORT).show()
        }


    }

    override fun onBackPressed() {
        finish()
    }

    fun setupTabLayouts(){
        val adapter = SubscriptionViewPager(supportFragmentManager)
        adapter.getFragment(ProfessionalFragment(), "Professional")
        adapter.getFragment(BusinessFragment(), "Business")
        adapter.getFragment(EnterpriseFragment(), "Enterprise")
        adapter.getFragment(IndivisualFragment(), "Indivisual")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}