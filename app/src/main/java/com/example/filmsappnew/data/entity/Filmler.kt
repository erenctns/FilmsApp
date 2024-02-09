package com.example.filmsappnew.data.entity

import java.io.Serializable

data class Filmler(var id:String? = "",
                   var ad:String? = "",
                   var resim:String? = "",
                   var fiyat:Int? = 0):Serializable {
}