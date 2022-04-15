package com.example.complyanyproject.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ViewPagerAdapter
import com.example.complyanyproject.databinding.ActivityLoginBinding
import com.example.complyanyproject.fragment.BusinessPartnerFragment
import com.example.complyanyproject.fragment.UserFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupTabs()
        changeColorTextView()
    }

    private fun setupTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.getFragment(UserFragment(), "User")
        adapter.getFragment(BusinessPartnerFragment(), "Business Partner")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

    // added colors in textView
    private fun changeColorTextView() {
        val mText = binding.txtSupport.text.toString()

        val mSpannableString = SpannableString(mText)
        val mBlue = ForegroundColorSpan(resources.getColor(R.color.grey))

        mSpannableString.setSpan(mBlue, 10, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.txtSupport.text = mSpannableString
    }

    override fun onBackPressed() {
        finish()
    }

}