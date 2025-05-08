package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnGoA).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_a)
        }

        view.findViewById<Button>(R.id.btnGoX).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_c)
        }
    }
}
