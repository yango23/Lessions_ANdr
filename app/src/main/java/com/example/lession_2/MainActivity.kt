package com.example.lession_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    private val startsting = "Я утверждю что это ОВАЛ!!!"
    private val changedstring = "KEK"
    private var textPoleCh = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        val t1 = this.findViewById<TextView>(R.id.midText)
        val t2 = this.findViewById<TextView>(R.id.topText)
        val t3 = this.findViewById<EditText>(R.id.textPole)

        t1.text = this.changedstring
        t2.text = this.startsting
        t3.setSelectAllOnFocus(true);
        textPoleCh = t3.text.toString()

            t3.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (s ==null || s.isEmpty()) {
                        t1.text = changedstring
                    } else {
                        t1.text = s
                    }
                }

            })
    }
}

