package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class CustomToastActivity extends AppCompatActivity {
    ImageButton imgbtn;
    private void init(){
        imgbtn=findViewById(R.id.imageButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        getSupportActionBar().hide();
        init();
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFoodToast();
            }
        });
    }
    private void showFoodToast() {
            View layout = getLayoutInflater().inflate(R.layout.food_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
            ImageView img = layout.findViewById(R.id.imageView);
            Random random = new Random();
            int num = random.nextInt(5);
            switch (num) {
                case 0:
                    img.setImageDrawable(getDrawable(R.drawable.burger));
                    break;
                case 1:
                    img.setImageDrawable(getDrawable(R.drawable.samosa));
                    break;
                case 2:
                    img.setImageDrawable(getDrawable(R.drawable.chaat));
                    break;
                case 3:
                    img.setImageDrawable(getDrawable(R.drawable.noodles));
                    break;
                case 4:
                    img.setImageDrawable(getDrawable(R.drawable.pasta));
                    break;
                case 5:
                    img.setImageDrawable(getDrawable(R.drawable.pizza));
                    break;
                case 6:
                    img.setImageDrawable(getDrawable(R.drawable.mexican));
                    break;
                case 7:
                    img.setImageDrawable(getDrawable(R.drawable.samosachaat));
                    break;
                case 8:
                    img.setImageDrawable(getDrawable(R.drawable.whitesaucepasta));
                    break;
//            case 9 : img.setImageDrawable(getDrawable(R.drawable.));break;
            }
            Log.d("random_num", "num : " + num);
            Toast toast = new Toast(CustomToastActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);
            toast.show();

    }
}
