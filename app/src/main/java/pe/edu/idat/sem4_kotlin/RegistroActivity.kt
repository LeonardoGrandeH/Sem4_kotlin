package pe.edu.idat.sem4_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import pe.edu.idat.sem4_kotlin.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnListar.setOnClickListener(this)
        binding.btnRegistrar.setOnClickListener(this)
    }

    override fun onClick(vista: View) {
        when(vista.id){
            R.id.btnRegistrar -> registrarPersona()
                R.id.btnListar -> startActivity(Intent(applicationContext,
                                                    ListadoActivity::class.java))
        }
    }

    fun registrarPersona(){
        Toast.makeText(applicationContext, "Click en registro de persona",
            Toast.LENGTH_LONG).show()
    }
}