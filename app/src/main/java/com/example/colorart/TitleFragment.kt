package com.example.colorart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.colorart.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    private var _binding : FragmentTitleBinding? = null
    val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.btnBoxes.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_boxesFragment)
        }

        return binding.root
    }
}