package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ButtonActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    EditText number;
    float mValueOne,mValueTwo;
    boolean AddNum,SubNum,MulNum,DivNum;

    private void init(){
        b0=findViewById(R.id.button0);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        b13=findViewById(R.id.button13);
        b14=findViewById(R.id.button14);
        b15=findViewById(R.id.button15);
        b16=findViewById(R.id.button16);
        b17=findViewById(R.id.button17);
        number=findViewById(R.id.editText);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        getSupportActionBar().hide();
        init();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number==null){
                    number.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(number.getText()+"");
                    AddNum=true;
                    number.setText(null);
                }
//                +

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(number.getText()+"");
                SubNum=true;
                number.setText(null);
//                -
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(number.getText()+"");
                DivNum=true;
                number.setText(null);
//                /div
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(number.getText()+"");
                MulNum=true;
                number.setText(null);
//                *
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(number.getText() + "");
                if (AddNum==true){
                    number.setText(mValueOne+mValueTwo+"");
                    AddNum=false;
                }
                if (SubNum==true){
                    number.setText(mValueOne-mValueTwo+"");
                    SubNum=false;
                }
                if (MulNum==true){
                    number.setText(mValueOne*mValueTwo+"");
                    MulNum=false;
                }
                if (DivNum==true){
                    number.setText(mValueOne/mValueTwo+"");
                    DivNum=false;
                }
//                =

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+".");

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(ButtonActivity.this,Button2Activity.class);
                startActivity(intent);
            }
        });

    }
}
