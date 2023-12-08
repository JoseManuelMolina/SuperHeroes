package org.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val botonLista = findViewById(R.id.botonVerLista) as Button

        botonLista.setOnClickListener(){
            val intent = Intent(this, ListaHeroes::class.java)
            startActivity(intent)
        }

    }
}