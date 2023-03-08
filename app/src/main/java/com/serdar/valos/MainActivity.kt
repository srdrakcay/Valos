package com.serdar.valos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.serdar.common.extension.notShow
import com.serdar.common.extension.show
import com.serdar.valos.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = binding.bottomNavigation
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        NavigationUI.setupWithNavController(bottomNavigation, navHostFragment.navController)
        navHostFragment.navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.agentsFragment -> bottomNavigation.show()
                R.id.weaponsFragment->bottomNavigation.show()
                R.id.mapsFragment->bottomNavigation.show()
                R.id.favoriteFragment->bottomNavigation.show()
                else -> bottomNavigation.notShow()
            }
        }

    }
}