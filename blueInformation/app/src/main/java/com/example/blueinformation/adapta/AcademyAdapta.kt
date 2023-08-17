package com.example.blueinformation.adapta

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blueinformation.databinding.AcademyitemBinding

class AcademyAdapta : RecyclerView.Adapter<AcademyAdapta.MyviewHolder>() {
    var datalist = mutableListOf<AcademyModel>()
    inner class MyviewHolder(private val binding : AcademyitemBinding): RecyclerView.ViewHolder(binding.root)  {
        fun bind(recyclerModel: AcademyModel, position: Int) {
            binding.nameText.text = recyclerModel.name
            binding.mainImg.setImageResource(recyclerModel.img)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val binding=AcademyitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyviewHolder(binding)
    }


    override fun getItemCount() = datalist.size

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.bind(datalist[position], position)

    }
}