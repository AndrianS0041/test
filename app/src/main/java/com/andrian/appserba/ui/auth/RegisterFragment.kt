package com.andrian.appserba.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andrian.appserba.R
import com.andrian.appserba.data.repository.AuthRepository
import com.andrian.appserba.databinding.ActivityMainBinding
import com.andrian.appserba.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    val viewModel: AuthViewModel by lazy { AuthViewModel(AuthRepository()) }
    lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

}