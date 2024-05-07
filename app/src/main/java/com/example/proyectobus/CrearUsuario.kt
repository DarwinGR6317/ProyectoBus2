package com.example.proyectobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectobus.databinding.ActivityCrearUsuarioBinding
import com.google.firebase.auth.FirebaseAuth

class CrearUsuario : AppCompatActivity() {
    private lateinit var binding: ActivityCrearUsuarioBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnCrear.setOnClickListener {
            val email = binding.Email2.text.toString()
            val pass = binding.pssw.text.toString()
            val pass2 = binding.pssw2.text.toString()
            if (email.isEmpty() or pass.isEmpty() or pass2.isEmpty()){
                Toast.makeText(this, "Verifica la entrada", Toast.LENGTH_SHORT).show()
            }else{
                if (pass == pass2) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            //rediregir a Login
                            val intent = Intent(this, Login::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this, "Las contraseñas no coinciden ", Toast.LENGTH_SHORT).show()
                }

            }
        }


        binding.tvGoSingIn.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

    }
}
