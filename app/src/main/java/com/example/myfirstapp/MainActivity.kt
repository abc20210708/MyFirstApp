package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    public val EXTRA_MESSAGE : String = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Send 버튼을 눌렀을 때 호출되는 메서드
    fun sendMessage(view : View) {

    }

}//