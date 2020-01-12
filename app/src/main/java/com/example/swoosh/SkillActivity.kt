package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SkillActivity : BaseActivity () {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun leagueNextClicked(view: View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
