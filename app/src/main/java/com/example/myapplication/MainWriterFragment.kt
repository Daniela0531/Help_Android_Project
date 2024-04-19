package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentMainWriterBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MainWriterFragment : Fragment() {

    private var _binding: FragmentMainWriterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainWriterBinding.inflate(inflater, container, false)
        return binding.root

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.toWrite.setOnClickListener {
//            findNavController().navigate(R.id.action_MainWriterFragment_to_WritingFragment)
//        }
//
//        binding.writerSettings.setOnClickListener {
//            findNavController().navigate(R.id.action_MainWriterFragment_to_WriterSettingsFragment)
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}