package com.example.navigationfragmentissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    val navController: NavController
        get() = (supportFragmentManager.findFragmentById(R.id.nav_host_default) as NavHostFragment).navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController.setGraph(R.navigation.main_graph)
    }
}