package ru.samitin.myexzamen.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.samitin.myexzamen.R
import ru.samitin.myexzamen.databinding.ListfragmentBinding
import ru.samitin.myexzamen.databinding.QuizfragBinding


class QuizFragment : Fragment() {
    var _binding : QuizfragBinding?= null
    val binding: QuizfragBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = QuizfragBinding.inflate(inflater)
        return binding.root
    }
}