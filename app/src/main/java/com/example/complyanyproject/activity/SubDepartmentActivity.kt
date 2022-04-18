package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.complyanyproject.R
import com.example.complyanyproject.adapter.SubDepartmentAdapter
import com.example.complyanyproject.databinding.ActivitySubDepartmentBinding
import com.example.complyanyproject.model.SubDepartmentModelClass

class SubDepartmentActivity : AppCompatActivity() {

    lateinit var adapter : SubDepartmentAdapter
    val itemList : ArrayList<SubDepartmentModelClass> = ArrayList()

    private lateinit var binding : ActivitySubDepartmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data1 = SubDepartmentModelClass("hasdbjad")
        val data2 = SubDepartmentModelClass("hasdbjad")
        val data3 = SubDepartmentModelClass("hasdbjad")

        itemList.add(data1)
        itemList.add(data2)
        itemList.add(data3)


        binding.recyclerViewSubDepartment.layoutManager = LinearLayoutManager(this)
        adapter = SubDepartmentAdapter(this, itemList)
        binding.recyclerViewSubDepartment.adapter = adapter


        binding.backSubDepartment.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}