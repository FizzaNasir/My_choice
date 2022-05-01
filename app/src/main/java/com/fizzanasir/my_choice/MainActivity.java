package com.fizzanasir.my_choice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Prime, Odd, Even;
    Button check;
    EditText input;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check=findViewById(R.id.check_btn);
        check.setOnClickListener(this);
        Prime=findViewById(R.id.Pnum);
        Odd=findViewById(R.id.Onum);
        Even=findViewById(R.id.Evnum);
    }

    @Override
    public void onClick(View view) {
        input = (EditText) findViewById(R.id.user_input);
        int x = Integer.parseInt(input.getText().toString());
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0 && x % 2 != 0) {
//            Even.setText("");
            Prime.setBackgroundColor(Color.rgb(121, 255, 77));
            Odd.setBackgroundColor(Color.rgb(121, 255, 77));
            Even.setBackgroundColor(Color.rgb(255, 128, 128));
        } else if (flag == 0 && x % 2 == 0) {
//            Odd.setText("");
            Odd.setBackgroundColor(Color.rgb(255, 128, 128));
            Prime.setBackgroundColor(Color.rgb(121, 255, 77));
            Even.setBackgroundColor(Color.rgb(121, 255, 77));
        }
    }
}