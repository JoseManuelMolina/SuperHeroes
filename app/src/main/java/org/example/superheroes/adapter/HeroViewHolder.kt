package org.example.superheroes.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.example.superheroes.R
import org.example.superheroes.data.superheroemodel.SuperHeroe
import org.example.superheroes.databinding.ItemHeroeBinding

class HeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemHeroeBinding.bind(view)

    fun render(heroeModel: SuperHeroe, onClickListener:(SuperHeroe) -> Unit){
//        binding.tvNombreHeroe.text =  heroeModel.superheroe
//        binding.tvNombreReal.text = heroeModel.realName
//        binding.tvPublisher.text = heroeModel.publisher
//        binding.tvOrigen.text = heroeModel.origen
        Glide.with(binding.ivHeroe.context).load(heroeModel.tb).into(binding.ivHeroe)
//        Cada vez que clickemos en una celda, vamos a pasar a la activity la información del heroe
        itemView.setOnClickListener{
            onClickListener(heroeModel)
        }

    }
}