package com.serhii_romanchuk.shoppinglist.fragments

import androidx.appcompat.app.AppCompatActivity
import com.serhii_romanchuk.shoppinglist.R

object FragmentManager {
    var currentFragment: BaseFragment? = null

    fun setFragment(fragment: BaseFragment, activity: AppCompatActivity) {
        activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.place_holder, fragment)
            .commit()
        currentFragment = fragment
    }
}