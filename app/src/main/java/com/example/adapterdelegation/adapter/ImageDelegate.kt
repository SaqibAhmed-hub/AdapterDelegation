package com.example.adapterdelegation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterdelegation.databinding.ItemImageBinding
import com.example.adapterdelegation.databinding.ItemTextBinding
import com.example.adapterdelegation.model.contentData
import com.example.adapterdelegation.util.ContentType
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate

class ImageDelegate() : AdapterDelegate<List<contentData>>() {

    override fun isForViewType(items: List<contentData>, position: Int): Boolean {
        return items[position].type == ContentType.Image
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return ItemViewHolder(
           ItemImageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    inner class ItemViewHolder(val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onBindViewHolder(
        items: List<contentData>,
        position: Int,
        holder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val vh = holder as ItemViewHolder
        val dataItem = items[position]
        holder.binding.imageTv.text = dataItem.name
        holder.binding.descriptionTv.text = dataItem.type
        holder.binding.root.setOnClickListener {
            TODO()
        }
    }
}