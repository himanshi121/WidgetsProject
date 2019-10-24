package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ToastActivity extends AppCompatActivity {
    Button btn;
    TextView textView;

    private void init(){
        btn=findViewById(R.id.button37);
        textView=findViewById(R.id.textView);

    }
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        init();
        getSupportActionBar().hide();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToastActivity.this, "Hey!! I'm Toast!", Toast.LENGTH_SHORT).show();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToastActivity.this, "I Said Press The Button, Bitch!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
