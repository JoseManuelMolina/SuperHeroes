package org.example.superheroes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.example.superheroes.adapter.HeroeAdapter
import org.example.superheroes.data.HeroesProvider
import org.example.superheroes.data.superheroemodel.SuperHeroe
import org.example.superheroes.databinding.ActivityListaHeroesBinding

class ListaHeroes : AppCompatActivity() {

    private lateinit var binding: ActivityListaHeroesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
        Toast.makeText(this, superHeroe.superheroe, Toast.LENGTH_SHORT).show()
    }

}