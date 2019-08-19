package io.github.aungkothet.padc.simplehabitclone.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.views.holders.AllTopicCategoryViewHolder
import io.github.aungkothet.padc.simplehabitclone.views.holders.SelectedTopicsViewHolder
import io.github.aungkothet.padc.simplehabitclone.views.holders.StartHereViewHolder

class SeriesRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val VT_STARTER = 0
    private val VT_SELECTED_TOPIC = 1
    private val VT_OTHER = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            VT_STARTER-> {
                val view = LayoutInflater.from(context).inflate(R.layout.layout_start_here, parent, false)
                StartHereViewHolder(view)
            }
            VT_SELECTED_TOPIC-> {
                val view = LayoutInflater.from(context).inflate(R.layout.layout_selected_topic_holder, parent, false)
                SelectedTopicsViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(context).inflate(R.layout.layout_all_topic_holder, parent, false)
                AllTopicCategoryViewHolder(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, viewType: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return when (position) {
            0 -> VT_STARTER
            1 -> VT_SELECTED_TOPIC
            else -> VT_OTHER
        }
    }
}
