package com.example.blueinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout
import com.example.blueinformation.adapta.AcademyAdapta
import com.example.blueinformation.adapta.AcademyModel
import com.example.blueinformation.databinding.ActivityMainBinding
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: AcademyAdapta
    lateinit var drawerLayout: DrawerLayout
    val mDatas = mutableListOf<AcademyModel>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDogRecyclerView()
        initAcademyList()
    }
    val academyname = mutableListOf("밀레니엄 사이언스 스쿨", "게헨나 학원", "아비도스 고등학교", "트리니티 종합학원", "백귀야행 연합학원", "산해경 고급중학교", "붉은겨울 연방학원", "발키리 경찰학교", "SRT 특수학원", "아리우스 분교")
    val academyimg = mutableListOf(R.drawable.school_millennium, R.drawable.school_gehenna, R.drawable.sch_abydos, R.drawable.school_trinity, R.drawable.school_hyakkiyoako, R.drawable.school_shanhaijing, R.drawable.school_red_winter,R.drawable.school_valkyrie, R.drawable.school_srt, R.drawable.school_arius)
    private fun initDogRecyclerView() {
        adapter = AcademyAdapta()
        adapter.datalist=mDatas
        adapter.callback = { position ->


        }
        binding.recyclerView.adapter = adapter

    }


    private fun initAcademyList(){
        for (i:Int in 0..academyname.size-1){
            mDatas.add(AcademyModel(academyname[i], academyimg[i]))
        }


    }

}