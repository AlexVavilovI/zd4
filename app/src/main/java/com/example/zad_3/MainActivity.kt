package com.example.zad_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val ch = arrayOf("1","2","3","4","5","6","7","8","9","10")// объ¤вленные элементы создаваемого массива
val num = mutableListOf<String>() // объ¤вл¤ем пустой массив

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(element in ch){
            num.add(element)
        }
        // вывод массива  на экран
        for(element in num){
            println(element)
        }

    }
}