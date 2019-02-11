package com.dipanshu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cal);
    }



    int a=1;
    public void take1(View view) {
    a=1;
    }
    public void take2(View view) {
        a=2;
    }

    int count1=0,count2=0;
    public void del(View view) {
        count1=0;
        count2=0;
        a=1;
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"(.)");
        TextView textView1 = findViewById(R.id.input1);
        textView1.setText("");
        TextView textView2 = findViewById(R.id.input2);
        textView2.setText("");
        TextView textView3 = findViewById(R.id.solution);
        textView3.setText("0.00");
    }
    public void dot(View view) {

        if(a==1 && count1==0){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +".");
            count1=1;
        }
        else if(a==2 && count2==0){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +".");
            count2=1;
        }

    }
    public void zero(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"0");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"0");
        }
    }
    public void one(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"1");


        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"1");
        }

    }

    public void two(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"2");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"2");
        }
    }

    public void three(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"3");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"3");
        }
    }

    public void four(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"4");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"4");
        }
    }

    public void five(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"5");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"5");
        }
    }

    public void six(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"6");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"6");
        }
    }

    public void seven(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"7");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"7");
        }
    }

    public void eight(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"8");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"8");
        }
    }

    public void nine(View view) {
        if(a==1){
            TextView textView = findViewById(R.id.input1);
            textView.setText(textView.getText() +"9");
        }
        else if(a==2){
            TextView textView = findViewById(R.id.input2);
            textView.setText(textView.getText() +"9");
        }
    }

    public void equal(View view) {
        Log.e("MyCal","change");
        float number1=0 , number2=0;
        if(a==1){
                TextView textView = findViewById(R.id.input1);
                String a = textView.getText().toString();
                 number1 = Float.parseFloat(a);
                    number2=0;
//                 TextView textView1 = findViewById(R.id.input2);
//            String b = textView1.getText().toString();
//            number2 = Float.parseFloat(b);
            }

            else if (a==2){
            TextView textView = findViewById(R.id.input1);
            String a = textView.getText().toString();
            number1 = Float.parseFloat(a);
            TextView textView1 = findViewById(R.id.input2);
            String b = textView1.getText().toString();
            number2 = Float.parseFloat(b);
        }





            TextView textView2 = findViewById(R.id.action);
            String c = textView2.getText().toString();

            float ans=0;
            if(c.substring(0,1)=="+") {
                float num3=number1+number2;
                ans=num3;
            }
            else if(c.substring(0,1)=="-") {
            float num3=number1-number2;
            ans=num3;
            }
            else if(c.substring(0,1)=="*") {
            float num3=number1*number2;
            ans=num3;
            }
            else if(c.substring(0,1)=="/") {
            float num3=(number1/number2);
            ans=num3;
            }
            else if(c.substring(0,1)=="%") {
                float num3=(number1%number2);
                ans=num3;
            }
            else if(c.substring(0,1)=="!") {
                Log.e("MyCal" , "change was detected");
                float num3=factorial(number1);
                ans=num3;
                number2=0;
            }
            else if(c.substring(0,1)=="^") {
                float num3=(float)Math.pow(number1,number2);
                ans=num3;
            }
            else if(c.contentEquals("sqrt")) {
                float num3=(float)Math.sqrt(number1);
                ans=num3;
                number2=0;
            }

            TextView textView3 = findViewById(R.id.solution);
            textView3.setText(""+ans);
    }

    private float factorial(float a) {
    float b=a;
    for(float i=a-1;i>0;i=i-1){
        b=b*i;
    }
    return b;
    }

    public void plus(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"+");
    }

    public void minus(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"-");
    }

    public void multiply(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"*");
    }

    public void divide(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"/");
    }


    public void mod(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"%");
    }

    public void fact(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"!");
    }

    public void power(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"^");
    }

    public void sqrt(View view) {
        TextView textView = findViewById(R.id.action);
        textView.setText("" +"sqrt");
    }
}
