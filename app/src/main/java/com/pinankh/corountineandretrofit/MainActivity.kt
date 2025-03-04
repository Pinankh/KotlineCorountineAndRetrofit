package com.pinankh.corountineandretrofit

/**
 * Created by @Author Pinankh Patel on 04,March,2025
 * Mobile App Developer,
 * Gujarat, INDIA.
 */

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.pinankh.corountineandretrofit.databinding.ActivityMainBinding
import com.pinankh.corountineandretrofit.network.Api
import com.pinankh.corountineandretrofit.view.RecyclerAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)

        lifecycleScope.launch {
            val response = retrofit.getUsers()
            if (response.isSuccessful) {
                launch(Dispatchers.Main) {
                    if (!response.body().isNullOrEmpty()) {
                        val recyclerAdapter = response.body()?.let { RecyclerAdapter(it) }
                        binding.recyclerView.adapter = recyclerAdapter
                    }
                }
            }
        }
    }
}


