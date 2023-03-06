package com.sow.sphereofwished

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sow.sphereofwished.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import java.util.*
import kotlin.concurrent.schedule
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var numOfImage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sphereView.setOnClickListener {
            numOfImage  = Random.nextInt(0, 3)
            if (numOfImage > 3) numOfImage = 0
            binding.sphereView.animate().apply {
                duration = 915
                rotationBy(360f)
                rotationX(359f)
                

            }.start()


            when (numOfImage) {
                1 -> binding.sphereView.setImageResource(R.drawable.sphere_2)
                2 -> binding.sphereView.setImageResource(R.drawable.sphere_3)
                3 -> binding.sphereView.setImageResource(R.drawable.sphere_4)
                else -> binding.sphereView.setImageResource(R.drawable.sphere_1)
            }
        //    ++binding.sphereView.x
        }

    }
}