package com.example.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animelists = ArrayList<animemodel>()
        recylerviews.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val adapter = animeadapter(this, animelists)
        recylerviews.adapter=adapter
            var char1 = animemodel(R.drawable.ace, "ace")
        animelists.add(char1)
        var char2 = animemodel(R.drawable.akaahi, "akachi")
        animelists.add(char2)
        var char3 = animemodel(R.drawable.gojo, "gojo")
        animelists.add(char3)
        var char4= animemodel(R.drawable.levi, "levi")
        animelists.add(char4)
        var char5 = animemodel(R.drawable.saitama, "saitama")
        animelists.add(char5)
        var char6 = animemodel(R.drawable.vegeta, "vegeta")
        animelists.add(char6)
        var char7 = animemodel(R.drawable.zoro, "zoro")
        animelists.add(char7)


    }
}