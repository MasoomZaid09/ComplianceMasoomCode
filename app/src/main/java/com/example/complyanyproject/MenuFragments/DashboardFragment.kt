package com.example.complyanyproject.MenuFragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.DetailsActivity

class DashboardFragment : Fragment() {

    lateinit var profileBtn : ImageView
    lateinit var btnViewReports : Button
//    lateinit var spinnerDashboardFragment: Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_dashboard, container, false)

//        val compliance_options = resources.getStringArray(R.array.compliance_options)
//        val arrayAdapter = ArrayAdapter(this, R.layout.fragment_dashboard)

        profileBtn = view.findViewById(R.id.toolbarProfileIcon)
        btnViewReports = view.findViewById(R.id.btnViewReports)
//        spinnerDashboardFragment = view.findViewById(R.id.spinnerDashboardFragment)

        profileBtn.setOnClickListener {
            Intent(activity as Context, DetailsActivity::class.java).also{
                startActivity(it)
            }
        }

        btnViewReports.setOnClickListener {
            Toast.makeText(context, "Clicked on View Reports", Toast.LENGTH_SHORT).show()
        }



        return view
    }

}