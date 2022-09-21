package com.example.mydatabinding

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MyViewModel : ViewModel() {
    var count = 0
    var name = MutableLiveData<String>()
    var password = MutableLiveData<String>()
    var info = MediatorLiveData<String>()

    init {
        info.addSource(name){
            count++
            if(count==4){
                info.value = "密码输错超过4次，账户已被锁定！"
            }
        }
    }





    fun login() :List<String>{
        val mList = mutableListOf<String>()
        if(name.value.isNullOrEmpty()) mList.add("name")
        if (password.value.isNullOrEmpty()) mList.add("password")
        return mList
    }


}