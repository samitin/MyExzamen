package ru.samitin.myexzamen.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.samitin.myexzamen.R
import ru.samitin.myexzamen.databinding.DetailfragBinding
import ru.samitin.myexzamen.databinding.ListfragmentBinding


class ListFragment : Fragment() {
    var _binding : ListfragmentBinding?= null
    val binding: ListfragmentBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = ListfragmentBinding.inflate(inflater)
        return binding.root
    }
}