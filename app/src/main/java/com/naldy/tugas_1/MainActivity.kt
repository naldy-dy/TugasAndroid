package com.naldy.tugas_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lbl_follow_count = findViewById<TextView>(R.id.lbl_follow_count)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        var follow_count = 25
        btn_follow.setOnClickListener {
            follow_count += 1
            lbl_follow_count.text = follow_count.toString()
        }
    }
}