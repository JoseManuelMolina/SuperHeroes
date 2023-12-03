package org.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import org.example.superheroes.data.RetrofitService
import org.example.superheroes.data.RetrofitServiceFactory



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service = RetrofitServiceFactory.makeRetrofitService()

        lifecycleScope.launch {
            val chars = service.listCharacters("1",
                "cc22d15367b41619ed2922cfcf7898ee",
                "8374b5fa710b752563f623ecf3b5007f")
            println(chars)
            val results = chars.data.results
            println(results)
        }

        setContentView(R.layout.activity_main)

        val botonLista = findViewById(R.id.botonVerLista) as Button

        botonLista.setOnClickListener(){
            val intent = Intent(this, ListaHeroes::class.java)
            startActivity(intent)
        }

    }
}