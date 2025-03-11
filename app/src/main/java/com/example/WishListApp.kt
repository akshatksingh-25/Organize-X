package com.example

import android.app.Application

// Finally the database initializer needs to be called from a global context that will
// trigger its creation at the launch of the application.
// In Android, we have Application class that is useful for initializing any global state
// that needs to be available throughout the app. This class is instantiated before any
// other class when the process of an Application is created.

// Also register with Android Manifest.xml


class WishListApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}

