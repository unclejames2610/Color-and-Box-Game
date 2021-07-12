package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()

    }

    private fun setListeners() {

        val clickableViews : List<View> =
                listOf(binding.boxOne, binding.boxTwoText, binding.boxThreeText,
                    binding.boxFourText, binding.boxFiveText, binding.constraintLayout,
                    binding.redBtn, binding.yellowBtn, binding.greenButton)
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }

        }

    }

    private fun makeColored(view: View?) {
        when (view?.id){
            R.id.boxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.redBtn -> (binding.boxThreeText).setBackgroundResource(R.color.my_red)
            R.id.yellowBtn -> (binding.boxFourText).setBackgroundResource(R.color.my_yellow)
            R.id.greenButton -> (binding.boxFiveText).setBackgroundResource(R.color.my_green)

            else -> view?.setBackgroundColor(Color.LTGRAY)

        }

    }
}