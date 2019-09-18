package cecilia.moron.login_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() { //los dos puntos significan que son HERENCIA o EXTENDS

    override fun onCreate(savedInstanceState: Bundle?) { //fun significa FUNCION O METODO, savedInstance hereda la clase Bundle/ ? puede o no ser nulo
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //esta clase (main activity le corresponde un layaut

        val user = editText.text.toString()
        val pass = etPass.text.toString()

        btnEntrar.setOnClickListener() {

            if (user.equals("") or pass.equals("")) { //si user o pass es = a vacio, enviamos un mensajito
                mensaje(mensaje: "Datos vacíos", Toast.LENGTH_LONG)

            } else {
                if (use.equals("cecy") and pass.equials("1234")) {
                    mensaje(mensaje: "Bienvenido!!!")
                } else {
                    mensaje(mensaje: "no te conozco")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.w(tag: "ejemplo", msg: "Debo estar en el onStart")
    }

    fun mensaje (mensaje:String,dur:Int= Toast.LENGTH_SHORT){
        Toast.makeText(context:this,mensaje,dur).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
        // La actividad ya no es visible (ahora está "detenida")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
        // La actividad está a punto de ser destruida.
    }
}

