package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import fragments.DashboardFragment
import fragments.InfoFragment
import fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private val dashboardFragment= DashboardFragment()
    private val infoFragment= InfoFragment()
    private val settingsFragment= SettingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(dashboardFragment)
        bottom_navigation.SetOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.icon_dashboard -> replaceFragment(dashboardFragment)
                R.id.icon_info -> replaceFragment(infoFragment)
                R.id.icon_settings -> replaceFragment(settingsFragment)
            }
            true
        }

    }
}

private fun replaceFragment(fragment: Fragment){
            if(fragment !=null){
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container,fragment)
                transaction.commit()
            }
        }



