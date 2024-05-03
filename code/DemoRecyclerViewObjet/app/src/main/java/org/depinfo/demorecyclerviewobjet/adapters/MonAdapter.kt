package org.depinfo.demorecyclerviewobjet.adapters

import androidx.recyclerview.widget.RecyclerView
import org.depinfo.demorecyclerviewobjet.databinding.PersonneItemBinding

class PersonneAdapter {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class PersonneItemViewHolder(private val binding: PersonneItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(item: String) {
//            binding..text = item // On affiche l'élément dans le TextView
//        }
    }
}