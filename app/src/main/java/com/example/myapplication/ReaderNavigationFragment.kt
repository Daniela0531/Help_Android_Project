package com.example.myapplication

import android.R
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R.layout.fragment_reader_navigation

class ReaderNavigationFragment : Fragment() {
    private var mListener: MainReaderFragment.OnFragmentInteractionListener? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("navigation reader fragment", "I am created!")
        return inflater.inflate(fragment_reader_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val childFragment: Fragment = MainReaderFragment()
        val transaction = childFragmentManager.beginTransaction()
//        transaction.replace(R.id.child_fragment_container, childFragment).commit()
    }

    //    private var _binding: FragmentReaderNavigationBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentReaderNavigationBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonToAppDiscriptionFromReader.setOnClickListener {
//            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_AboutAppFragment)
//        }
//
//        binding.buttonToWriterModeFromReader.setOnClickListener {
//            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_ReaderNavigationFragment)
//        }
//    }


//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        mListener = if (context is OnFragmentInteractionListener) {
//            context
//        } else {
//            throw RuntimeException(
//                context.toString()
//                        + " must implement OnFragmentInteractionListener"
//            )
//        }
//    }
    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnFragmentInteractionListener {
        fun messageFromParentFragment(uri: Uri?)
    }
}

//class ReaderNavigationFragment : Fragment() {
//
//    private var _binding: FragmentReaderNavigationBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentReaderNavigationBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonToAppDiscriptionFromReader.setOnClickListener {
//            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_AboutAppFragment)
//        }
//
//        binding.buttonToWriterModeFromReader.setOnClickListener {
//            findNavController().navigate(com.example.myapplication.R.id.action_WriterNavigationFragment_to_ReaderNavigationFragment)
//        }
//    }
//
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}