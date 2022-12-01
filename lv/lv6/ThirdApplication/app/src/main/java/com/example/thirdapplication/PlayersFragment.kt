package com.example.thirdapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.FragmentTransaction

class PlayersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_players, container, false)

        val btnGo = view.findViewById<Button>(R.id.button2)

        btnGo.setOnClickListener {

            val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup2)
            var radioButton = view.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)

            var bsFragment = BestPlayerFragment()
            val bundle = Bundle()
            bundle.putString("BS", radioButton.text.toString())
            bsFragment.arguments = bundle

            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.mainContainer, bsFragment)
            fragmentTransaction?.commit()
        }

        return view
    }
}