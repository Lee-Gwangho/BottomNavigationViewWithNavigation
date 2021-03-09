package com.dahami.bottomnavigationviewwithnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dahami.bottomnavigationviewwithnavigation.databinding.FragmentHomeBinding

/**
 * Created by HOYADEV on 2021-03-09.
 * @desc
 */
class HomeFragment: Fragment() {

    private var mBinding: FragmentHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        mBinding = binding

        return mBinding?.root
    }


    override fun onDestroyView() {
        mBinding = null // 뷰가 사라지기 전에, Binding을 메모리에서 제거거
       super.onDestroyView() // Fragment가 날라간다.
    }
}