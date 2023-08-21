package com.example.blueinformation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.blueinformation.adapta.AcademyAdapta
import com.example.blueinformation.adapta.AcademyModel
import com.example.blueinformation.adapta.stuadapta.StuedentAdapta
import com.example.blueinformation.adapta.stuadapta.StuedentModel
import com.example.blueinformation.databinding.FragmentStudentRecycleBinding
import com.example.blueinformation.databinding.StudentitemBinding

class studentRecycleFragment : Fragment() {
    private lateinit var adapter: StuedentAdapta
    lateinit var binding: FragmentStudentRecycleBinding
    val mDatas = mutableListOf<StuedentModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentRecycleBinding.inflate(inflater, container, false)
        initDogRecyclerView()
        initstuedentList()
        return binding.root
    }
    private fun initDogRecyclerView() {
        adapter = StuedentAdapta()
        adapter.datalist=mDatas
        binding.stuRecyclerView.adapter = adapter

    }

    val student = mutableListOf("test")
    private fun initstuedentList(){
            mDatas.add(StuedentModel("kei", R.drawable.stu_kei, "나의 소중한......... 아리스여"))


    }


}