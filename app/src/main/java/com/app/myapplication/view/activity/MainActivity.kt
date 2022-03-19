package com.app.myapplication.view.activity

import com.app.myapplication.R
import com.app.myapplication.databinding.ActivityMainBinding
import com.app.myapplication.viewmodel.MainViewModel

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {


    override fun getLayoutRes() = R.layout.activity_main

    override fun initViewModel() {
        viewModel = getViewModel(MainViewModel::class.java)
    }

    override fun initData() {

    }

    override fun initView() {

    }

    override fun initObserve() {

    }

    override fun doWork() {

    }

}