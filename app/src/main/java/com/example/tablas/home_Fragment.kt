package com.example.tablas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class home_Fragment : Fragment() {

    lateinit var botonPrincipiante:Button
    lateinit var botonIntermedio:Button
    lateinit var botonDificil:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val vista = inflater.inflate(R.layout.fragment_home_, container, false)

        botonPrincipiante = vista.findViewById(R.id.btnPrincipiante)
        botonPrincipiante.setOnClickListener {
            findNavController().navigate(R.id.action_home_Fragment_to_principiante_Fragment)
        }

        botonIntermedio = vista.findViewById(R.id.btnHomeIntermedio)
        botonIntermedio.setOnClickListener {
            findNavController().navigate(R.id.action_home_Fragment_to_fragment_intermedio)
        }

        botonDificil = vista.findViewById(R.id.btnHomeDificil)
        botonDificil.setOnClickListener {
            findNavController().navigate(R.id.action_home_Fragment_to_fragment_dificil)
        }


        return vista
    }
}
