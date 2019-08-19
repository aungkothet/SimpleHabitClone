package io.github.aungkothet.padc.simplehabitclone.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.adapters.TeachersRecyclerViewAdapter

class TeachersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_teachers_list, container, false)
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = TeachersRecyclerViewAdapter()
            }
        }
        return view
    }
}
