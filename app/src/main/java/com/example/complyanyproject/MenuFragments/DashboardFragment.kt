package com.example.complyanyproject.MenuFragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.complyanyproject.R
import com.example.complyanyproject.activity.DetailsActivity
import com.example.complyanyproject.activity.RegisterEmailNotificationActivity

class DashboardFragment : Fragment() {

    lateinit var profileBtn : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_dashboard, container, false)

        profileBtn = view.findViewById(R.id.toolbarProfileIcon)

        profileBtn.setOnClickListener {
            Intent(activity as Context, DetailsActivity::class.java).also{
                startActivity(it)
            }
        }

        return view
    }

}