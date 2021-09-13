package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent 를 활용해서 액티비티 이동하기
        val intent = Intent(this, MainActivity2::class.java)


        //버튼 지정
        val buttonView = findViewById<Button>(R.id.viewmove)
        //클릭리스너
        buttonView.setOnClickListener {
            //액티비티 이동
            startActivity(intent)
        }
    }
}