package io.github.aungkothet.padc.simplehabitclone.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import io.github.aungkothet.padc.simplehabitclone.fragments.SeriesListFragment
import io.github.aungkothet.padc.simplehabitclone.fragments.TeachersFragment

class TabPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            2-> TeachersFragment()
            else-> SeriesListFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "ON THE GO"
            1 -> "SERIES"
            else -> "TEACHERS"
        }
    }
}