package com.example.tejasassugnment1.niu.cdu.z1854197gradproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView score,cmt;


    //here we will calculate the total Score and display it ito the user
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String value = getIntent().getStringExtra("key");
        String len = getIntent().getStringExtra("length");
        score=findViewById(R.id.score);
        cmt=findViewById(R.id.comment);
        score.setText(value+"/"+len);
        int valueint = Integer.parseInt(value);
        int lenint = Integer.parseInt(len);
        if(valueint==lenint)
        {
            cmt.setText("Congratulations!");
        }
        else if(valueint<lenint && valueint>7)
        {
            cmt.setText("Good Job!");
        }
        else if(valueint<=7 && valueint>5)
        {
            cmt.setText("Satisfactory");
        }
        else if(valueint<=5)
        {
            cmt.setText("Oops! need more practice!");
        }

    }

    public void goMain(View view)
    {
        finish();
    }
}

