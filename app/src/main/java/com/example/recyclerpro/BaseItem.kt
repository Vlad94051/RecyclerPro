package com.example.recyclerpro

sealed class BaseItem

data class HeadItem(
    val data: String
) : BaseItem()

data class NewsItem(
    val title: String,
    val subtitle: String
) : BaseItem()