package com.example.blueinformation.adapta.stuadapta

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blueinformation.databinding.StudentitemBinding

class StuedentAdapta : RecyclerView.Adapter<StuedentAdapta.MyviewHolder>() {
    var datalist = mutableListOf<StuedentModel>()

    inner class MyviewHolder(private val binding: StudentitemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(recyclerModel: StuedentModel, position: Int) {
            binding.stuName.text = recyclerModel.name
            binding.stuProfile.setImageResource(recyclerModel.profile)
            binding.stuComment.text = recyclerModel.comment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding = StudentitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyviewHolder(binding)
    }

    override fun getItemCount() = datalist.size

    override fun onBindViewHolder(holder: StuedentAdapta.MyviewHolder, position: Int) {
        holder.bind(datalist[position], position)

    }
}