package com.example.optimusprime.qu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int score = 0;
    public int k = 0;
    public boolean b;

    public void replace(View view) {
        k = k + 1;
        if (k == 1) {
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("What is size of char data type in basic turbo c++ ");
        }
        if (k == 2) {
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("What is size of int data type in basic turbo c++ ");
        }
        if (k == 3) {
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("What is size of stucture with one char variable and one int variable ");
        }
        if (k == 4) {
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("What is size of double data type in basic turbo c++ ");
        }
        if (k == 5) {
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("What is size of double float type in basic turbo c++");
        }
        if(k == 6){
            TextView p = (TextView) findViewById(R.id.question);
            p.setText("congrats your score is " + score + "out of 40 ");

        }
        if(k == 7){
            k=1;
        }


    }

    public void check_answer(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.check_a:
                if (checked == true) {
                    if (k == 1) {
                        score = score + 10;
                    }
                }
                break;
            case R.id.check_b:
                if (checked == true) {
                    if (k == 2) {
                        score = score + 10;
                    }
                }
                break;
            case R.id.check_c:
                if (checked == true) {
                    if (k == 3) {
                        score = score + 10;
                    }
                }
                break;
            case R.id.check_d:
                if (checked == true) {
                    if (k == 4) {
                        score = score + 10;
                    }
                }
                break;

        }
    }
    public void checkbox(View view){
        CheckBox h= (CheckBox) findViewById(R.id.check);
        b=h.isChecked();

    }
    public void checktext(View view){
        EditText name= (EditText) findViewById(R.id.text);
        String name_m=name.getText().toString();
        int k = Integer.parseInt(name_m);
        if (k == 8){
            if (b){
                score=score+10;
            }
        }

    }

}
