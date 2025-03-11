package com.example.wishlist.data

import kotlinx.coroutines.flow.Flow

class WishRepository(
    private val wishDao: WishDao
) {

    suspend fun addAWish(wish: Wish){
        wishDao.addAWish(wish)
    }

    suspend fun updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }

    fun getWishes() : Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id : Long) : Flow<Wish> = wishDao.getAWishById(id)

}