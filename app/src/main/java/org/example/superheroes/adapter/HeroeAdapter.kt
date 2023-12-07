package org.example.superheroes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.example.superheroes.R
import org.example.superheroes.data.superheroemodel.SuperHeroe


class HeroeAdapter(private val heroesList: List<SuperHeroe>) :
    RecyclerView.Adapter<HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroViewHolder(layoutInflater.inflate(R.layout.item_heroe, parent, false))
    }

    override fun getItemCount(): Int = heroesList.size

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val item = heroesList[position]
        holder.render(item)
    }


}