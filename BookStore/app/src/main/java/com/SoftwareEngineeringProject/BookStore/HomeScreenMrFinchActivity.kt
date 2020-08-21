package com.SoftwareEngineeringProject.BookStore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.home_screen_mr_finch_activity.*


class HomeScreenMrFinchActivity : AppCompatActivity() {

    override fun onBackPressed() { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen_mr_finch_activity)

        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()

        logOutBtn.setOnClickListener {
            Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent)
        }

        bookSearchBtn.setOnClickListener {
            val intent = Intent(this, BookSearch::class.java)
            startActivity(intent)
        }


    }
}