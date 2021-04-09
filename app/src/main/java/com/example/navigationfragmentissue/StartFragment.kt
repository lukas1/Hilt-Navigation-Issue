package com.example.navigationfragmentissue

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class StartFragment : Fragment(R.layout.fragment_start) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_startFragment_to_destinationFragment)
        }
    }
}