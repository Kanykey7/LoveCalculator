package com.geektech.lovecalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.geektech.lovecalculator.databinding.ActivityMainBinding
import com.geektech.lovecalculator.databinding.FragmentFirstBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()

    }
    private fun initClickers() {
       with(binding){
            calculateBtn.setOnClickListener{
                val firstName = firstEd.text.toString()
                val secondName = secondEd.text.toString()
                RetrofitService().api.calculateLove(firstName,secondName).enqueue(object :
                    Callback<LoveModel> {
                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                        if (response.isSuccessful) {
                            Log.e("ololo", "onResponse: ${response.body()?.percentage} ",)
                            val  bundle = Bundle()
                            bundle.putSerializable("key",response.body())

                            findNavController().navigate(R.id.secondFragment,bundle)
                        }


                    }


                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                        Log.e("ololo", "onFailure: ${t.message} ",)

                    }
                })
            }

        }
    }
    }


