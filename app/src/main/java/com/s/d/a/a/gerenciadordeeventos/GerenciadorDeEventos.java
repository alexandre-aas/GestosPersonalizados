package com.s.d.a.a.gerenciadordeeventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GerenciadorDeEventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciador_de_eventos);

        //Registra o gerenciador de eventos do botao p/ um clique. Esse registro ocorre apenas uma vez
        //por isso foi definido dentro do onCreate
        Button btnCliqueAqui = findViewById(R.id.btnPressionar);
        btnCliqueAqui.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                //Implementacao do codigo que vai ser executado com o botao for clicado
                //Define um novo texto p/ o TextView
                TextView txvNome = findViewById(R.id.txvNome);
                txvNome.setText("Clicou no Botão...");

            }
        });

        //Registra o gerenciador de eventos do botao p/ um "segurou clicado". Esse registro ocorre apenas uma vez
        //por isso foi definido dentro do onCreate
        //Varios eventos diferentes podem ser implementados
        btnCliqueAqui.setOnLongClickListener(new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                TextView txvNome = (TextView) findViewById(R.id.txvNome);
                txvNome.setText("Clicou e segurou clicado...");
                return true;

            }

        });
    }
}
