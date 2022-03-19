package com.app.myapplication.viewmodel

import android.app.Application
import android.util.Log

class MainViewModel(application: Application): BaseViewModel(application) {

    fun showMess(mess: String) {
        Log.d("XXXXXXX", mess)
    }
}