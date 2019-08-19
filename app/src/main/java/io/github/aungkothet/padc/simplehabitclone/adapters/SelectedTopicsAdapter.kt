package io.github.aungkothet.padc.simplehabitclone.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.utilities.DummyData
import io.github.aungkothet.padc.simplehabitclone.views.holders.HorizontalTopicsViewHolder
import kotlin.random.Random

class SelectedTopicsAdapter (private  val context: Context):RecyclerView.Adapter<HorizontalTopicsViewHolder>(){
    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(viewHolder: HorizontalTopicsViewHolder, position: Int) {
        val random = Random.nextInt(DummyData.selectedTopics.size)
        viewHolder.bindData(DummyData.selectedTopics[random])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalTopicsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_topic_holder,parent,false)
        return HorizontalTopicsViewHolder(view)
    }

}