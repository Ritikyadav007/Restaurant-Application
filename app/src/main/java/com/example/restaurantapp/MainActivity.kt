package com.example.restaurantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.adapter.CustomAdapter
import com.example.restaurantapp.viewmodel.RestaurantViewModel

class MainActivity : AppCompatActivity() {

     private var recycleview:RecyclerView?=null
    private var customadapter:CustomAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleview = findViewById<RecyclerView>(R.id.rec)

        var restaurantViewModel:RestaurantViewModel = ViewModelProviders.of(this).get(RestaurantViewModel::class.java)

        restaurantViewModel.getArrayList().observe(this,Observer{restaurantViewModels ->


           customadapter = CustomAdapter(this@MainActivity,restaurantViewModels!!)
            recycleview!!.setLayoutManager(LinearLayoutManager(this@MainActivity))
            recycleview!!.setAdapter(customadapter)



        })
    }
}