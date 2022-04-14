package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.ResourceAdapter
import com.example.complyanyproject.model.ResourceModelClass

class ResourceManagementActivity : AppCompatActivity() {

    lateinit var adapter: ResourceAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var toolbarBackIcon: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource_management)

        recyclerView = findViewById(R.id.recyclerView)
        toolbarBackIcon = findViewById(R.id.toolbarBackIcon)


        toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        // handle recyclerView
        val itemList : ArrayList<ResourceModelClass> = ArrayList()

        val data1 = ResourceModelClass("India", "Delhi", "Artical 112", "abc", "law", "123kb","today")
        itemList.add(data1)

        recyclerView.layoutManager = LinearLayoutManager(this )

        adapter = ResourceAdapter(this, itemList)

        recyclerView.adapter = adapter
    }

    override fun onBackPressed() {
        finish()
    }
}