package com.sj.bmicalculator

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseActivity : Application(){

    var isDarkTheme =  mutableStateOf(true)
    fun changeTheme(){
        isDarkTheme.value = !isDarkTheme.value
    }
}