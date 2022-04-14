package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.interfaces.OnRecyclerClickListener
import com.example.complyanyproject.model.ModelClass

class UserAdapter(val context : Context, val itemList : ArrayList<ModelClass>, val onRvClickListener: OnRecyclerClickListener): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val userName : TextView = view.findViewById(R.id.itemName)
        val userID: TextView = view.findViewById(R.id.itemId)
        val userEmail: TextView = view.findViewById(R.id.itemEmail)
        val userMobile : TextView = view.findViewById(R.id.itemMobile)
        val layout :    CardView = view.findViewById(R.id.layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_recycler_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userData = itemList[position]

        holder.userName.text = userData.name
        holder.userID.text = userData.id
        holder.userEmail.text = userData.email
        holder.userMobile.text = userData.mobile

        holder.layout.setOnClickListener {
            onRvClickListener.onClick(position)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}