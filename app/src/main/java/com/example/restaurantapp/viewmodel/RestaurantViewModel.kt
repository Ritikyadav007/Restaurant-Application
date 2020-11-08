package com.example.restaurantapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurantapp.model.Restaurant

class RestaurantViewModel : ViewModel
{
    var name = ""
    var address = ""
    var speciality = ""
    var rating = ""

    constructor() : super()
    constructor(category: Restaurant) : super() {
        this.name = category.name
        this.address = category.address
        this.speciality = category.speciality
        this.rating = category.rating
    }

    var arraylistmutablelivedata=MutableLiveData<ArrayList<RestaurantViewModel>>()

    var arraylist = ArrayList<RestaurantViewModel>()


    fun getArrayList():MutableLiveData<ArrayList<RestaurantViewModel>>
    {
        val restaurant1 = Restaurant("Taj","DELHI","Chole Bhature","4.9")
        val restaurant2 = Restaurant("Rock the Salt","Lucknow","Chinese","4.8")
        val restaurant3 = Restaurant("Burger Story","Noida","Burger","4.7")
        val restaurant4 = Restaurant("Sandwich Hub","DELHI","Sandwich","4.9")
        val restaurant5 = Restaurant("Tomatoe's","Pune","Soup","4.8")
        val restaurant6 = Restaurant("Manish Eating Point","Kanpur","Shwarma","4.6")
        val restaurant7 = Restaurant("Kalika Hut","Noida","Chicken","4.7")
        val restaurant8 = Restaurant("WOW Momos","Assam","Momos","4.5")

        val restaurantviewmodel1:RestaurantViewModel = RestaurantViewModel(restaurant1)
        val restaurantviewmodel2:RestaurantViewModel = RestaurantViewModel(restaurant2)
        val restaurantviewmodel3:RestaurantViewModel = RestaurantViewModel(restaurant3)
        val restaurantviewmodel4:RestaurantViewModel = RestaurantViewModel(restaurant4)
        val restaurantviewmodel5:RestaurantViewModel = RestaurantViewModel(restaurant5)
        val restaurantviewmodel6:RestaurantViewModel = RestaurantViewModel(restaurant6)
        val restaurantviewmodel7:RestaurantViewModel = RestaurantViewModel(restaurant7)
        val restaurantviewmodel8:RestaurantViewModel = RestaurantViewModel(restaurant8)

        arraylist!!.add(restaurantviewmodel1)
        arraylist!!.add(restaurantviewmodel2)
        arraylist!!.add(restaurantviewmodel3)
        arraylist!!.add(restaurantviewmodel4)
        arraylist!!.add(restaurantviewmodel5)
        arraylist!!.add(restaurantviewmodel6)
        arraylist!!.add(restaurantviewmodel7)
        arraylist!!.add(restaurantviewmodel8)

        arraylistmutablelivedata.value = arraylist

        return arraylistmutablelivedata
    }

}