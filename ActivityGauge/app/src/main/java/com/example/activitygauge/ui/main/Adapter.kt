package com.example.activitygauge.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.activitygauge.ui.gauge.ArcGaugeFragment
import com.example.activitygauge.ui.gauge.FullGauge
import com.example.activitygauge.ui.gauge.HalfGaugeFragment
import com.example.activitygauge.ui.gauge.MultiGaugeFragment

class Adapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return MultiGaugeFragment.newInstance()
            1 -> return HalfGaugeFragment.newInstance()
            2 -> return FullGauge.newInstance()
            3 -> return ArcGaugeFragment.newInstance()
        }
        return HalfGaugeFragment.newInstance()
    }
    override fun getCount(): Int {
        return 4
    }
    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "MultiGauge"
            1 -> return "HalfGauge"
            2 -> return "FullGauge"
            3 -> return "ArcGauge"
        }
        return "Title"
    }
}