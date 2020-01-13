package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.Controller.BaseActivity
import com.example.swoosh.Controller.LeagueActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent )
        }
    }
}
