package com.example.proyectobus

 import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AgendarAmatitan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agendar_amatitan)


        val imghome: ImageView = findViewById(R.id.home)
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