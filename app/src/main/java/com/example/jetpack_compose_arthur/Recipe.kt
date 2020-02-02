package com.example.jetpack_compose_arthur

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes
    val imageResource:Int,
    val tittle:String,
    val ingredients:List<String>
)