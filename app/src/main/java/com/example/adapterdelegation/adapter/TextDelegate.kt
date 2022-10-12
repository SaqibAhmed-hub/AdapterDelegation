package com.example.adapterdelegation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adapterdelegation.databinding.ItemTextBinding
import com.example.adapterdelegation.model.contentData
import com.example.adapterdelegation.util.ContentType
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate

class TextDelegate() : AdapterDelegate<List<contentData>>() {
    override fun isForViewType(items: List<contentData>, position: Int): Boolean {
        return items[position].type == ContentType.Text
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return ItemViewHolder(
            ItemTextBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    inner class ItemViewHolder(val binding: ItemTextBinding) :
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
        val stringBuilder = StringBuilder()
        for (i in dataItem.typeText){
            stringBuilder.append(i)
        }
        holder.binding.textTv.text = "$stringBuilder + \n"
    }
}