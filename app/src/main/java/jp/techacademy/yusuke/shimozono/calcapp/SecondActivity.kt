package jp.techacademy.yusuke.shimozono.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*//追記

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val answer = intent.getDoubleExtra("VALUE1", 0.0)

        tvAnswer.text = answer.toString()
    }
}