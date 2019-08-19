package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.simplehabitclone.adapters.AllTopicCategoryAdapter
import kotlinx.android.synthetic.main.layout_all_topic_holder.view.*

class AllTopicCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        bindData()
    }
    private fun bindData(){
        val layoutManager  = LinearLayoutManager(itemView.context)
        val adapter = AllTopicCategoryAdapter(itemView.context)
        itemView.rv_all_topics.layoutManager = layoutManager
        itemView.rv_all_topics.adapter = adapter
    }
}