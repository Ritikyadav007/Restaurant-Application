package com.example.restaurantapp.model

class Restaurant
{

    var name = ""
    var address = ""
    var speciality = ""
    var rating = ""

    constructor(name: String, address: String, speciality: String, rating: String) {
        this.name = name
        this.address = address
        this.speciality = speciality
        this.rating = rating
    }
}