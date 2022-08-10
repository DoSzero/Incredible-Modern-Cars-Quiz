package com.imcq.incrediblemoderncarsquiz.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.imcq.incrediblemoderncarsquiz.databinding.ActivityMainBinding
import com.imcq.incrediblemoderncarsquiz.model.Constants


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            if (binding.etName.text?.isEmpty() == true) {
                Toast.makeText(this@MainActivity, "Пожалуйста, введите Ваше имя", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}