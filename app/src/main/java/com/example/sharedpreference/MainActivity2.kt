package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var loadbtn=findViewById<Button>(R.id.button3)
        var textt=findViewById<TextView>(R.id.textView4)
        sharedPreferences = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE)
               var age= intent.extras?.getString("age","")
        var name= intent.extras?.getString("name","")
               textt.text="The Name Is: $name \n The Age Is: $age"


        loadbtn.setOnClickListener {
                var age= sharedPreferences.getString("age","")
            var name= sharedPreferences.getString("name","")
        var age1=age.toString()
            var name1=name.toString()

       textt.text="The Name Is: $name1 \n The Age Is: $age1\n"

        }
    }
}






//        var age= sharedPreferences.getString("age","")
//        var age1=age.toString()
//        var save=textt.text
//        textt.text= "$ \n $age1"



