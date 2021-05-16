package com.devjay.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var nickname_EditText: EditText
    lateinit var nickname_Text: TextView
    lateinit var done_Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        done_Button = findViewById(R.id.done_btn)
        done_Button.setOnClickListener {
           addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        nickname_Text = findViewById(R.id.nickname_text)
        nickname_EditText =findViewById(R.id.nickname_edit)

        nickname_Text.text = nickname_EditText.text
        nickname_EditText.visibility = View.GONE
        nickname_Text.visibility = View.VISIBLE
        done_Button.visibility = View.GONE

        // hide the keyboard
        val imm =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
