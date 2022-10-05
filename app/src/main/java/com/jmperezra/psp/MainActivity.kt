package com.jmperezra.psp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmperezra.psp.ut02.data.remote.RetrofitApiClient

class MainActivity : AppCompatActivity() {

    val apiClient = RetrofitApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread{
            apiClient.getUsers()
        }.start()

    }
}