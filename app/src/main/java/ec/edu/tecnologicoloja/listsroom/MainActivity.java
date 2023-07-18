package ec.edu.tecnologicoloja.listsroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import ec.edu.tecnologicoloja.listsroom.database.Persona;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button guardar;

    private EditText nombre;

    private Button limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardar=findViewById(R.id.guardar);
        limpiar=findViewById(R.id.limpiar);
        nombre=findViewById(R.id.editTextTextNombrePersona);



        guardar.setOnClickListener(this);
        limpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==guardar){

            String Nombre = nombre.getText().toString();
            Persona persona = new Persona(0, Nombre, null);

        }else if(v==limpiar){


        }

    }
}