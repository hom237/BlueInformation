package com.example.blueinformation.adapta

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blueinformation.databinding.AcademyitemBinding
import javax.security.auth.callback.Callback

class AcademyAdapta : RecyclerView.Adapter<AcademyAdapta.MyviewHolder>() {
    var datalist = mutableListOf<AcademyModel>()
    lateinit var callback: (Int)->Unit
    inner class MyviewHolder(private val binding : AcademyitemBinding): RecyclerView.ViewHolder(binding.root)  {
        fun bind(recyclerModel: AcademyModel, position: Int) {
            binding.nameText.text = recyclerModel.name
            binding.mainImg.setImageResource(recyclerModel.img)
            binding.item.setOnClickListener{
                Log.d("test", position.toString())
                callback(position)
            }
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