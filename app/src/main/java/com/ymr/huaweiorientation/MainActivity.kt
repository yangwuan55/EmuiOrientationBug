package com.ymr.huaweiorientation

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.setOnClickListener {
            Log.i(TAG,"curr orientation1:${Resources.getSystem().configuration.orientation} requestedOrientation:${requestedOrientation}")
            requestedOrientation = if (Resources.getSystem().configuration.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE else ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            Log.i(TAG,"curr orientation2:${Resources.getSystem().configuration.orientation} requestedOrientation:${requestedOrientation}")
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i(TAG,"newConfig.orientation:${newConfig.orientation} ${Resources.getSystem().configuration.orientation}")
    }

}