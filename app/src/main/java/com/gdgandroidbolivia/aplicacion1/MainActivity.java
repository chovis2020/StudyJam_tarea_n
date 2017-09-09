package com.gdgandroidbolivia.aplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(TextView)findViewById(R.id.texto);
    }
    public void cambiarTexto(View vista){
        texto.setText("POKEMON");

    }
}
