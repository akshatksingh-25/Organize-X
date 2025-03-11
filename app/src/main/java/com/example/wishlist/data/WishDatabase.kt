package com.example.wishlist.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Wish :: class],
    version = 1,
    exportSchema = false
)

// The entities parameter is provided as an array, so you can add multiple tables if required,
// like [Wish::class, AnotherEntity::class].

// Export Schema -The exportSchema parameter tells Room whether or not it should export the schema into a JSON file.
//                Setting this to false means that Room will not generate a schema file.
//                If you set it to true, Room will generate a JSON schema file in the specified directory,
//                which can be useful for version control and keeping track of schema changes.

abstract class WishDatabase : RoomDatabase() {
    abstract fun wishDao() : WishDao
}