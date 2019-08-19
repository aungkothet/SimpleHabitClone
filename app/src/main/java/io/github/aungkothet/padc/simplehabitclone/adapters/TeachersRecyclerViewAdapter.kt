package io.github.aungkothet.padc.simplehabitclone.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.utilities.DummyData.teachers
import io.github.aungkothet.padc.simplehabitclone.views.holders.TeacherViewHolder

class TeachersRecyclerViewAdapter : RecyclerView.Adapter<TeacherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_teachers, parent, false)
        return TeacherViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        holder.bindData(position)

    }

    override fun getItemCount(): Int = teachers.size
}
