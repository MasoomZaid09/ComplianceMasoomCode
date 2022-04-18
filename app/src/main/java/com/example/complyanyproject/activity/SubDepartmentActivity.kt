package com.example.complyanyproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    }
}