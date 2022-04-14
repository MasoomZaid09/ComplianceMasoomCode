package com.example.complyanyproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanyproject.R
import com.example.complyanyproject.model.ResourceModelClass

class ResourceAdapter(val context : Context, val itemList: ArrayList<ResourceModelClass>) :RecyclerView.Adapter<ResourceAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_resource_layout, parent, false)
        return myViewHolder(view)

    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val text = itemList[position]
        holder.Country.text = text.country
        holder.State.text = text.State
        holder.NameOfLaw.text = text.NameOfLaw
        holder.LawOfNature.text = text.LawOfNature
        holder.LawType.text = text.LawType
        holder.SizeKB.text = text.SizeKB
        holder.LastUpdate.text = text.LastUpdate
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class myViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val Country: TextView = view.findViewById(R.id.countryRes)
        val State: TextView = view.findViewById(R.id.stateRes)
        val NameOfLaw: TextView = view.findViewById(R.id.nameOfLawRes)
        val LawOfNature: TextView = view.findViewById(R.id.lawOfNatureRes)
        val LawType: TextView = view.findViewById(R.id.lawtypeRes)
        val SizeKB: TextView = view.findViewById(R.id.sizeRes)
        val LastUpdate: TextView = view.findViewById(R.id.LastUpRes)
    }
}