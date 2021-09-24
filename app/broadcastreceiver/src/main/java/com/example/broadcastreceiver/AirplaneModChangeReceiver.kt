package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnable = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnable){
            Toast.makeText(context, "비행기모드 사용", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "비행기모드 끔", Toast.LENGTH_LONG).show()
        }
    }
}