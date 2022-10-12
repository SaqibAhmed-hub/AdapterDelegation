package com.example.adapterdelegation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterdelegation.adapter.ContentAdapter
import com.example.adapterdelegation.model.ImageData
import com.example.adapterdelegation.model.TextData
import com.example.adapterdelegation.model.contentData
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val textData = listOf(
            TextData("Ahmed",1),
            TextData("Saqib",2)
        )
        val imageData = listOf(
            ImageData("Saravana",1,2),
            ImageData("Same",2,3),
            ImageData("Another",3,3)
        )
        val content = listOf(
            contentData("text","Text",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("text","Text",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("Image","Image",textData,imageData),
            contentData("text","Text",textData,imageData),
            contentData("text","Text",textData,imageData),
            contentData("text","Text",textData,imageData),
        )



        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val adapter = ContentAdapter()
        adapter.items = content
        recyclerView.adapter = adapter
    }
}