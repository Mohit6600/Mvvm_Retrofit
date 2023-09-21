package com.example.mvvm_retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val mainRespostiory: MainRespostiory) : ViewModel() {


    init {
        viewModelScope.launch ( Dispatchers.IO){
            mainRespostiory.getList()
        }
    }
    val user : LiveData<Result>
        get()= mainRespostiory.user
}