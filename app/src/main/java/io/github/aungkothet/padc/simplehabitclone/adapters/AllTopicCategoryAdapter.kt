package io.github.aungkothet.padc.simplehabitclone.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.views.holders.TopicCategoryViewHolder

class AllTopicCategoryAdapter(private val context: Context):RecyclerView.Adapter<TopicCategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TopicCategoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_all_topic,parent,false)
        return TopicCategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 17
    }

    override fun onBindViewHolder(viewHolder: TopicCategoryViewHolder, position: Int) {
        viewHolder.bindData(position)
    }

}