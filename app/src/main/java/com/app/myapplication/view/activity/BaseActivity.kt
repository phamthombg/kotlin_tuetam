package com.app.myapplication.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.app.myapplication.viewmodel.BaseViewModel

abstract class BaseActivity<VM : BaseViewModel, VB : ViewDataBinding> : AppCompatActivity() {
    protected lateinit var viewModel: VM
    protected lateinit var viewDataBinding: VB

    protected abstract fun getLayoutRes(): Int

    protected abstract fun initViewModel()

    protected abstract fun initData()

    protected abstract fun initView()

    protected abstract fun initObserve()

    protected abstract fun doWork()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBindingLayout()
        initViewModel()
        initData()
        initView()
        initObserve()
        doWork()
    }

    private fun initBindingLayout() {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutRes())
        viewDataBinding.lifecycleOwner = this
    }

    fun getViewModel(vmClass: Class<VM>): VM {
        return ViewModelProvider(this).get(vmClass)
    }
}