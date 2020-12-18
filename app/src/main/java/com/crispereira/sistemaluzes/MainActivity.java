package com.crispereira.sistemaluzes;

import android.graphics.Color;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static com.crispereira.sistemaluzes.Bloco.createBloco;

public class MainActivity extends AppCompatActivity {
    private final int AMARELO = Color.YELLOW;
    private final int CINZA = Color.GRAY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bloco txtBloco1 = createBloco("Bloco 1");
        Bloco txtBloco2 = createBloco("Bloco 2");
        Bloco txtBloco3 = createBloco("Bloco 3");

        TextView luz1 = findViewById(R.id.txtluz3);
        TextView luz2 = findViewById(R.id.txtluz2);
        TextView luz3 = findViewById(R.id.luz3);

        Switch s1 = findViewById(R.id.s1);
        Switch s2 = findViewById(R.id.s2);
        Switch s3 = findViewById(R.id.s3);

        if (txtBloco1.getEstadoLuzes()) {
            luz1.setBackgroundColor(AMARELO);
            s1.setChecked(true);
        } else {
            luz1.setBackgroundColor(CINZA);
        }

        if (txtBloco2.getEstadoLuzes()) {
            luz2.setBackgroundColor(AMARELO);
            s2.setChecked(true);
        } else {
            luz2.setBackgroundColor(CINZA);
        }

        if (txtBloco3.getEstadoLuzes()) {
            luz3.setBackgroundColor(AMARELO);
            s3.setChecked(true);
        } else {
            luz3.setBackgroundColor(CINZA);
        }


        s1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtBloco1.acendeLampada();
                luz1.setBackgroundColor(AMARELO);
            } else {
                txtBloco1.apagaLampada();
                luz1.setBackgroundColor(CINZA);
            }
        });

        s2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtBloco2.acendeLampada();
                luz2.setBackgroundColor(AMARELO);
            } else {
                txtBloco2.apagaLampada();
                luz2.setBackgroundColor(CINZA);
            }
        });

        s3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtBloco3.acendeLampada();
                luz3.setBackgroundColor(AMARELO);
            } else {
                txtBloco3.apagaLampada();
                luz3.setBackgroundColor(CINZA);
            }
        });
    }
}