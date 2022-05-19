package com.serhii_romanchuk.shoppinglist.presentation

import android.app.Application
import com.serhii_romanchuk.shoppinglist.data.MainDataBase

class MainApp : Application() {
    val dataBase by lazy { MainDataBase.getDataBase(this) }
}