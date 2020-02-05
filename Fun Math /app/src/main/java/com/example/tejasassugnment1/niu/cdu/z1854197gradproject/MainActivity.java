package com.example.tejasassugnment1.niu.cdu.z1854197gradproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    /********************************************************************
     CSCI 522 - Graduate Project - Spring 2019

     Programmer: Tejas Satam

     TA: Harshith Desamsetti

     Purpose: The purpousr of the project is to develop a Math tutoring
     application for children in which the numbers in the question will be
     generated randomly.
     *********************************************************************/

    private Button addbtn,subbtn,mulbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbtn=findViewById(R.id.addButton);
        subbtn=findViewById(R.id.subButton);
    }

    //navigate to the add class
    public void goAdd(View view){
        Intent intent = new Intent(MainActivity.this,Goadd.class);
        startActivity(intent);
    }
    //navigate to the subtraction class
    public void goSub(View view){
        Intent intent = new Intent(MainActivity.this,Gosub.class);
        startActivity(intent);
    }
    //navigate to the multiplication class
    public void goMul(View view){
        Intent intent = new Intent(MainActivity.this,Gomul.class);
        startActivity(intent);
    }
    //navigate to the division class
    public void goDiv(View view){
        Intent intent = new Intent(MainActivity.this,Godiv.class);
        startActivity(intent);
    }
    //navigate to the test class
    public void goTest(View view){
        Intent intent = new Intent(MainActivity.this,Test.class);
        startActivity(intent);
    }

}

