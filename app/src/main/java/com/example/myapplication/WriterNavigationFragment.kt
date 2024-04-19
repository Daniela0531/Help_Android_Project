package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentWriterNavigationBinding


class WriterNavigationFragment : Fragment() {
    private var _binding: FragmentWriterNavigationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentWriterNavigationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToAppDiscriptionFromWriter.setOnClickListener {
            findNavController().navigate(R.id.action_WriterNavigationFragment_to_AboutAppFragment)
        }

        binding.buttonToReaderModeFromWriter.setOnClickListener {
            findNavController().navigate(R.id.action_WriterNavigationFragment_to_ReaderNavigationFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
