package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
    RadioButton radbtn;
    RadioGroup radgrp;
    Button btn;
    private void init(){
        radgrp=findViewById(R.id.radioGroup);
        btn=findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        init();
        getSupportActionBar().setTitle("Radio Button");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=radgrp.getCheckedRadioButtonId();
                radbtn =findViewById(selectedId);
                if(selectedId==-1){
                    Toast.makeText(RadioButtonActivity.this, "Noting is selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RadioButtonActivity.this,radbtn.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
