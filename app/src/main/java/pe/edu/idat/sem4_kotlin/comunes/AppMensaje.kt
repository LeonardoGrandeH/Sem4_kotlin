package pe.edu.idat.sem4_kotlin.comunes

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import pe.edu.idat.sem4_kotlin.R

object AppMensaje {

    fun enviarMensaje(vista: View, mensaje: String, tipoMensaje: TipoMensaje){
        val snackbar = Snackbar.make(vista, mensaje, Snackbar.LENGTH_LONG)
        val snackBarView: View = snackbar.view
        if(tipoMensaje == TipoMensaje.ERROR){
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(MiApp.instance,
                    R.color.errorColor)
            )
        }else{
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(MiApp.instance,
                    R.color.exitoColor))
        }
        snackbar.show()
    }

}