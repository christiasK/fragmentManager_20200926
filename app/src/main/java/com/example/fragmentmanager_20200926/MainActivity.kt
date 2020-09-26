package com.example.fragmentmanager_20200926

import android.os.Bundle
import com.example.fragmentmanager_20200926.adapters.MyNameFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mAdapter: MyNameFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEvents()
        setValues()
    }

    override fun setEvents() {

    }

    override fun setValues() {
        mAdapter = MyNameFragmentPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

        myTabLayout.setupWithViewPager(mainViewPager)
    }
}