package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ChangeUserModelClass

class ChangeUserAdapter(val context: Context, val itemList : ArrayList<ChangeUserModelClass>):RecyclerView.Adapter<ChangeUserAdapter.ChangeUserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChangeUserAdapter.ChangeUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.change_user_recycler_layout , parent , false)
        return ChangeUserViewHolder(view)

    }

    override fun onBindViewHolder(holder: ChangeUserAdapter.ChangeUserViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemName.text = userData.EntityName
        holder.itemUser.text = userData.CurrentUser
        holder.itemDepartment.text = userData.Department
        holder.itemUserName.text = userData.ReplaceUserName

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ChangeUserViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemName : TextView = view.findViewById(R.id.itemName)
        val itemUser : TextView = view.findViewById(R.id.itemUser)
        val itemDepartment : TextView = view.findViewById(R.id.itemDepartment)
        val itemUserName : TextView = view.findViewById(R.id.itemUserName)

    }
}