package com.example.restaurantapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.R
import com.example.restaurantapp.databinding.RestaurantBinding
import com.example.restaurantapp.viewmodel.RestaurantViewModel

class CustomAdapter(private val context: Context, private val arrylist:ArrayList<RestaurantViewModel>):RecyclerView.Adapter<CustomAdapter.CustomView>()
{
    

    class CustomView(val restaurantBinding: RestaurantBinding):RecyclerView.ViewHolder(restaurantBinding.root)
    {
        fun bind (restaurantViewModel: RestaurantViewModel)
        {
          this.restaurantBinding.restaurantmodel = restaurantViewModel
            restaurantBinding.executePendingBindings()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {


        val layoutInflater = LayoutInflater.from(parent.context)

        val restaurantBinding:RestaurantBinding = DataBindingUtil.inflate(layoutInflater, R.layout.innerlayout,parent,false)

        return CustomView(restaurantBinding)

    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {


        val restaurantViewModel = arrylist[position]
        holder.bind(restaurantViewModel)


    }

    override fun getItemCount(): Int {

        return arrylist.size

    }


}