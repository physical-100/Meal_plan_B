package com.example.mealplanb

import Profile_fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mealplanb.databinding.FragmentTodayBinding
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate


class TodayFragment : Fragment() {
    lateinit var binding: FragmentTodayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTodayBinding.inflate(inflater, container, false)
        val userCalory = arguments?.getParcelable<User_calory>("user_calory")
        if (userCalory != null) {
            // userCalory를 사용하여 필요한 작업 수행
            binding.apply {
                goalCarb.text = "/${userCalory.carb}g"
                goalProtein.text = "/${userCalory.protein}g"
                goalFat.text = "/${userCalory.fat}g"
                goal.text= "${userCalory.goal_calory} Kcal"

            }
//            val pieChart: PieChart = binding.chart
//
//            // 목표 칼로리와 현재 칼로리 (예: 사용자가 섭취한 칼로리)를 가져옵니다.
//            val goalCalories = userCalory.goal_calory.toFloat()
//            val currentCalories = 0 // 현재 칼로리
//
//            // 목표 칼로리에 얼마나 근접했는지 계산합니다.
//            val remainingCalories = (goalCalories - currentCalories)
//            val achievedCalories = if (remainingCalories >= 0) currentCalories else currentCalories + remainingCalories
//
//            // 원형 그래프에 표시할 데이터를 생성합니다.
//            val pieEntries = listOf(
//                PieEntry(achievedCalories, "섭취한 칼로리"),
//                PieEntry(remainingCalories, "남은 칼로리")
//            )
//
//            val dataSet = PieDataSet(pieEntries, "칼로리")
//            dataSet.colors = ColorTemplate.COLORFUL_COLORS.toList()
//
//            val data = PieData(dataSet)
//            pieChart.data = data
//            // 그래프 업데이트
//            pieChart.invalidate()


        }
    return  binding.root
    }


    }
