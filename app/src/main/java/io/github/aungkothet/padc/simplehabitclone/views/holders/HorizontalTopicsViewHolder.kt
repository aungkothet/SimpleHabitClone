package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import io.github.aungkothet.padc.simplehabitclone.adapters.HorizontalTopicAdapter
import kotlinx.android.synthetic.main.layout_horizontal_topic_holder.view.*

class HorizontalTopicsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(topic: String) {
        val layoutManager = LinearLayoutManager(itemView.context, LinearLayout.HORIZONTAL, false)
        val adapter = HorizontalTopicAdapter(itemView.context)
        itemView.tv_selected_topics.text = topic
        itemView.rv_horizontal_topics.layoutManager = layoutManager
        itemView.rv_horizontal_topics.adapter = adapter
    }
}