package org.example.superheroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.example.superheroes.data.model.HeroeDb
import org.example.superheroes.databinding.ViewHeroeItemBinding


class HeroesAdapter(private val heroes: List<HeroeDb>) :
    RecyclerView.Adapter<HeroesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewHeroeItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(heroes[position])
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    class ViewHolder(binding: ViewHeroeItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(heroe: HeroeDb){

        }
    }
}