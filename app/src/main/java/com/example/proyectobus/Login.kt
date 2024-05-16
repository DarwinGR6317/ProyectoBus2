package com.example.proyectobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.proyectobus.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(300)
        installSplashScreen()
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.btnSingUp.setOnClickListener {
            val email = binding.Email.text.toString()
            val pass = binding.pssw.text.toString()
            if (email.isEmpty() or pass.isEmpty()){
                Toast.makeText(this, "Verifica la entrada", Toast.LENGTH_SHORT).show()
            }else{
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener{
                    if (it.isSuccessful){
                        //rediregir a main activity
                        val intent = Intent(this,Home::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }


            }
        }
        binding.tvGoSingUp.setOnClickListener {
            val intent = Intent(this,CrearUsuario::class.java)
            startActivity(intent)
        }

    }

    override fun onStop() {
        super.onStop()
        firebaseAuth.signOut()
    }

}
