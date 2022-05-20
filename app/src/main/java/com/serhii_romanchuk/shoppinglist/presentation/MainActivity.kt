package com.serhii_romanchuk.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.serhii_romanchuk.shoppinglist.R
import com.serhii_romanchuk.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavigatorListener()
    }

    private fun setBottomNavigatorListener() {
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.settings -> {
                    Log.d("MyLog", "Settings")
                }
                R.id.new_item -> {
                    Log.d("MyLog", "New item")
                }
                R.id.notes -> {
                    Log.d("MyLog", "Notes")
                }
                R.id.shop_list -> {
                    Log.d("MyLog", "Shop List")
                }
            }
            true
        }
    }
}