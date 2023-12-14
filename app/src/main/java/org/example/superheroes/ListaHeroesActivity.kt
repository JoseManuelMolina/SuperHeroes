package org.example.superheroes

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import org.example.superheroes.adapter.HeroeAdapter
import org.example.superheroes.data.HeroesProvider
import org.example.superheroes.data.superheroemodel.SuperHeroe
import org.example.superheroes.databinding.ActivityListaHeroesBinding

class ListaHeroesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaHeroesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)

        initRecyclerView()

    }

    private fun initRecyclerView(){
        val manager = GridLayoutManager(this,2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerHeroes.layoutManager =manager
        binding.recyclerHeroes.adapter =
            HeroeAdapter(HeroesProvider.listaHeroes) {superHeroe ->
                onItemSelected(
                    superHeroe
                )
            }
        binding.recyclerHeroes.addItemDecoration(decoration)
    }

    fun onItemSelected(superHeroe: SuperHeroe){
        val intent = Intent(this, HeroeActivity::class.java)
        intent.putExtra("superHeroe", superHeroe)
        startActivity(intent)
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