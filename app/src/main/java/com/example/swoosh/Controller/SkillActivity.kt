package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View){
        advanceBtn.isChecked = false
        skill = "beginner"
    }

    fun onAdvanceClicked(view: View){
        beginnerBtn.isChecked = false
        skill = "advance"
    }

    fun onSkillFinishClicked(view: View){
        if(skill != null) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select level", Toast.LENGTH_LONG).show()
        }
    }
}
