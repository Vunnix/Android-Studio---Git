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

    private Button btnEntrar;
    private EditText editLogin;
    private EditText editSenha;
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
        editLogin =  (EditText) activity.findViewById(R.id.editLogin);
        editSenha = (EditText) activity.findViewById(R.id.editSenha);
        btnEntrar =  (Button) activity.findViewById(R.id.btnEntrar);
    }

    private void DefinirEventos()
    {
        btnEntrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(activity);
                dlg.setMessage("Clicou no botão");
                dlg.show();
            }
        });


    }
}