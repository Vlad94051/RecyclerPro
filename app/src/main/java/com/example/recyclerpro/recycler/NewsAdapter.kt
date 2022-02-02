package com.example.recyclerpro.recycler

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerpro.BaseItem
import com.example.recyclerpro.HeadItem
import com.example.recyclerpro.NewsItem
import java.lang.IllegalStateException

class NewsAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    private var items: List<BaseItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return when (viewType) {
            HeadViewHolder.VIEW_TYPE_HEAD -> HeadViewHolder.createViewHolder(parent)
            NewsViewHolder.VIEW_TYPE_NEWS -> NewsViewHolder.createViewHolder(parent)
            else -> throw IllegalStateException("Unknown view type: $viewType")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bindViewHolder(items[position])
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is HeadItem -> HeadViewHolder.VIEW_TYPE_HEAD
            is NewsItem -> NewsViewHolder.VIEW_TYPE_NEWS
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(data: List<BaseItem>) {
        items = data
        notifyDataSetChanged()
    }
}