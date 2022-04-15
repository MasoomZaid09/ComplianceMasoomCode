package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ChangeUserModelClass
import com.example.complyanyproject.model.ProxyUserModelClass

class ProxyUserAdapter (val context: Context, val itemList : ArrayList<ProxyUserModelClass>):
    RecyclerView.Adapter<ProxyUserAdapter.ProxyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProxyUserAdapter.ProxyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.proxy_user_recycler_layout , parent , false)
        return ProxyViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProxyViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemUserName.text = userData.UserName
        holder.itemEntityName.text = userData.EntityName
        holder.itemDepartment.text = userData.Department
        holder.itemEndDate.text = userData.ProxyEndDate
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ProxyViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemUserName : TextView = view.findViewById(R.id.itemUserName)
        val itemEntityName : TextView = view.findViewById(R.id.itemEntityName)
        val itemDepartment : TextView = view.findViewById(R.id.itemDepartment)
        val itemEndDate : TextView = view.findViewById(R.id.itemEndDate)

    }


}