package com.halabware.poetrylove.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.halabware.poetrylove.R
import com.halabware.poetrylove.viewmodels.PoemViewModel

class PoemFragment : Fragment() {

    companion object {
        fun newInstance() = PoemFragment()
    }

    private lateinit var viewModel: PoemViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.poem_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PoemViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
