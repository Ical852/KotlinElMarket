package com.example.bluecalmmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Tablet> = arrayListOf()
    private var listsp: ArrayList<Smarthphone> = arrayListOf()
    private var data: TabData = TabData()
    private var spdata: SpData = SpData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_profile.setOnClickListener {
            val profileintent = Intent(this@MainActivity, MyProfileActivity::class.java)
            startActivity(profileintent)
        }

        list.addAll(data.listdata())
        listsp.addAll(spdata.listdata())
        showTabData()
        showSpData()
    }

    private fun showTabData() {
        hrc_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val listTabAdapter = ListTabAdapter(list)
        hrc_view.adapter = listTabAdapter
    }

    private fun showSpData() {
        vrc_view.layoutManager = GridLayoutManager(this, 2)
        val listSpAdapter = ListSpAdapter(listsp)
        vrc_view.adapter = listSpAdapter
    }
}