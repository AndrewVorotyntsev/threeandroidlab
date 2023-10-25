package com.example.threelab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

const val KEY_TEXT = "KEY_TEXT"

class MainActivity : AppCompatActivity() {

  private var etField: EditText? = null
  private var btnNextScreen: Button? = null

  private var text: String = ""

  override fun onDestroy() {
    super.onDestroy()
    etField = null
    btnNextScreen = null
  }


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    initViews()
    initListeners()
  }

  private fun initViews() {
    etField = findViewById(R.id.etField)
    btnNextScreen = findViewById(R.id.btnNextScreen)
  }

  private fun initListeners() {
    etField?.doOnTextChanged { newText, _, _, _ ->
      text = newText.toString()
    }
    btnNextScreen?.setOnClickListener { goNextScreen() }
  }

  private fun goNextScreen() {
    val intent = Intent(this, SecondActivity::class.java).apply {
      putExtra(KEY_TEXT, text)
    }
    startActivity(intent)
  }
}