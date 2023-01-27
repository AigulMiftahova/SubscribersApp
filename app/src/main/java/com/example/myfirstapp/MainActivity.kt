package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val resultValue = bindingClass.edValue.text.toString().toInt()
            Log.d("MyLog", "Result = $resultValue")
            when (resultValue){
                in 0..1000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Лошара ебаная"
                }
                in 1000..100000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Лошара ебаная но не сильно"
                }
                in 100000..1000000 -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Среднячок, не лошара"
                }
                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Крассавчик уважаю"
                }
            }

        }
    }
}
