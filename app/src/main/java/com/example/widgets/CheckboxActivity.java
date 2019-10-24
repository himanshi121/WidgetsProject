package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {
    Button button ;
    CheckBox Noodles,Waffle,Coke,Burger,Pizza,Fries,Tacos,Pasta,Pie;

    private void init(){
        button=findViewById(R.id.button39);
        Noodles=findViewById(R.id.checkBox);
        Waffle=findViewById(R.id.checkBox2);
        Coke=findViewById(R.id.checkBox3);
        Burger=findViewById(R.id.checkBox4);
        Pizza=findViewById(R.id.checkBox5);
        Fries=findViewById(R.id.checkBox6);
        Tacos=findViewById(R.id.checkBox7);
        Pasta=findViewById(R.id.checkBox8);
        Pie=findViewById(R.id.checkBox9);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        init();
        getSupportActionBar().hide();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalAmount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:\n\n");
                if(Noodles.isChecked()){
                    result.append("Noodles : ₹100\n");
                    totalAmount+=200;
//                    ctrl+alt+4   =  ₹
                }
                if(Coke.isChecked()){
                    result.append("Coke : ₹60\n");
                    totalAmount+=60;
                }
                if(Waffle.isChecked()){
                    result.append("Waffle : ₹120\n");
                    totalAmount+=120;
                }
                if(Burger.isChecked()){
                    result.append("Burger : ₹85\n");
                    totalAmount+=85;
                }
                if(Pizza.isChecked()){
                    result.append("Pizza : ₹200\n");
                    totalAmount+=200;
                }
                if(Fries.isChecked()){
                    result.append("Fries : ₹65\n");
                    totalAmount+=65;
                }
                if(Tacos.isChecked()){
                    result.append("Tacos : ₹90\n");
                    totalAmount+=90;
                }
                if(Pasta.isChecked()){
                    result.append("Pasta : ₹135\n");
                    totalAmount+=135;
                }
                if(Pie.isChecked()){
                    result.append("Pie : ₹99\n");
                    totalAmount+=99;
                }
                result.append("\nTotal Amount : ₹"+ totalAmount);
                Toast.makeText(CheckboxActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
