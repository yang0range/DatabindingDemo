package com.yang.databindingdemo.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yang.databindingdemo.R
import com.yang.databindingdemo.databinding.ActivityBindingAdapterDemoBinding

class BindingAdapterDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBindingAdapterDemoBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter_demo)
        binding.url = "http://img2.cache.netease.com/photo/0001/2016-07-21/BSGSEIG100AO0001.jpg"


    }

    companion object {
        fun buildIntent(context: Context): Intent {
            return Intent(context, BindingAdapterDemoActivity::class.java)
        }
    }
}
