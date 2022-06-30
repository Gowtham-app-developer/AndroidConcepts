package com.gowtham.androidconcepts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gowtham.androidconcepts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mMainActivityViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainActivityViewBinding.root)
        // TODO On Create - Calls When an Activity is Created
        Toast.makeText(this, "On Create Called", Toast.LENGTH_SHORT).show()

        mMainActivityViewBinding.moveNext.setOnClickListener {

            // TODO Intent - For Screen Navigation
            val mIntent = Intent(this, SecondActivity::class.java)
            startActivity(mIntent)

        }
    }

    override fun onStart() {
        super.onStart()
        // TODO On Start - Calls When an Activity is Visible to the User
        Toast.makeText(this, "On Start Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        // TODO On Start - Calls When an Activity Starts interacting to the User
        Toast.makeText(this, "On Resume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        // TODO On Start - Calls When an Activity Starts interacting to the User
        Toast.makeText(this, "On Pause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        // TODO On Start - Calls When an Activity is not Visible to the User
        Toast.makeText(this, "On Stop Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        // TODO On Start - Calls When an Activity is Stopped, Prior to Start
        Toast.makeText(this, "On Restart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        // TODO On Start - Calls When an Activity is no Longer Visible
        Toast.makeText(this, "On Destroy Called", Toast.LENGTH_SHORT).show()
    }
}