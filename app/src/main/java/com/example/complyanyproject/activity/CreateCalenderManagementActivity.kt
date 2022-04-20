package com.example.complyanyproject.activity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityCreateCalenderManagementBinding
import java.util.*

class CreateCalenderManagementActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateCalenderManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCalenderManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backCalenderManagement.setOnClickListener {
            onBackPressed()
        }

        binding.saveCalenderManagement.setOnClickListener {
            Toast.makeText(this, "saved...", Toast.LENGTH_LONG).show()
            finish()
        }

        // added drop down code
        val numbers = resources.getStringArray(R.array.numbers)
        val adapter = ArrayAdapter(this, R.layout.dropdown_list, numbers)
        binding.financialFromAutoComplete1.setAdapter(adapter)


        // added calender picker code
        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtDate.text = "$date-${month + 1}-$year"

        binding.imgDate.setOnClickListener {

            val datePickerDialog = this?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        

    }

    override fun onBackPressed() {
        finish()
    }
}