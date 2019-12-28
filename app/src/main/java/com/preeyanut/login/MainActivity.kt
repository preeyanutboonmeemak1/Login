package com.preeyanut.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var email : EditText? = null
    var password : EditText? = null
    var btn_login : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email) as EditText
        password = findViewById(R.id.password) as EditText
        btn_login = findViewById(R.id.login) as Button

        btn_login!!.setOnClickListener{
            var intent = Intent(this,AboutActivity::class.java)
            intent.putExtra("email",email!!.getText().toString())
            intent.putExtra("password",password!!.getText().toString())
            startActivity(intent)
        }
    }
}
