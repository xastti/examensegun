package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText primer_Par = findViewById(R.id.primer_par);
        EditText segundo_Par = findViewById(R.id.segundo_par);
        Button button = findViewById(R.id.buttoncal);
        TextView resultText = findViewById(R.id.prome);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String primer = primer_Par.getText().toString();
                String segundo = segundo_Par.getText().toString();

                double notaPrimerParcial = Double.parseDouble(primer);
                double notaSegundoParcial = Double.parseDouble(segundo);

                // Calcular el promedio
                double promedio = (notaPrimerParcial + notaSegundoParcial) / 2;

                // Mostrar el promedio en el TextView
                resultText.setText("El promedio es: " + promedio);
            }
        });
    }
}

