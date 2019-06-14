package com.yang.databindingdemo.model2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

/**
 * @author yangzc
 * @data 2019/6/14 14:24
 * @desc
 */
class StudentInfo : BaseObservable() {
    @get:Bindable
    var name: String? = null
    @get:Bindable
    var age: Int = 0
    @get:Bindable
    var sex: String? = null
    @get:Bindable
    var score: Int = 0
}
