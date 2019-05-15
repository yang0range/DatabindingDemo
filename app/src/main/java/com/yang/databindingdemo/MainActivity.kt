package com.yang.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayMap
import com.yang.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        val map = ObservableArrayMap<String, Any>()
        map["name"] = "我叫杨大爷"
        map["age"] = 20
        binding.studentInfo = map
    }
}
