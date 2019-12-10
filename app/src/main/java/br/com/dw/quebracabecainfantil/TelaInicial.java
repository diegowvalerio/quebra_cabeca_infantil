package br.com.dw.quebracabecainfantil;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelaInicial extends AppCompatActivity {
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void comercarjogo(View view){
        ArrayList<String> itens = new ArrayList<>();

        itens.add("Animais");
        itens.add("Veiculos");
        itens.add("Objetos");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item_alerta, itens);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("O que deseja fazer ?");
        builder.setSingleChoiceItems(adapter, 0, new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void onClick(DialogInterface arg0, int arg1) {

                if(arg1 == 0){
                    Intent intent = new Intent(TelaInicial.this,ListaJogos.class);
                    startActivity(intent);

                    alerta.dismiss();
                }else if(arg1 ==1){

                    alerta.dismiss();
                }else if(arg1 ==2) {

                    alerta.dismiss();
                }
            }
        });
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}
