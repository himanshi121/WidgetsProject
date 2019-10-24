package com.example.widgets;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
    AutoCompleteTextView completetext;
    String[] countries={
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
        completetext=findViewById(R.id.autoCompleteTextView);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        getSupportActionBar().hide();
        init();
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.select_dialog_item,countries);
        completetext.setAdapter(adapter);
        completetext.setThreshold(1);
    }
}
