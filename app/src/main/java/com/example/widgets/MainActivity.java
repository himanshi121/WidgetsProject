package com.example.widgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;

    private void init(){
        b1=findViewById(R.id.button);
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
        b18=findViewById(R.id.button18);
        b19=findViewById(R.id.button19);
        b20=findViewById(R.id.button20);
        b21=findViewById(R.id.button21);
        b22=findViewById(R.id.button22);
        b23=findViewById(R.id.button23);
        b24=findViewById(R.id.button24);
        b25=findViewById(R.id.button25);
        b26=findViewById(R.id.button26);
        b27=findViewById(R.id.button27);
        b28=findViewById(R.id.button28);
        b29=findViewById(R.id.button29);
        b30=findViewById(R.id.button30);
        b31=findViewById(R.id.button31);
        b32=findViewById(R.id.button32);
        b33=findViewById(R.id.button33);
        b34=findViewById(R.id.button34);
        b35=findViewById(R.id.button35);
        b36=findViewById(R.id.button36);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

//        ActionBar bar= getActionBar();
////        ActionBar bar = getActionBar();
//        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fffff")));


    }
    @Override
    public void onClick(View view){
        int id =view.getId();
        Intent intent = null;
        switch(id){
            case R.id.button: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
            case R.id.button2: intent = new Intent(MainActivity.this,ToastActivity.class);break;
            case R.id.button3: intent = new Intent(MainActivity.this,CustomToastActivity.class);break;
            case R.id.button4: intent = new Intent(MainActivity.this,ToggleActivity.class);break;
            case R.id.button5: intent = new Intent(MainActivity.this, CheckboxActivity.class);break;
            case R.id.button6: intent = new Intent(MainActivity.this,CustomCheckboxActivity.class);break;
            case R.id.button7: intent = new Intent(MainActivity.this,RadioButtonActivity.class);break;
//            case R.id.button8: intent = new Intent(MainActivity.this,Activity.class);break;
//            case R.id.button9: intent = new Intent(MainActivity.this,Activity.class);break;
            case R.id.button10: intent = new Intent(MainActivity.this,AlertDialogActivity.class);break;
            case R.id.button11: intent = new Intent(MainActivity.this,SpinnerActivity.class);break;
            case R.id.button12: intent = new Intent(MainActivity.this,AutoCompleteTextViewActivity.class);break;
            case R.id.button13: intent = new Intent(MainActivity.this, ListViewActivity.class);break;
//            case R.id.button14: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button15: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button16: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button17: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button18: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button19: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button20: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button21: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button22: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button23: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button24: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button25: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button26: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button27: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button28: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button29: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button30: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button31: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button32: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button33: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button34: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button35: intent = new Intent(MainActivity.this,ButtonActivity.class);break;
//            case R.id.button36: intent = new Intent(MainActivity.this,ButtonActivity.class);break;

        }
        if (intent!=null)
            startActivity(intent);

    }
}
