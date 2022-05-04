package com.example.complyanyproject.MenuFragments

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.DetailsActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class DashboardFragment : Fragment() {

    lateinit var barList: ArrayList<BarEntry>
    lateinit var barDataSet: BarDataSet
    lateinit var barData: BarData

    lateinit var profileBtn : ImageView
    lateinit var btnViewReports : Button
    lateinit var barChart1: BarChart
    lateinit var barChart2: BarChart

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_dashboard, container, false)

//        setBarChart()

        profileBtn = view.findViewById(R.id.toolbarProfileIcon)
        btnViewReports = view.findViewById(R.id.btnViewReports)
        barChart1 = view.findViewById(R.id.barChart1)
        barChart2 = view.findViewById(R.id.barChart2)


        profileBtn.setOnClickListener {
            Intent(activity as Context, DetailsActivity::class.java).also{
                startActivity(it)
            }
        }

        btnViewReports.setOnClickListener {
            Toast.makeText(context, "Clicked on View Reports", Toast.LENGTH_SHORT).show()
        }

//        // added drop down code
//        val dashboard_options = resources.getStringArray(R.array.dashboard_options)
//        val adapter = ArrayAdapter(activity as Context, R.layout.dropdown_list, dashboard_options)
//        dashboardDropdown2.setAdapter(adapter)

        // added bar chart static data
        barList = ArrayList()
        barList.add(BarEntry(1f, 0f))
        barList.add(BarEntry(2f, 0f))
        barList.add(BarEntry(3f, 0f))
        barList.add(BarEntry(4f, 100f))
        barList.add(BarEntry(5f, 700f))
        barList.add(BarEntry(6f, 800f))
        barList.add(BarEntry(7f, 0f))
        barList.add(BarEntry(8f, 0f))
        barList.add(BarEntry(9f, 0f))

        barDataSet = BarDataSet(barList, "Static Data Entry")
        barData = BarData(barDataSet)
        barChart1.data = barData
        barChart2.data = barData
//        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS, 250)
        barDataSet.setColors(Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.rgb(199, 70, 55), Color.rgb(3, 59, 2), Color.rgb(253, 24, 19), Color.YELLOW, Color.YELLOW, Color.YELLOW)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 15f
        // adding delay
        barChart1.animateY(5000)
        barChart2.animateY(5000)

        return view
    }

}
