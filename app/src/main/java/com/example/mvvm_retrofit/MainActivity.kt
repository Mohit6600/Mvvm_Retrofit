package com.example.mvvm_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_retrofit.Result
import retrofit2.Retrofit
import retrofit2.create

class MainActivity : AppCompatActivity() {


    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userService = AppModule.getInstance().create(MyApi::class.java)
        val mainRespostiory = MainRespostiory(userService)
        mainViewModel =
            ViewModelProvider(
                this,
                ViewModelFactory(mainRespostiory)
            ).get(MainViewModel::class.java)

        mainViewModel.user.observe(this) {
            Log.d("MohitCode", )
        }
    }
}