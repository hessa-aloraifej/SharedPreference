package com.example.sharedpreference

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private var a = ""
    private var n = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var name=findViewById<EditText>(R.id.nameet)
       var age=findViewById<EditText>(R.id.ageet)
        var text=findViewById<TextView>(R.id.textView3)
        sharedPreferences = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE
        )
        var btn=findViewById<Button>(R.id.button)
        var btn1=findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            n=name.text.toString()
             a= age.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("age", a)
            intent.putExtra("name", n)
            startActivity(intent)
         //   text.text= "Name:$n\nAge:$a\n"
        }
        btn1.setOnClickListener{
            n=name.text.toString()
            a= age.text.toString()
             save()


        }
    }
    fun save() {
            with(sharedPreferences.edit()) {
                putString("age", a)
                putString("name", n)
                apply()
            }
    }
}