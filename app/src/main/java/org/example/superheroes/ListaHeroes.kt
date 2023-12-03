package org.example.superheroes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.superheroes.data.model.HeroeDb
import org.example.superheroes.databinding.ActivityListaHeroesBinding

class ListaHeroes : AppCompatActivity() {

    private lateinit var binding: ActivityListaHeroesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListaHeroesBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_lista_heroes)

        binding.recycler.adapter = HeroesAdapter(
            listOf(
//                HeroeDb()
            )
        )

    }
}