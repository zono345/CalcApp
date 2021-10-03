package jp.techacademy.yusuke.shimozono.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//以下は追加
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.TextureView
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)
        btnTimes.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (editText1.text.toString().isEmpty() || editText2.text.toString().isEmpty()) {
            Snackbar.make(v,"2つの入力欄の両方に数値を入力してください", Snackbar.LENGTH_LONG).show()
        } else {
            var nb1:Double = editText1.text.toString().toDouble()
            var nb2:Double = editText2.text.toString().toDouble()
            var ans: Double = 0.0

            when (v.id) {
                R.id.btnPlus -> {
                    ans = nb1 + nb2
                }
                R.id.btnMinus -> {
                    ans = nb1 - nb2
                }
                R.id.btnTimes -> {
                    ans = nb1 * nb2
                }
                R.id.btnDivide -> {
                    ans = nb1 / nb2
                }
            }

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", ans)
        startActivity(intent)
        }
    }
}

