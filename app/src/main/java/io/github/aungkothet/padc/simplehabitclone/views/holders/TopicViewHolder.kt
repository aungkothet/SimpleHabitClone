package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.simplehabitclone.models.Topic
import kotlinx.android.synthetic.main.item_selected_topic.view.*

class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(topic: Topic) {
        itemView.img_topic_bg.setImageResource(topic.imageId)
        itemView.tv_topic_title.text = topic.title
        itemView.tv_duration.text = topic.duration
    }
}