package com.blackcoffer.netclan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val itemList: ArrayList<Model>)  : RecyclerView.Adapter<RecyclerViewAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ModelViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.personal_items_list, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ModelViewHolder, position: Int) {
       val name = itemList[position].name
        val first: String = name.substring(0,1)
        holder.firstText.setText(first)
        holder.nameText.setText(itemList[position].name)
        holder.placeText.setText(itemList[position].place)
        holder.distanceText.setText(itemList[position].distance)
        holder.hobbyText.setText(itemList[position].hobby)
        holder.descText.setText(itemList[position].desc)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameText: TextView
        var placeText: TextView
        var distanceText: TextView
        var hobbyText: TextView
        var descText: TextView
        var firstText: TextView



        init {
            firstText = itemView.findViewById(R.id.tv_namecapital) as TextView
            nameText = itemView.findViewById(R.id.tv_Name) as TextView
            placeText = itemView.findViewById(R.id.tv_place) as TextView
            distanceText = itemView.findViewById(R.id.tv_distance) as TextView
            hobbyText = itemView.findViewById(R.id.tv_hobby) as TextView
            descText = itemView.findViewById(R.id.tv_desc) as TextView

        }

    }

}

