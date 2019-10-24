package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {
    ToggleButton togg1,togg2;
    Button btn;
    private void init(){
        togg1=findViewById(R.id.toggleButton);
        togg2=findViewById(R.id.toggleButton2);
        btn=findViewById(R.id.button38);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        getSupportActionBar().setTitle("Toggle Button");
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Toggle Button 1:").append(togg1.getText());
                result.append("\nToggle Button 2:").append(togg2.getText());
                Toast.makeText(ToggleActivity.this,result.toString(), Toast.LENGTH_LONG ).show();
            }
        });
    }
}
