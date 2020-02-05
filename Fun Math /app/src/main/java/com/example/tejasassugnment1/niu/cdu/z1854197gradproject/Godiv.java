package com.example.tejasassugnment1.niu.cdu.z1854197gradproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Godiv extends AppCompatActivity {
    private Button btn,btn1,btn2,btn3;
    private TextView question,questno,score;
    private int i = 0,questionNo=1,score1=0;

    private String addQuestion[]={
            "3 ÷ 3 = ?",
            "14 ÷ 7 = ?",
            "13 ÷ 0 = ?",
            "22 ÷ 11 = ?",
            "25 ÷ ? = 5",
            "100 ÷ 10 = ?",

    };

    private String addAnswer[][]={
            {"1","7","8","3"},
            {"7","8","9","2"},
            {"13","1","0","2"},
            {"2","10","4","11"},
            {"3","5","1","7"},
            {"130","123","159","10"}
    };
    private String correctAns[]={"1","2","0","2","5","10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godiv);
        btn=findViewById(R.id.option1);
        btn1=findViewById(R.id.option2);
        btn2=findViewById(R.id.option3);
        btn3=findViewById(R.id.option4);
        question=findViewById(R.id.question);
        questno=findViewById(R.id.questno);
        score=findViewById(R.id.score);
        question.setText(addQuestion[i]);
        btn.setText(addAnswer[i][0]);
        btn1.setText(addAnswer[i][1]);
        btn2.setText(addAnswer[i][2]);
        btn3.setText(addAnswer[i][3]);
        questno.setText(questionNo+"/"+addQuestion.length);
        score.setText("Score :"+score1+"/"+addQuestion.length);
    }
    public void option1select(View view){
        //if(i<question.length())
        if(btn.getText()==correctAns[i]) {
            btn.setBackgroundColor(getResources().getColor(R.color.green));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn1clickCorrect();
                }
            },2500);
        }
        else{
            btn.setBackgroundColor(getResources().getColor(R.color.red));
            if(btn1.getText()==correctAns[i])
            {
                btn1.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn2.getText()==correctAns[i])
            {
                btn2.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn3.getText()==correctAns[i])
            {
                btn3.setBackgroundColor(getResources().getColor(R.color.green));
            }
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn1clickCorrect();
                }
            },2500);
        }
    }
    public void option2select(View view){
        //if(i<question.length())

        if(btn1.getText()==correctAns[i]) {
            btn1.setBackgroundColor(getResources().getColor(R.color.green));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn2clickCorrect();
                }
            },2500);
        }
        else{
            btn1.setBackgroundColor(getResources().getColor(R.color.red));
            if(btn.getText()==correctAns[i])
            {
                btn.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn2.getText()==correctAns[i])
            {
                btn2.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn3.getText()==correctAns[i])
            {
                btn3.setBackgroundColor(getResources().getColor(R.color.green));
            }
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn2clickCorrect();
                }
            },2500);
        }
    }
    public void option3select(View view){
        //if(i<question.length())
        if(btn2.getText()==correctAns[i]) {
            btn2.setBackgroundColor(getResources().getColor(R.color.green));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn3clickCorrect();
                }
            },2500);
        }
        else{
            btn2.setBackgroundColor(getResources().getColor(R.color.red));
            if(btn.getText()==correctAns[i])
            {
                btn.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn1.getText()==correctAns[i])
            {
                btn1.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn3.getText()==correctAns[i])
            {
                btn3.setBackgroundColor(getResources().getColor(R.color.green));
            }
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn3clickCorrect();
                }
            },2500);
        }
    }

    public void option4select(View view){
        //if(i<question.length())
        if(btn3.getText()==correctAns[i]) {
            btn3.setBackgroundColor(getResources().getColor(R.color.green));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn4clickCorrect();
                }
            },2500);
        }
        else{
            btn3.setBackgroundColor(getResources().getColor(R.color.red));
            if(btn.getText()==correctAns[i])
            {
                btn.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn1.getText()==correctAns[i])
            {
                btn1.setBackgroundColor(getResources().getColor(R.color.green));
            }
            else if(btn2.getText()==correctAns[i])
            {
                btn2.setBackgroundColor(getResources().getColor(R.color.green));
            }
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btn4clickCorrect();
                }
            },2500);
        }
    }


    public void btn1clickCorrect(){
        questionNo+=1;
        questno.setText(questionNo+"/"+addQuestion.length);
        if(questionNo>addQuestion.length)
        {
            goResult();
        }
        btn.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn1.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn2.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn3.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        i = i + 1;
        //Collections.shuffle(addAnswer);
        question.setText(addQuestion[i]);
        btn.setText(addAnswer[i][0]);
        btn1.setText(addAnswer[i][1]);
        btn2.setText(addAnswer[i][2]);
        btn3.setText(addAnswer[i][3]);
        score1+=1;
        score.setText("Score :"+score1+"/"+addQuestion.length);
    }

    public void btn2clickCorrect(){
        questionNo+=1;
        questno.setText(questionNo+"/"+addQuestion.length);
        if(questionNo>addQuestion.length)
        {
            goResult();
        }
        btn.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn1.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn2.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn3.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        i = i + 1;
        //Collections.shuffle(addAnswer);
        question.setText(addQuestion[i]);
        btn.setText(addAnswer[i][0]);
        btn1.setText(addAnswer[i][1]);
        btn2.setText(addAnswer[i][2]);
        btn3.setText(addAnswer[i][3]);
    }
    public void btn3clickCorrect(){
        questionNo+=1;
        questno.setText(questionNo+"/"+addQuestion.length);
        if(questionNo>addQuestion.length)
        {
            goResult();
        }
        btn.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn1.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn2.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn3.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        i = i + 1;
        //Collections.shuffle(addAnswer);
        question.setText(addQuestion[i]);
        btn.setText(addAnswer[i][0]);
        btn1.setText(addAnswer[i][1]);
        btn2.setText(addAnswer[i][2]);
        btn3.setText(addAnswer[i][3]);
    }
    public void btn4clickCorrect(){
        questionNo+=1;
        questno.setText(questionNo+"/"+addQuestion.length);
        if(questionNo>addQuestion.length)
        {
            goResult();
        }
        btn.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn1.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn2.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn3.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        i = i + 1;
        //Collections.shuffle(addAnswer);
        question.setText(addQuestion[i]);
        btn.setText(addAnswer[i][0]);
        btn1.setText(addAnswer[i][1]);
        btn2.setText(addAnswer[i][2]);
        btn3.setText(addAnswer[i][3]);
    }

    public void goResult(){

        Intent i=new Intent(Godiv.this,Result.class);
        String scr = String.valueOf(score1);
        i.putExtra("key",scr);
        String len = String.valueOf(addQuestion.length);
        i.putExtra("length",len);
        //i.putExtra("")
        startActivity(i);

    }
}

