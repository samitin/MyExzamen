package ru.samitin.myexzamen.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.samitin.myexzamen.R
import ru.samitin.myexzamen.databinding.ListfragmentBinding
import ru.samitin.myexzamen.databinding.ResultfragBinding


class ResultFragment : Fragment() {
    var _binding : ResultfragBinding?= null
    val binding: ResultfragBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = ResultfragBinding.inflate(inflater)
        return binding.root
    }
}