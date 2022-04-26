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
    lateinit var dashboardDropdown1: AutoCompleteTextView
    lateinit var dashboardDropdown2: AutoCompleteTextView
    lateinit var dashboardDropdown3: AutoCompleteTextView

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
        dashboardDropdown1 = view.findViewById(R.id.dashboardDropdown1)
        dashboardDropdown2 = view.findViewById(R.id.dashboardDropdown2)
        dashboardDropdown3 = view.findViewById(R.id.dashboardDropdown3)

        profileBtn.setOnClickListener {
            Intent(activity as Context, DetailsActivity::class.java).also{
                startActivity(it)
            }
        }

        btnViewReports.setOnClickListener {
            Toast.makeText(context, "Clicked on View Reports", Toast.LENGTH_SHORT).show()
        }

        // added drop down code
        val dashboard_options = resources.getStringArray(R.array.dashboard_options)
        val adapter = ArrayAdapter(activity as Context, R.layout.dropdown_list, dashboard_options)
        dashboardDropdown2.setAdapter(adapter)

        barList = ArrayList()
        barList.add(BarEntry(1f, 500f))
        barList.add(BarEntry(2f, 100f))
        barList.add(BarEntry(3f, 300f))
        barList.add(BarEntry(4f, 800f))
        barList.add(BarEntry(5f, 400f))
        barList.add(BarEntry(6f, 1000f))
        barList.add(BarEntry(7f, 800f))
        barDataSet = BarDataSet(barList, "Static Data Entry")
        barData = BarData(barDataSet)
        barChart1.data = barData
        barChart2.data = barData
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS, 250)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 15f
        barChart1.animateY(5000)
        barChart2.animateY(5000)

        return view
    }

//    private fun setBarChart() {
//        val entries = ArrayList<BarEntry>()
//        entries.add(BarEntry(8f, 0f))
//        entries.add(BarEntry(2f, 1f))
//        entries.add(BarEntry(5f, 2f))
//        entries.add(BarEntry(20f, 3f))
//        entries.add(BarEntry(15f, 4f))
//        entries.add(BarEntry(19f, 5f))
//
//        val barDataSet = BarDataSet(entries, "Employees")
//
//        val labels = ArrayList<String>()
//        labels.add("18-Jan")
//        labels.add("19-Jan")
//        labels.add("20-Jan")
//        labels.add("21-Jan")
//        labels.add("22-Jan")
//        labels.add("23-Jan")
//        val data = BarData(labels, barDataSet)
//        barChart1.data = data // set the data and list of tables into chart
//
//        barChart1.setDescription("Set Bar Chart Description") // set the description
//
////        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS)
//        barDataSet.color = resources.getColor(R.color.colorAccent)
//
//        barChart1.animateY(5000)
//
//    }

}
