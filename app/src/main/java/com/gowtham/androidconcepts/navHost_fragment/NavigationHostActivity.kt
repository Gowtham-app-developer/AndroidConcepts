package com.gowtham.androidconcepts.navHost_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gowtham.androidconcepts.databinding.ActivityMainBinding
import com.gowtham.androidconcepts.databinding.ActivityNavigationHostBinding

class NavigationHostActivity : AppCompatActivity() {

    // TODO ViewBinding - It generate us a view called Binding Class and with this binding class we can access our Views
    private lateinit var mMainActivityViewBinding: ActivityNavigationHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO mMainActivityViewBinding - here we are inflating our Layout and set that in the setContentView
        mMainActivityViewBinding = ActivityNavigationHostBinding.inflate(layoutInflater)
        setContentView(mMainActivityViewBinding.root)
        // TODO On Create - Calls When an Activity is Created
        Toast.makeText(this, "On Create Called", Toast.LENGTH_SHORT).show()

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

// TODO Topics Covered - Activity Life Cycle and View Binding