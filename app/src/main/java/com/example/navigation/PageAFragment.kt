package com.example.navigation
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class PageAFragment : Fragment(R.layout.fragment_page_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btnGoB).setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }
    }
}
