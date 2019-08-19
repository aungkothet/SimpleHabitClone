package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.simplehabitclone.adapters.SelectedTopicsAdapter
import kotlinx.android.synthetic.main.layout_selected_topic_holder.view.*

class SelectedTopicsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    init {
        bindData()
    }

    private fun bindData(){
        val layoutManager = LinearLayoutManager(itemView.context)
        val adapter = SelectedTopicsAdapter(itemView.context)
        itemView.rv_selected_topics.layoutManager = layoutManager
        itemView.rv_selected_topics.adapter = adapter
    }
}