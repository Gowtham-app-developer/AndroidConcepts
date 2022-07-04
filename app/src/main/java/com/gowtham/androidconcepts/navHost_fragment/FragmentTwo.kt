package com.gowtham.androidconcepts.navHost_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gowtham.androidconcepts.R
import com.gowtham.androidconcepts.databinding.FragmentOneBinding
import com.gowtham.androidconcepts.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    // TODO ViewBinding - It generate us a view called Binding Class and with this binding class we can access our Views
    private lateinit var mMainFragmentViewBinding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // TODO mMainFragmentViewBinding - here we are inflating our Layout and set that in the setContentView
        mMainFragmentViewBinding = FragmentTwoBinding.inflate(layoutInflater)

        // TODO Setting the Button On Click
        mMainFragmentViewBinding.txtSecondFragment.setOnClickListener {

            // TODO Navigating from One Fragment to another Fragment
            Navigation.findNavController(mMainFragmentViewBinding.root).navigate(R.id.action_fragmentTwo_to_fragmentOne)

        }

        return mMainFragmentViewBinding.root
    }

}