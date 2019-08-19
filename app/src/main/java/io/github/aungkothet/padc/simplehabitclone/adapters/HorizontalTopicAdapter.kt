package io.github.aungkothet.padc.simplehabitclone.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.utilities.DummyData
import io.github.aungkothet.padc.simplehabitclone.views.holders.TopicViewHolder
import kotlin.random.Random

class HorizontalTopicAdapter(private val context: Context) :
    RecyclerView.Adapter<TopicViewHolder>() {
    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(viewHolder: TopicViewHolder, viewType: Int) {
        val random = Random.nextInt(DummyData.dummyTopics.size)
        viewHolder.bindData(DummyData.dummyTopics[random])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_selected_topic, parent, false)
        return TopicViewHolder(view)
    }
}