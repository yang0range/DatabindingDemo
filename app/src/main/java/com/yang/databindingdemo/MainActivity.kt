package com.yang.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yang.databindingdemo.databinding.ActivityMainBinding
import com.yang.databindingdemo.model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        val studentInfo = Student()
        studentInfo.name.set("我叫朝阳杨大爷")
        studentInfo.age.set(20)
        binding.studentInfo = studentInfo

        binding.tvStudenname.setOnClickListener {
            studentInfo.name.set("我还是叫叫朝阳杨大爷")
        }
        binding.tvAge.setOnClickListener {
            studentInfo.age.set(18)
        }

    }


}
