package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val myTAG: String = "myLogcat"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(myTAG, "in method onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(myTAG, "in method onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(myTAG, "in method onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(myTAG, "in method onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(myTAG, "in method onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(myTAG, "in method onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(myTAG, "in method onDestroy")
    }
}