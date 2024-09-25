package br.unimes.calc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtPass = findViewById<EditText>(R.id.edt_senha)
        val btnEntrar = findViewById<Button>(R.id.btn_entrar)


        btnEntrar.setOnClickListener{
            val email= edtEmail.text.toString()
            val pass = edtPass.text.toString().toInt()

            if(email.equals("bruno")&&pass==123){
                Toast.makeText(this, "Bem-vindo!", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, UsuarioActivity::class.java)

                intent.putExtra("nome_usuario", email)

                startActivity(intent)
            } else {
                Toast.makeText(this, "Dados incorretos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}