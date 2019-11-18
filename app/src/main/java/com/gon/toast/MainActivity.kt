package com.gon.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hi there!")
        //toast(R.string.message)
        longToast("Wow, such duration")

        val Sal = findViewById<Button>(R.id.Saludo)
        val Exp = findViewById<Button>(R.id.Expected)

        Sal.setOnClickListener {
            longToast ("¡Hello There!")
        }

        Exp.setOnClickListener {
            longToast ("Expects The Spanish Inquisition")
        }



    }
}
