package com.geektech.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.geektech.lovecalculator.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

//    private fun initClickers() {
//        with(binding){
//            calculateBtn.setOnClickListener{
//                RetrofitService().api.calculateLove(firstEd.text.toString(),secondEd.text.toString()).enqueue(object :
//                    Callback<LoveModel> {
//                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
//                        if (response.isSuccessful){
//                            Log.e("ololo", "onResponse: ${response.body()?.percentage}", )
//                            calculateBtn.text = "${response.body()?.result}"
//                        }
//                    }
//
//                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
//                        Log.e("ololo", "onFailure: ${t.message} ", )
//                    }
//
//                })
//            }
//        }
//    }

}