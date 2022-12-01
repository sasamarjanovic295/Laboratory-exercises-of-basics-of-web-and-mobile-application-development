package com.example.thirdapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class BestPlayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_best_player, container, false)
        val btnBack = view.findViewById<Button>(R.id.button3)
        val textViewBP = view.findViewById<TextView>(R.id.textView2)
        textViewBP.text = arguments?.getString("BS").toString()

        btnBack.setOnClickListener {
            val psFragment = PlayersFragment()
            val fragmentTransaction: FragmentTransaction? = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.mainContainer, psFragment)
            fragmentTransaction?.commit()
        }

        return view
    }

}