package io.github.aungkothet.padc.simplehabitclone.controllers

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import io.github.aungkothet.padc.simplehabitclone.R
import io.github.aungkothet.padc.simplehabitclone.adapters.TabPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        viewPager.adapter = tabPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabLayout)
        viewPager.currentItem = 1
        tabs.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}
