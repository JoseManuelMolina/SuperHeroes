package org.example.superheroes.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.example.superheroes.R
import org.example.superheroes.data.model.HeroeDb
import org.example.superheroes.data.superheroemodel.SuperHeroe

class HeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val heroe = view.findViewById<TextView>(R.id.tvNombreHeroe)
    val nombreReal = view.findViewById<TextView>(R.id.tvNombreReal)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val origen = view.findViewById<TextView>(R.id.tvOrigen)
    val foto = view.findViewById<ImageView>(R.id.ivHeroe)

    fun render(heroeModel: SuperHeroe){
        heroe.text =  heroeModel.superheroe
        nombreReal.text = heroeModel.realName
        publisher.text = heroeModel.publisher
        origen.text = heroeModel.origen

    }
}