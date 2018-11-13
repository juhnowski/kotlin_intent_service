package com.juhnowski.ilya.intentservice

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View){
        for (i in 1..10) {
            val intent = Intent(this, MyIntentService::class.java)
            intent.setAction(ACTION_FOO)
            intent.putExtra(EXTRA_PARAM1, "$i Hello")
            intent.putExtra(EXTRA_PARAM2, "World")
            startService (intent)
        }
    }
}
