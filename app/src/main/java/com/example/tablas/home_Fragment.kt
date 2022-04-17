package com.example.tablas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class home_Fragment : Fragment() {

    lateinit var boton:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val vista = inflater.inflate(R.layout.fragment_home_, container, false)
        boton = vista.findViewById(R.id.btnPrincipiante)
        boton.setOnClickListener {
            findNavController().navigate(R.id.action_home_Fragment_to_principiante_Fragment)
        }
        return vista
    }
}
