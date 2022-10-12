package com.example.adapterdelegation.model

data class contentData(
    val name:String,
    val type: String,
    val typeText : List<TextData>,
    val typeImage : List<ImageData>
)
