package com.example.colorart

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.colorart.databinding.FragmentBoxesBinding
import kotlin.random.Random


class BoxesFragment : Fragment() {

    private var _binding : FragmentBoxesBinding? = null
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
        _binding = FragmentBoxesBinding.inflate(inflater, container, false)

        val listBoxes : MutableList<TextView> = mutableListOf(
            binding.tvBox1,
            binding.tvBox2,
            binding.tvBox3,
            binding.tvBox4,
            binding.tvBox5,
            binding.tvBox6,
            binding.tvBox7,
            binding.tvBox8,
            binding.tvBox9,
            binding.tvBox10
        )

        binding.clBackground.setOnClickListener {
            it.setBackgroundColor(Color.LTGRAY)
            listBoxes.forEach{box ->
                box.setBackgroundColor(Color.WHITE)

            }
        }


        listBoxes.forEach {
            it.setOnClickListener {box ->
                box.setBackgroundColor(Color.rgb((0..255).random(), (0..255).random(), (0..255).random()))
            }
        }

        binding.ibRandom.setOnClickListener{
            val color = Color.rgb(
                (0..255).random(),
                (0..255).random(),
                (0..255).random()
            )

        }


        return binding.root
    }

}