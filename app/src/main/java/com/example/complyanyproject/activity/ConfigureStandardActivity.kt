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
import com.example.complyanyproject.selectorActivity.CompanySelectorActivity

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

        
        // added clicks on Standard compliance select option
        // added clicks on global region
        binding.rlSelectGlobalRegion.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on global sub regions
        binding.rlSelectGlobalSubRegion.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on country office
        binding.rlCountyOffice.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on entity name
        binding.rlEntityName.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on applicable laws select option
        // added clicks on income tax
        binding.rlSelectIncomeTax1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }
        binding.rlSelectIncomeTax2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }
        binding.rlSelectIncomeTax3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on good and service
        binding.rlSelectGoodsAndService1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectGoodsAndService2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on labour law
        binding.rlSelectLabourLaw.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also {
                startActivity(it)
            }
        }

        // added clicks on corporate law
        binding.rlSelectCorporateLaw.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on state professional tax
        binding.rlSelectStateProfessionalTax.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added click on assign user and department select option
        // added clicks on Income Tax
        binding.rlSelectIncomeTax11.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectIncomeTax12.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectIncomeTax13.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Goods and Services
        binding.rlSelectGoodsAndService111.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectGoodsAndService12.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectGoodsAndService13.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }


        // added clicks on Companies act
        binding.rlSelectCompaniesAct1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectCompaniesAct2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectCompaniesAct3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on profident fund act
        binding.rlSelectProfidentFundAct1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectProfidentFundAct2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectProfidentFundAct3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        // added clicks on Employe state insurance
        binding.rlSelectEmployeesStateInsurance1.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectEmployeesStateInsurance2.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

        binding.rlSelectEmployeesStateInsurance3.setOnClickListener {
            Intent(this, CompanySelectorActivity::class.java).also{
                startActivity(it)
            }
        }

    }

    override fun onBackPressed() {
        finish()
    }
}