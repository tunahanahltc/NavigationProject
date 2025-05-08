package com.example.navigation
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class PageXFragment : Fragment(R.layout.fragment_page_c) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btnGoY).setOnClickListener {
            findNavController().navigate(R.id.action_c_to_d)
        }
    }
}
