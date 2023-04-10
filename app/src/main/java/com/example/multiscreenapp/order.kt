package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersofcustomer=intent.getStringExtra(MainActivity.KEY)
        tvorder.text="ORDER PLACED\n\n\n" + ordersofcustomer.toString()



    }
}