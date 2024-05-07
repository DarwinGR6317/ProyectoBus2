package com.example.proyectobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Agendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agendar)

        val textAhualulco : TextView = findViewById(R.id.Ahualulco)

        textAhualulco.setOnClickListener {
            val intent = Intent(this,AgendarAhualulco::class.java).apply {

            }
            startActivity(intent)
        }

        val textAmatitan : TextView = findViewById(R.id.Amatitán)

        textAmatitan.setOnClickListener {
            val intent = Intent(this,AgendarAmatitan::class.java).apply {

            }
            startActivity(intent)
        }
        val textAmeca : TextView = findViewById(R.id.Ameca)

        textAmeca.setOnClickListener {
            val intent = Intent(this,AgendarAmeca::class.java).apply {

            }
            startActivity(intent)
        }

        val textCocula : TextView = findViewById(R.id.Cocula)

        textCocula.setOnClickListener {
            val intent = Intent(this,AgendarCocula::class.java).apply {

            }
            startActivity(intent)
        }

        val textArenal : TextView = findViewById(R.id.Arenal)

        textArenal.setOnClickListener {
            val intent = Intent(this,AgendarArenal::class.java).apply {

            }
            startActivity(intent)
        }

        val textEtzatlan : TextView = findViewById(R.id.Etzatlán)

        textEtzatlan.setOnClickListener {
            val intent = Intent(this,AgendarEtzatlan::class.java).apply {

            }
            startActivity(intent)
        }

        val textMagdalena : TextView = findViewById(R.id.Magdalena)

        textMagdalena.setOnClickListener {
            val intent = Intent(this,AgendarMagdalena::class.java).apply {

            }
            startActivity(intent)
        }

        val textJuanitoEscobedo : TextView = findViewById(R.id.JuanitoEscobedo)

        textJuanitoEscobedo.setOnClickListener {
            val intent = Intent(this,AgendarJuanitoEscobedo::class.java).apply {

            }
            startActivity(intent)
        }

        val textMartinHidalgo : TextView = findViewById(R.id.MartínHidalgo)

        textMartinHidalgo.setOnClickListener {
            val intent = Intent(this,AgendarMartinHidalgo::class.java).apply {

            }
            startActivity(intent)
        }

        val textTala : TextView = findViewById(R.id.Tala)

        textTala.setOnClickListener {
            val intent = Intent(this,AgendarTala::class.java).apply {

            }
            startActivity(intent)
        }

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