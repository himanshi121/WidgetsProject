package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spin ;
    String[] countries={"Select Country:",
            "Afghanistan",
            "Albania",
            "Algeria",
            "Bahrain",
            "Bangladesh",
            "Bhutan",
            "Cambodia",
            "Cameroon",
            "Canada",
            "Denmark",
            "Djibouti",
            "Dominica",
            "Ecuador",
            "Egypt",
            "El Salvador",
            "Fiji",
            "Finland",
            "France",
            "Georgia" ,
            "Germany" ,
            "Ghana" ,
            "Haiti" ,
            "Honduras",
            "Hungary",
            "Iceland",
            "India" ,
            "Indonesia",
            "Jamaica" ,
            "Japan" ,
            "Jordan",
            "Kazakhstan",
            "Kenya",
            "Kiribati",
            "Laos",
            "Latvia",
            "Lebanon",
            "Madagascar",
            "Malawi",
            "Malaysia",
            "Namibia",
            "Nauru",
            "Nepal",
            "Oman",
            "Pakistan",
            "Peru",
            "Philippines",
            "Qatar",
            "Romania",
            "Russia",
            "Rwanda",
            "Saudi Arabia",
            "Singapore",
            "South Africa",
            "Taiwan",
            "Tajikistan",
            "Thailand",
            "United Arab Emirates",
            "United Kingdom",
            "United States",
            "Vatican City",
            "Venezuela",
            "Vietnam",
            "Yemen",
            "Zambia",
            "Zimbabwe"
            };

    private void init(){
        spin=findViewById(R.id.spinner);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        init();
        getSupportActionBar().hide();
        ArrayAdapter adapter =new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,countries);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerActivity.this, countries[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
