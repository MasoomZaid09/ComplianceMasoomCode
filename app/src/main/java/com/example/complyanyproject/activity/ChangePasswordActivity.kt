package com.example.complyanyproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.backChangePassword.setOnClickListener {
            onBackPressed()
        }

        // validations
        binding.btnUpdate.setOnClickListener {
            val oldPass = binding.etOldPass.text.toString().trim()
            val newPass = binding.etNewPass.text.toString().trim()
            val confirmPass = binding.etConfirmNewPass.text.toString().trim()

            val checkPass = "^" +
                    "(?=.*[0-9])" +   // at least 1 digit
                    "(?=.*[a-zA-Z])" +   // any letter
                    "(?=.*[@#$%^&+=])" +  // at least 1 spacial character
                    "(?=\\S+$)" +    // no white space
                    ".{8,}" +        // at least 8 character
                    "$"

            if (oldPass.isEmpty()){
                binding.txtOldPassword.visibility = View.VISIBLE
                binding.txtOldPassword.text = "Required"
            }
            else if (newPass.isEmpty()){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.visibility = View.VISIBLE
                binding.txtNewPassword.text = "Required"
            }
            else if (oldPass == newPass){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.text = "New password must me different"
            }
            else if(newPass.length < 8){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.text = "Password must contain at least 8 characters"
            }
            else if (!newPass.matches(checkPass.toRegex())){
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.text = "Password must contain a special character"
            }
            else if(confirmPass.isEmpty()){
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.VISIBLE
                binding.txtConfirmNewPassword.text = "Required"
            }
            else if (confirmPass != newPass){
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.VISIBLE
                binding.txtConfirmNewPassword.text = "New password and confirm password must be same"
            }
            else{
                // hide tv textViews
                binding.txtOldPassword.visibility = View.GONE
                binding.txtNewPassword.visibility = View.GONE
                binding.txtConfirmNewPassword.visibility = View.GONE

                // empty tv texts
                binding.txtOldPassword.text = ""
                binding.txtNewPassword.text = ""
                binding.txtConfirmNewPassword.text = ""

                // remove texts from edit text
                binding.etOldPass.text.clear()
                binding.etNewPass.text.clear()
                binding.etConfirmNewPass.text.clear()

                Toast.makeText(this, "Password Updated...", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}