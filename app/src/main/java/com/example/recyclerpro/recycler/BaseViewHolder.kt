package com.example.recyclerpro.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerpro.BaseItem

abstract class BaseViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bindViewHolder(item: BaseItem)
}
