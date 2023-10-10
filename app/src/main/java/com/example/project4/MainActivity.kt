package com.example.project4

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project4.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.meterConvert.setOnClickListener{convertToCM()}
        binding.degreeConvert.setOnClickListener{convertToF()}



    }
    private fun convertToCM(){
        val textInput = binding.mNumber.text.toString()
        val mnumber = textInput.toDouble()
        val mTocm = 100
        val finalResult = mnumber/mTocm
        val formatResult = NumberFormat.getNumberInstance().format(finalResult)
        binding.finalResult.text =getString(R.string.unit_result, formatResult)
    }
    private fun convertToF(){
        val textInput = binding.cDegree.text.toString()
        val cnumber = textInput.toDouble()
        val x = 9/5
        val y = 32
        val finaldegree = (cnumber*x)+y
        val formatdegree = NumberFormat.getNumberInstance().format(finaldegree)
        binding.finalDegree.text =getString(R.string.degree_result, formatdegree)
    }

}