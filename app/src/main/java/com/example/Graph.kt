package com.example

import android.content.Context
import androidx.room.Room
import com.example.wishlist.data.WishDatabase
import com.example.wishlist.data.WishRepository

//Dependency Injection
object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(
            context,
            WishDatabase :: class.java,
            "wishlist.db"
        ).build()
    }
}