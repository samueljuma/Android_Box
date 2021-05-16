package com.devjay.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.devjay.colormyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
        val clickableViews:List<View> = listOf(box_one,box_two,
            box_three,box_four,box_five)
        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        binding.apply {
            when (view.id){
                //colors from the color class
                box_one.id -> view.setBackgroundColor(Color.DKGRAY)
                box_two.id -> view.setBackgroundColor(Color.GRAY)
                //colors from the Android color resource
                box_three.id -> view.setBackgroundResource(android.R.color.holo_green_light)
                box_four.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
                box_five.id -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }


    }
}
