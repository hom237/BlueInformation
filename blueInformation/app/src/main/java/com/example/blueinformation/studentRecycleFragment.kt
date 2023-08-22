package com.example.blueinformation

import android.os.Bundle
import android.util.Log
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
import java.lang.reflect.Constructor

class studentRecycleFragment(var schoolName:Int) : Fragment()  {
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
    val studentName = mutableListOf(mutableListOf("텐도 아리스", "하나오카 유즈"), mutableListOf("리쿠 아루"), mutableListOf("호시노"), mutableListOf("히후미"), mutableListOf("이즈나"), mutableListOf("슌"), mutableListOf("체리노"), mutableListOf("키리노"), mutableListOf("미야코"), mutableListOf("사오리")
    )
    val studentComent = mutableListOf("test")

    private fun initstuedentList(){
        for (i in 0..studentName[schoolName].size-1){
            Log.d("test", studentName[schoolName][i])
            mDatas.add(StuedentModel(studentName[schoolName][i], R.drawable.stu_kei, "나의 소중한......... 아리스여"))
        }



    }


}