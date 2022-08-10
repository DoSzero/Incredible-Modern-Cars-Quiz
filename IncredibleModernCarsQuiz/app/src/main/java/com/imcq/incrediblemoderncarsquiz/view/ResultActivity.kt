package com.imcq.incrediblemoderncarsquiz.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imcq.incrediblemoderncarsquiz.databinding.ActivityResultBinding
import com.imcq.incrediblemoderncarsquiz.model.Constants


class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding .inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvResult.text = "Ваш счет $correctAnswers из $totalQuestions."
        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }

    }
}