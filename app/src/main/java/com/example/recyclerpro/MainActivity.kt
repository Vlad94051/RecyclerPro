package com.example.recyclerpro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerpro.recycler.NewsAdapter

class MainActivity : AppCompatActivity() {
    private val adapter by lazy { NewsAdapter() }
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initViews()
    }

    override fun onResume() {
        super.onResume()
        val items = createNewsItems()

        adapter.submitList(items)
    }

    private fun initViews() {
        recycler.adapter = adapter
    }


    private fun createNewsItems() = listOf(
        HeadItem(data = "10.12.2022"),
        NewsItem(
            title = "title1",
            subtitle = "subtitile1"
        ),
        NewsItem(
            title = "title2",
            subtitle = "subtitile2"
        ),
        HeadItem(data = "12.12.2022"),
        NewsItem(
            title = "title3",
            subtitle = "subtitile3"
        ),
        NewsItem(
            title = "title4",
            subtitle = "subtitile4"
        ),
    )
}