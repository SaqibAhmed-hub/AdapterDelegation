package com.example.adapterdelegation.adapter

import com.example.adapterdelegation.model.contentData
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class ContentAdapter() :
    ListDelegationAdapter<List<contentData>>() {

    private var textDelegate: TextDelegate = TextDelegate()
    private var imageDelegate: ImageDelegate = ImageDelegate()


    init {
        delegatesManager.addDelegate(textDelegate)
            .addDelegate(imageDelegate)

    }
}