package com.example.threelab

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.threelab.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySecondBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivitySecondBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)
    initViews()
  }

  private fun initViews() {
    val myText= intent.getStringExtra(KEY_TEXT) ?: "empty"
    binding.tvInfo.text = myText
  }

}
