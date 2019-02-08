package com.novadev.mvvmexample.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.novadev.mvvmexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configView()
    }

    private fun configView(){
        btGoToViewModelActivity.setOnClickListener{
            val intent = Intent(this,ViewModelSumarActivity::class.java)
            startActivity(intent)
        }
    }
}
