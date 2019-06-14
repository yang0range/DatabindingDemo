package com.yang.databindingdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yang.databindingdemo.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        basicdatavbindingactivity.setOnClickListener {
            startActivity(BasicDataVBindingActivity.buildIntent(this@MainActivity))

        }

        bindingadapterdemoactivity.setOnClickListener {
            startActivity(BindingAdapterDemoActivity.buildIntent(this))

        }

    }
}
