package com.example.avengers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animev.view.*
import java.util.zip.Inflater

class animeadapter(val context:Context,val animelist:List<animemodel>):RecyclerView.Adapter<animeadapter.viewitem>(){
    inner class viewitem(view:View):RecyclerView.ViewHolder(view){

        fun setData(anime:animemodel){
            itemView.imagev.setImageResource(anime.image)
            itemView.textView.text=anime.name
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewitem {
        val vieww=LayoutInflater.from(parent.context).inflate(R.layout.animev,parent,false)
        return viewitem(vieww)
    }

    override fun onBindViewHolder(holder: viewitem, position: Int) {
        var animes=animelist[position]

        holder.setData(animes)
    }

    override fun getItemCount(): Int {
       return animelist.size
    }
}