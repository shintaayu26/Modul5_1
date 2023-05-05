package com.example.modul5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("101101", "Seonghwa", "081234567",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101102","Wooyoung", "0853167524",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101103","San", "085643182",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101104","Joshua","0876539184",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101105", "Vernon", "08128749364",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101105","Dino","085642378",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101106","Haechan","0857849234",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101107","Wonwoo", "0812658374",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
            MyContact("101108","Mingyu","08563472948",
                "https://www.pngitem.com/middle/mJiimi_my-profile-icon-blank-profile-picture-circle-hd/"),
        )

        gridView(listStudent)

        cardView(listStudent)
    }

    private fun listView(value: ArrayList<MyContact>){
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value: ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value: ArrayList<MyContact>){
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}