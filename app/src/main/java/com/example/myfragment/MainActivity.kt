package com.example.myfragment

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<ViewPager>(R.id.view_pager)
        view.adapter = ViewPageAdapter( this, supportFragmentManager)
        val tabs = findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(view)

    }
}