package org.example.superheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import org.example.superheroes.data.superheroemodel.SuperHeroe

@Suppress("DEPRECATION")
class HeroeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroe)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val extras = intent.extras
        val heroe = extras?.getSerializable("superHeroe") as SuperHeroe
        val foto = findViewById<ImageView>(R.id.fotoHeroe)
        val nombreHeroe = findViewById<TextView>(R.id.nombreHeroe)
        val nombreReal = findViewById<TextView>(R.id.nombreReal)
        val origen = findViewById<TextView>(R.id.origen)
        val publisher = findViewById<TextView>(R.id.publisher)


        nombreHeroe.append(heroe.superheroe.uppercase())
        nombreReal.append(heroe.realName)
        origen.append(heroe.origen)
        publisher.append(heroe.publisher)
        Glide.with(this).load(heroe.photo).into(foto)

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