package com.example.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var iv :ImageView = findViewById(R.id.iv)

        when(event?.action){
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02)
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03)
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.cat01)
        }
        return super.onTouchEvent(event)
    }
}