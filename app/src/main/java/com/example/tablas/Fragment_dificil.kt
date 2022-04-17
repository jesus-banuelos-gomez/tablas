package com.example.tablas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class Fragment_dificil : Fragment() {

    lateinit var boton:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val vista = inflater.inflate(R.layout.fragment_dificil, container, false)
        boton = vista.findViewById(R.id.btnDificilHome)
        boton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_dificil_to_home_Fragment)
        }
        return vista
    }
 }
