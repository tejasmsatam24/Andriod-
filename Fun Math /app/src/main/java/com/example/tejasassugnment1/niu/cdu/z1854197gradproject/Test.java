package com.example.tejasassugnment1.niu.cdu.z1854197gradproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;





//This class is used to create a test exam. Here the numbers are generated randomly

public class Test extends AppCompatActivity {


    //declaring the variables
    private Button btn,btn1,btn2,btn3;
    private TextView question,questno,score;
    private int i = 0,questionNo=0,score1=0;

    //initializaing the min and max length so that the numbers generated within that specific range
    final int min = 20;
    final int max = 80;
    //final int random = new Random().nextInt((max - min) + 1) + min;




    //private Integer addArr[]={num1,num2,actans};
    //List<Integer> myArray = new ArrayList<Integer>(Arrays.asList(addArr));
    //Collections.shuffle(mArray);
    //String myArray[] = new Integer[];

    //This function is used to shuffle the elements in array
    public static void RandomizeInPlace(String[] arr) {
        Random rgen = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randPos = rgen.nextInt(arr.length);
            String tmp = arr[i];
            arr[i] = arr[randPos];
            arr[randPos] = tmp;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn=findViewById(R.id.option1);
        btn1=findViewById(R.id.option2);
        btn2=findViewById(R.id.option3);
        btn3=findViewById(R.id.option4);
        question=findViewById(R.id.question);
        questno=findViewById(R.id.questno);
        score = findViewById(R.id.score);
        questno.setText(questionNo+"/"+10);
        score.setText("Score :"+score1+"/"+10);
        //questno.setText(num1s);
        NewQuestion();
    }//end OnCreate



    public void NewQuestion()
    {
        questionNo+=1;
        questno.setText(questionNo+"/"+10);
        if(questionNo>10)
        {
            goResult();
        }

        //When a new question is displayed we will first change the color of the button to initial color
        btn.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn1.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn2.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        btn3.setBackgroundColor(getResources().getColor(R.color.btcolor1));
        int num1 = new Random().nextInt((max - min) + 1) + min;
        int num2 = new Random().nextInt((max - min) + 1) + min;
        int actans = num1+num2;
        int op1 = new Random().nextInt((max - min) + 1) + min;
        int op2 = new Random().nextInt((max - min) + 1) + min;
        int op3 = new Random().nextInt((max - min) + 1) + min;
        int op4 = new Random().nextInt((max - min) + 1) + min;
        //String num1s= String.valueOf(num1);
        //String num2s= String.valueOf(num2);
        final String actanss = String.valueOf(actans);
        String op1s = String.valueOf(op1);
        String op2s = String.valueOf(op2);
        String op3s = String.valueOf(op3);
        String op4s = String.valueOf(op4);

        //array holding the vafiables for options
        String addAnswer[]={op4s,op3s,actanss,op1s,op2s};
        question.setText(num1+"+"+num2+" = "+" ? ");
        //btn.setText(addAnswer[0]);
        RandomizeInPlace(addAnswer);
        //question.setText(addAnswer[1]);
        btn.setText(addAnswer[0]);
        btn1.setText(addAnswer[1]);
        btn2.setText(addAnswer[2]);
        btn3.setText(addAnswer[3]);


        //checking which buttons are pressed and and make the changes accordingly
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn.getText()==actanss)
                {

                    //if the answer is correct we will make that button green
                    btn.setBackgroundColor(getResources().getColor(R.color.green));
                    score1+=1;
                    score.setText("Score :"+score1+"/"+10);
                    //NewQuestion();


                    //we will create a handle to create a time delay
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }

                //else we will check which option is correct and higlight that option
                else{
                    btn.setBackgroundColor(getResources().getColor(R.color.red));
                    if(btn1.getText()==actanss)
                    {
                        btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn2.getText()==actanss)
                    {
                        btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn3.getText()==actanss)
                    {
                        btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }




            }
        });//end btn

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText()==actanss) {
                    score1+=1;
                    score.setText("Score :"+score1+"/"+10);
                    btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
                else{
                    btn1.setBackgroundColor(getResources().getColor(R.color.red));
                    if(btn.getText()==actanss)
                    {
                        btn.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn2.getText()==actanss)
                    {
                        btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn3.getText()==actanss)
                    {
                        btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
            }
        });//end btn1

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(btn2.getText()==actanss) {
                    score1+=1;
                    score.setText("Score :"+score1+"/"+10);
                    btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
                else{
                    btn2.setBackgroundColor(getResources().getColor(R.color.red));
                    if(btn.getText()==actanss)
                    {
                        btn.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn1.getText()==actanss)
                    {
                        btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn3.getText()==actanss)
                    {
                        btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
            }
        });//end btn2
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText()==actanss) {
                    score1+=1;
                    score.setText("Score :"+score1+"/"+10);
                    btn3.setBackgroundColor(getResources().getColor(R.color.green));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
                else{
                    btn3.setBackgroundColor(getResources().getColor(R.color.red));
                    if(btn.getText()==actanss)
                    {
                        btn.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn1.getText()==actanss)
                    {
                        btn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    else if(btn2.getText()==actanss)
                    {
                        btn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NewQuestion();
                        }
                    },2500);
                }
            }
        });

    }

    public void goResult(){


        //here we will pass the score to another activity
        Intent i=new Intent(Test.this,Result.class);
        String scr = String.valueOf(score1);
        String lgt = "10";
        i.putExtra("key",scr);
        i.putExtra("length",lgt);
        //i.putExtra("")
        startActivity(i);
        finish();
    }
}
