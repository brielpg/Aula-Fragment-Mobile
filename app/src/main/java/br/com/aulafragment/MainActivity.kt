package br.com.aulafragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var button_cadastro: Button
    private lateinit var button_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button_cadastro = findViewById(R.id.button_cadastro)
        button_login = findViewById(R.id.button_login)

        button_cadastro.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, CadastroFragment()).commit()
        }

        button_login.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, LoginFragment()).commit()
        }
    }
}