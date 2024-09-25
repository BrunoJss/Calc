package br.unimes.calc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_usuario)


        val btnSair = findViewById<FloatingActionButton>(R.id.fab_volta)
        val btnAtualizar = findViewById<Button>(R.id.btn_atualizar)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)

        val edtNome = findViewById<TextView>(R.id.edt_nome)
        val edtTel = findViewById<TextView>(R.id.edt_tel)
        val edtIdade = findViewById<TextView>(R.id.edt_idade)
        val edtmail = findViewById<TextView>(R.id.edt_mail)
        val edtPix = findViewById<TextView>(R.id.edt_pix)

        edtNome.text = intent.getStringExtra("nome_usuario")


        btnAtualizar.setOnClickListener{
            edtNome.isEnabled = true
            edtTel.isEnabled = true
            edtIdade.isEnabled = true
            edtmail.isEnabled = true
            edtPix.isEnabled = true
        }

        btnAtualizar.setOnClickListener{
            edtNome.isEnabled = false
            edtTel.isEnabled = false
            edtIdade.isEnabled = false
            edtmail.isEnabled = false
            edtPix.isEnabled = false
        }

        btnSair.setOnClickListener{
            finish()
        }


    }
}