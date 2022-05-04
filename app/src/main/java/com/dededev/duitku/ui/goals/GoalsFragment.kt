package com.dededev.duitku.ui.goals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.dededev.duitku.databinding.FragmentGoalsBinding

class GoalsFragment : Fragment() {
    private var _binding: FragmentGoalsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val goalsViewModel =
            ViewModelProvider(this)[GoalsViewModel::class.java]

        _binding = FragmentGoalsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGoals
        goalsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}