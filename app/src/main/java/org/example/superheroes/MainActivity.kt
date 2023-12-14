package org.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)



        val botonLista = findViewById(R.id.botonVerLista) as Button

        botonLista.setOnClickListener(){
            val intent = Intent(this, ListaHeroesActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.lista -> {
                lanzarLista()
                true
            }
            R.id.home -> {
                lanzarHome()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
//        return super.onOptionsItemSelected(item)
    }

    fun lanzarHome(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun lanzarLista(){
        val intent = Intent(this, ListaHeroesActivity::class.java)
        startActivity(intent)
    }
}