package com.example.recyclerpro.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.recyclerpro.BaseItem
import com.example.recyclerpro.NewsItem
import com.example.recyclerpro.R

class NewsViewHolder(view: View) : BaseViewHolder(view) {

    companion object {
        const val VIEW_TYPE_NEWS = 2

        fun createViewHolder(viewGroup: ViewGroup): NewsViewHolder {
            return NewsViewHolder(
                LayoutInflater.from(viewGroup.context)
                    .inflate(
                        R.layout.item_news,
                        viewGroup,
                        false
                    )
            )
        }
    }

    private val title by lazy { view.findViewById<TextView>(R.id.title) }
    private val subtitle by lazy { view.findViewById<TextView>(R.id.subtitle) }

    override fun bindViewHolder(item: BaseItem) {
        val newsItem = item as NewsItem

        title.text = newsItem.title
        subtitle.text = newsItem.subtitle
    }
}