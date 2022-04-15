package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ClientManagementModelClass

class ClientManagementAdapter(val context: Context, val itemList : ArrayList<ClientManagementModelClass>):
    RecyclerView.Adapter<ClientManagementAdapter.ClientManagementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientManagementAdapter.ClientManagementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.client_management_recycler_layout , parent , false)
        return ClientManagementViewHolder(view)

    }
    override fun onBindViewHolder(holder: ClientManagementViewHolder, position: Int) {
        val userData = itemList[position]

        holder.itemName.text = userData.clientName
        holder.itemGroup.text = userData.clientGroup
        holder.itemSubGroup.text = userData.clientSubGroup
        holder.itemTaxNo.text = userData.incomeTaxNo
        holder.itemAddress.text = userData.address
        holder.itemContact.text = userData.contact
        holder.itemEmail.text = userData.emailId
        holder.itemMobile.text = userData.mobileNo

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ClientManagementViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        val itemName = view.findViewById<TextView>(R.id.itemName)
        val itemGroup = view.findViewById<TextView>(R.id.itemGroup)
        val itemSubGroup = view.findViewById<TextView>(R.id.itemSubGroup)
        val itemTaxNo = view.findViewById<TextView>(R.id.itemTaxNo)
        val itemAddress = view.findViewById<TextView>(R.id.itemAddress)
        val itemContact = view.findViewById<TextView>(R.id.itemContact)
        val itemEmail = view.findViewById<TextView>(R.id.itemEmail)
        val itemMobile = view.findViewById<TextView>(R.id.itemMobile)

    }


}