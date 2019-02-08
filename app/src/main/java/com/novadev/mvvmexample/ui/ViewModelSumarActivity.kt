package com.novadev.mvvmexample.ui


import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.novadev.mvvmexample.R
import com.novadev.mvvmexample.Sumar
import com.novadev.mvvmexample.viewmodel.SumarViewModel
import kotlinx.android.synthetic.main.activity_view_model_sumar.*

class ViewModelSumarActivity : AppCompatActivity() {

    var sumarViewModel = SumarViewModel()
    var numero: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_sumar)

        configView()
    }

    private fun configView(){
        // cada vez que se gira y se crea una nueva activity el view model pasa los datos de la activity vieja a la nueva
        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel::class.java)

        tvSumarConViewModel.text = "" + sumarViewModel.resultado
        tvSumarSinViewModel.text = "" + numero

        btSumar.setOnClickListener{
            numero = Sumar.sumar(numero)
            tvSumarSinViewModel.text = "" + numero

            sumarViewModel.resultado = Sumar.sumar(sumarViewModel.resultado)
            tvSumarConViewModel.text = "" + sumarViewModel.resultado
        }
    }
}
