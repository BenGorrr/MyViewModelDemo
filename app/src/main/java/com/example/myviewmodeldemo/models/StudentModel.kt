package com.example.myviewmodeldemo.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentModel : ViewModel(){
    var id = MutableLiveData<String>()
    var name = MutableLiveData<String>()
}