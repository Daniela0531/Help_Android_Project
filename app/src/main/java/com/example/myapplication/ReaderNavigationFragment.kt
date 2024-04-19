package com.example.myapplication

import android.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentReaderNavigationBinding


class ReaderNavigationFragment : Fragment() {

    private var _binding: FragmentReaderNavigationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReaderNavigationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToAppDiscriptionFromReader.setOnClickListener {
            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_AboutAppFragment)
        }

        binding.buttonToWriterModeFromReader.setOnClickListener {
            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_ReaderNavigationFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}