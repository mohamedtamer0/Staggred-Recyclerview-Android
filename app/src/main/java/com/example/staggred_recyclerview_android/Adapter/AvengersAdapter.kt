package com.example.staggred_recyclerview_android.Adapter

import android.content.Context
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.staggred_recyclerview_android.Model.AvengersModel
import com.example.staggred_recyclerview_android.databinding.ItemRowBinding

class AvengersAdapter(private val context: Context, private var avengersList: List<AvengersModel>) :
    RecyclerView.Adapter<AvengersAdapter.AvengersViewModel>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvengersViewModel {
        return AvengersViewModel(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: AvengersViewModel, position: Int) {
        val avengersList = avengersList[position]
        holder.binding.ivAvengers.setImageResource(avengersList.image)
        holder.binding.tvName.text = avengersList.name


    }

    override fun getItemCount(): Int {
        return avengersList.size
    }


    class AvengersViewModel(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)
}