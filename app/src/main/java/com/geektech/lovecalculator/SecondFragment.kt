package com.geektech.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.geektech.lovecalculator.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val loveModel: LoveModel = arguments?.getSerializable("key") as LoveModel

        binding.fname.text = loveModel.fname
        binding.sname.text = loveModel.sname
        binding.tvResult.text = loveModel.percentage
        binding.result.text = loveModel.result
    }

}