package com.preeyanut.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    var username : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        username = findViewById(R.id.info_username) as TextView

        var intent = getIntent()
        username!!.setText(intent.getStringExtra("email"))
    }
}
