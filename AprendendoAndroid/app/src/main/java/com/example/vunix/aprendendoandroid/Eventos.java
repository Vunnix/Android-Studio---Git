package com.example.vunix.aprendendoandroid;

import android.app.Activity;
import android.app.usage.UsageEvents;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by vunix on 28/05/16.
 */public class Eventos
{

    private Button btnCalcular;
    private EditText editValor;
    private Activity activity;

    public Eventos(Activity activity){
        this.activity = activity;

    }
    public void inicializarComponentes(){
        IniComponentes();
        DefinirEventos();
    }
    private void IniComponentes()
    {
        editValor =  (EditText) activity.findViewById(R.id.editValor);
        btnCalcular =  (Button) activity.findViewById(R.id.btnCalcular);
    }

    private void DefinirEventos()
    {
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(activity);
                String strValor = editValor.getText().toString();
                Double valorDouble = Double.parseDouble(strValor);
                dlg.setMessage("Seu dízimo deve ser: "+valorDouble*0.10);
                dlg.show();
            }
        });

    }
}