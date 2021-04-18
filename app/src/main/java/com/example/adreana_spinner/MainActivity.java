package com.example.adreana_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner spinner_2,spinner_3, spinner_1;
private String[] array_menu = {"Bakso", "Nasi Goreng","Seblak", "Sate"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_1 = findViewById(R.id.spinner_1);

        //Spinner 2
        spinner_2 = findViewById(R.id.spinner_2);
        ArrayAdapter<CharSequence> adapt = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_2.setAdapter(adapt);

        //Spinner 3
        spinner_3 = findViewById(R.id.spinner_3);
        ArrayAdapter<CharSequence> adapt2 = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, array_menu);
        adapt2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3.setAdapter(adapt2);

        //Merespon pilihan
        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String teks = spinner_1.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Spinner 1 Pilihan : "+teks,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void getTextfromSpinner2(View view){
        String teks =  spinner_2.getSelectedItem().toString();
        Toast.makeText(MainActivity.this, "Spinner 2 Pilihan : "+teks, Toast.LENGTH_SHORT).show();
    }
}