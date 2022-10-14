package com.jmperezra.psp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jmperezra.psp.ut02.data.remote.RetrofitApiClient

class MainActivity : AppCompatActivity() {

    val apiClient = RetrofitApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread {
            val users = apiClient.getUsers()
            Log.d("@dev", "Usuarios: $users")
        }.start()

        Thread {
            val user = apiClient.getUser(1)
            Log.d("@dev", "Usuario: $user")
        }.start()

    }
}