package com.example.bottomnavigation

import android.accessibilityservice.GestureDescription
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


class MainActivity : AppCompatActivity() {
    private lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.bottomNav_view)

        //Pass the ID's of Different destinations
        //Pass the ID's of Different destinations
        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_home,
            R.id.navigation_favourites,
            R.id.navigation_profile,
            R.id.navigation_search
        )
            .build()

        //Initialize NavController.
        val navController: NavController =
            Navigation.findNavController(
                this,
                R.id.navHostFragment
            )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)

        navView.itemIconTintList = null;


    }
}