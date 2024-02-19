package pe.edu.idat.sem4_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import pe.edu.idat.sem4_kotlin.databinding.ActivityListadoBinding
import android.R

class ListadoActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityListadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listarpersonas = intent.getSerializableExtra("listarpersonas")
                as ArrayList<String>
        val adapter = ArrayAdapter(applicationContext,
            R.layout.simple_list_item_1,
            listarpersonas)
        binding.listviewp.adapter = adapter
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}