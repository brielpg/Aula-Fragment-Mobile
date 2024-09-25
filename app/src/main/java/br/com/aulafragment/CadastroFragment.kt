package br.com.aulafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CadastroFragment : Fragment() {
    private lateinit var imprimir: TextView
    private lateinit var editTxt: EditText
    private lateinit var enviar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        imprimir = view.findViewById(R.id.textView3)
        editTxt = view.findViewById(R.id.editTextText)
        enviar = view.findViewById(R.id.button)

        enviar.setOnClickListener{
            imprimir.setText("Seja Bem-Vindo(a) ${editTxt.text}")
        }

        return view
    }
}