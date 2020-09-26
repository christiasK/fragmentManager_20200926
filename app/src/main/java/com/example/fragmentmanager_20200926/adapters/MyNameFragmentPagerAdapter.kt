package com.example.fragmentmanager_20200926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentmanager_20200926.fragment.MyAddressFragment
import com.example.fragmentmanager_20200926.fragment.MyAgeFragment
import com.example.fragmentmanager_20200926.fragment.MyNameFragment

class MyNameFragmentPagerAdapter(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                MyNameFragment()
            }
            1 -> {
                MyAgeFragment()
            }
            else -> {
                MyAddressFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> {
                "이름"
            }
            1 -> {
                "나이"
            }
            else -> {
                "주소"
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}