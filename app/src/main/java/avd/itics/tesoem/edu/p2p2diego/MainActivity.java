package avd.itics.tesoem.edu.p2p2diego;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listaEstados;
    String[] strEstados;
    Spinner objSpinner;
    ArrayAdapter<String> listEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objSpinner = findViewById(R.id.cargalista);
        strEstados = new String[] {"CDMX","Estado de Mexico","Sonora","Yucatan","Veracruz"};
        listaEstados = new ArrayList<String>();
        Collections.addAll(listaEstados,strEstados);
        listEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listaEstados);
        objSpinner.setAdapter(listEstados);
    }
}
