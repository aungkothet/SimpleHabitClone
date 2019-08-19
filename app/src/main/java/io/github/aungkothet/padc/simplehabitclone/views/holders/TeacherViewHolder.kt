package io.github.aungkothet.padc.simplehabitclone.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.simplehabitclone.utilities.DummyData.teachers
import kotlinx.android.synthetic.main.fragment_teachers.view.*
import kotlin.random.Random

class TeacherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bindData(position: Int){
        itemView.tv_teacher_name.text = teachers[position]
        itemView.tv_session.text = "${Random.nextInt(1,20)} sessions"
    }
}