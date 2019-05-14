package com.yang.databindingdemo.model

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

/**
 * @author yangzc
 *	@data 2019/5/10 17:07
 *	@desc
 *
 */
class Student {
    val name = ObservableField<String>()
    val age = ObservableInt()
}


