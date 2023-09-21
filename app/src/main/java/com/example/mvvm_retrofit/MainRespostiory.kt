package com.example.mvvm_retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainRespostiory(private val myApi: MyApi) {

    private val userLiveData = MutableLiveData<Result>()

    val user:LiveData<Result>
        get() = userLiveData

    suspend fun getList(){
        val result = myApi.getlist()
        if (result?.body() != null){

            userLiveData.postValue(result.body())
        }
    }
}