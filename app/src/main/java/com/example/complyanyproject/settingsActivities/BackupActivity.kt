package com.example.complyanyproject.settingsActivities

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.complyanyproject.R
import com.example.complyanyproject.databinding.ActivityBackupBinding
import java.util.*

class BackupActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBackupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBackupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // added back method functionality
        binding.backBackup.setOnClickListener {
            onBackPressed()
        }

        // added clicks on generate button
        binding.btnGenerateBackup.setOnClickListener {
            Toast.makeText(this, "Generated...", Toast.LENGTH_SHORT).show()
            finish()
        }


        // added date picker
        val calendar: Calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)

        binding.txtFromDate.text = "$date-${month + 1}-$year"

        binding.txtToDate.text = "$date-${month + 1}-$year"

        binding.imgFromDate.setOnClickListener {

            val datePickerDialog = this?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtFromDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }

        binding.imgToDate.setOnClickListener {

            val datePickerDialog = this?.let { it1 ->
                DatePickerDialog(
                    it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        binding.txtToDate.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                    }, year, month, date
                )
            }

            datePickerDialog?.show()
        }


        // added drop down code
        val entity_list = resources.getStringArray(R.array.entity_list)
        val adapter = ArrayAdapter(this, R.layout.dropdown_list, entity_list)
        binding.backupDropDown.setAdapter(adapter)


    }

    override fun onBackPressed() {
        finish()
    }
}