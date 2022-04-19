package com.example.complyanyproject.fragment

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.ForgetPasswordActivity
import com.example.complyanyproject.activity.MainActivity
import com.example.complyanyproject.activity.UserActivity
import com.example.complyanyproject.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        val view = binding.root

        changeColorTextView()

        // added clicks on continue
        binding.btnContinue.setOnClickListener {

            val phoneNumber = binding.etPhone.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()

//            val checkPass = "^" +
//                    "(?=.*[0-9])" +   // at least 1 digit
//                    "(?=.*[a-zA-Z])" +   // any letter
//                    "(?=.*[@#$%^&+=])" +  // at least 1 spacial character
//                    "(?=\\S+$)" +    // no white space
//                    ".{8,}" +        // at least 8 character
//                    "$"

            if (phoneNumber.length < 10) {

                binding.etPhone.setError("Please enter valid number")
            }else if (email.isEmpty()) {

                binding.etEmail.setError("Please enter email address")
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                binding.etEmail.setError("Please enter valid email address")
            }else {

                binding.btnContinue.visibility = View.GONE
                binding.etPass.visibility = View.VISIBLE
                binding.btnLogin.visibility = View.VISIBLE
            }
        }

        binding.btnLogin.setOnClickListener {
            val pass = binding.etPass.text.toString().trim()
            val phoneNumber = binding.etPhone.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()

//            val checkPass = "^" +
//                    "(?=.*[0-9])" +   // at least 1 digit
//                    "(?=.*[a-zA-Z])" +   // any letter
//                    "(?=.*[@#$%^&+=])" +  // at least 1 spacial character
//                    "(?=\\S+$)" +    // no white space
//                    ".{8,}" +        // at least 8 character
//                    "$"

            if (phoneNumber.length < 10) {

                binding.etPhone.setError("Please enter valid number")
            }else if (email.isEmpty()) {

                binding.etEmail.setError("Please enter email address")
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                binding.etEmail.setError("Please enter valid email address")
            }

            else if(pass.length < 8) {

            binding.etPass.setError("Password contains atleast 8 characters")

            }else{

                binding.etPhone.text.clear()
                binding.etEmail.text.clear()
                binding.etPass.text.clear()

                Intent(context, MainActivity::class.java).also {
                    startActivity(it)
                }
            }

        }

        binding.txtForgotPassword.setOnClickListener {
            Intent(context, ForgetPasswordActivity::class.java).also {
                startActivity(it)
            }
        }
        return view
    }

    private fun changeColorTextView() {
        val mText = binding.txtTerms.text.toString()

        val mSpannableString = SpannableString(mText)
        val mBlue = ForegroundColorSpan(resources.getColor(R.color.blue))

        mSpannableString.setSpan(mBlue, 32, 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.txtTerms.text = mSpannableString
    }

}