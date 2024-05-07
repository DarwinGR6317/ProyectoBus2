package com.example.proyectobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val btn_agendar : Button = findViewById(R.id.btn_agendarpg)

        btn_agendar.setOnClickListener {
            val intent = Intent(this,Agendar::class.java).apply {

            }
            startActivity(intent)
        }
        val btn_cancelarpg : Button = findViewById(R.id.btn_cancelarpg)

        btn_cancelarpg.setOnClickListener {
            val intent = Intent(this,Cancelar::class.java).apply {

            }
            startActivity(intent)
        }
        val btn_horarios : Button = findViewById(R.id.btn_horarios)

        btn_horarios.setOnClickListener {
            val intent = Intent(this,Horarios::class.java).apply {

            }
            startActivity(intent)
        }
        val imghome: ImageView  = findViewById(R.id.home)
        imghome.setOnClickListener {
            val intent = Intent(this,Home::class.java).apply {

            }
            startActivity(intent)
        }
        val imgbook: ImageView  = findViewById(R.id.book)
        imgbook.setOnClickListener {
            val intent = Intent(this,Agendar::class.java).apply {

            }
            startActivity(intent)
        }
        val imgbootle: ImageView  = findViewById(R.id.bootle)
        imgbootle.setOnClickListener {
            val intent = Intent(this,Cancelar::class.java).apply {

            }
            startActivity(intent)
        }
    }
}