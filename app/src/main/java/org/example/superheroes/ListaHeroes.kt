package org.example.superheroes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.example.superheroes.adapter.HeroeAdapter
import org.example.superheroes.data.HeroesProvider
import org.example.superheroes.databinding.ActivityListaHeroesBinding

class ListaHeroes : AppCompatActivity() {

    private lateinit var binding: ActivityListaHeroesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista_heroes)
        initRecyclerView()

    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerHeroes)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroeAdapter(HeroesProvider.listaHeroes)
    }

}