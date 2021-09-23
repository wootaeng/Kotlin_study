package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val backBtn = findViewById<Button>(R.id.moveBack)
        //버튼 클릭시 액티비티 종료
        backBtn.setOnClickListener {
            finish()
        }
    }

}