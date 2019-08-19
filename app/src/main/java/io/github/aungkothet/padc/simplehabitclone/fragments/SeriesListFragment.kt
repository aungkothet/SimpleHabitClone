package io.github.aungkothet.padc.simplehabitclone.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.adapters.SeriesRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_series_list.view.*

class SeriesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_series_list, container, false)
        val layoutManager = LinearLayoutManager(view.context,LinearLayout.VERTICAL,false)
        val seriesAdapter = SeriesRecyclerAdapter(view.context)
        view.seriesRecyclerView.layoutManager = layoutManager
        view.seriesRecyclerView.adapter = seriesAdapter

        return view
    }


}
