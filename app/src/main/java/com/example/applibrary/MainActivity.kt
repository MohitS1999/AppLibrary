package com.example.applibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.applibrary.databinding.ActivityMainBinding
import com.example.doublefloatarray.GetDouble

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var arr = floatArrayOf(1f,2f,3f,4f,4f,4f,6f)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val doubleFloatArray = GetDouble.simpleNativeLib(baseContext,arr)


        Log.d(TAG, "onCreate: $doubleFloatArray")

        var str = ""
        for (x in doubleFloatArray){
            str += x.toString() +" "
        }

        binding.data.text = str
    }
}