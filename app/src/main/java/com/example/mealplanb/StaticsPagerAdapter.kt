package com.example.mealplanb

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class StaticsPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DailyStaticFragment()
            1 -> WeeklyStaticFragment()
            2 -> MonthlyStaticFragment()
            else -> DailyStaticFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3 // 일간, 주간, 월간 세 개의 탭
    }

}

