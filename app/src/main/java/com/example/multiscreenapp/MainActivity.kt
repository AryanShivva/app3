package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //creating key
    companion object{
        const val KEY = "com.example.multiscreenapp.Mainactivity.KEY"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val orderplaced=et1.text.toString() + " " + et2.text.toString() + " " + et3.text.toString()+
             " " + et4.text.toString()

            intent= Intent(this,order::class.java)
            intent.putExtra(KEY, orderplaced)
            startActivity(intent)
        }
    }
}