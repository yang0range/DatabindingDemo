package com.yang.databindingdemo.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayMap
import com.yang.databindingdemo.R
import com.yang.databindingdemo.databinding.ActivityBasicDataVbindingBinding

class BasicDataVBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBasicDataVbindingBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_basic_data_vbinding
        )
        val map = ObservableArrayMap<String, Any>()
        map["name"] = "我叫杨大爷"
        map["age"] = 20
        binding.studentInfo = map
    }

    companion object {
        fun buildIntent(context: Context): Intent {
            return Intent(context, BasicDataVBindingActivity::class.java)
        }
    }


}
