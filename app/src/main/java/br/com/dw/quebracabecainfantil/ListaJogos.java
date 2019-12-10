package br.com.dw.quebracabecainfantil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;

public class ListaJogos extends AppCompatActivity {

    public GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_jogos);

        gridView = findViewById(R.id.view);
    }

    public void  voltar(View view){
        finish();
    }
}
