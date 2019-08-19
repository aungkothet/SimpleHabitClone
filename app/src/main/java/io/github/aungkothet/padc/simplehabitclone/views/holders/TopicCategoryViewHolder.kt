package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.simplehabitclone.utilities.DummyData.images
import kotlinx.android.synthetic.main.item_all_topic.view.*

class TopicCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(position: Int) {
        itemView.img_topic.setImageResource(images[position])
    }
}