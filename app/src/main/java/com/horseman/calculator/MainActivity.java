package com.horseman.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    TextView txtView1, txtView2;
    MaterialCardView clear_btn, erease_btn, percent_btn, divide_btn, multiply_btn, minus_btn, plus_btn, dot_btn, equal_btn;
    MaterialCardView one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn, nine_btn, zero_btn;

    String num = "";
    String num2 = "";
    String sign = "";
    double calculation1 = 0;
    double calculation2 = 0;

    double store_result = 0;
    String final_result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView1 = findViewById(R.id.txtview1);
        txtView2 = findViewById(R.id.txtview2);

        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.five_btn);
        six_btn = findViewById(R.id.six_btn);
        seven_btn = findViewById(R.id.seven_btn);
        //double seven = Integer.parseInt(seven_btn.toString());
        eight_btn = findViewById(R.id.eight_btn);
        //double eight = Integer.parseInt();
        nine_btn = findViewById(R.id.nine_btn);
        zero_btn = findViewById(R.id.zero_btn);

        erease_btn = findViewById(R.id.erease);
        percent_btn = findViewById(R.id.percent);
        divide_btn = findViewById(R.id.divide);
        multiply_btn = findViewById(R.id.multiply_btn);
        minus_btn = findViewById(R.id.minus_btn);
        plus_btn = findViewById(R.id.plus_btn);
        dot_btn = findViewById(R.id.dot_btn);
        equal_btn = findViewById(R.id.equal_btn);
        clear_btn = findViewById(R.id.clear_btn);

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView1.setText("");
                txtView2.setText("");
                num = "";
                num2 = "";
            }
        });
        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "7";
                txtView2.setText(num);
            }
        });
        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "8";
                txtView2.setText(num);
            }
        });
        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "9";
                txtView2.setText(num);
            }
        });
        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "4";
                txtView2.setText(num);
            }
        });
        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "5";
                txtView2.setText(num);
            }
        });
        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "6";
                txtView2.setText(num);
            }
        });

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "1";
                txtView2.setText(num);
            }
        });
        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "2";
                txtView2.setText(num);
            }
        });
        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "3";
                txtView2.setText(num);
            }
        });
        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + "0";
                txtView2.setText(num);
            }
        });
        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num + ".";
                txtView2.setText(num);
            }
        });
        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (sign) {
                    case "+":
                        calculation2 = Double.parseDouble(txtView2.getText().toString().trim());
                        store_result = calculation1 + calculation2;
                        final_result = Double.toString(store_result);
                        txtView2.setText("");
                        txtView1.setText(final_result);
                        break;

                    case "-":
                        calculation2 = Double.parseDouble(txtView2.getText().toString().trim());
                        store_result = calculation1 - calculation2;
                        final_result = Double.toString(store_result);
                        txtView2.setText("");
                        txtView1.setText(final_result);
                        break;

                    case "*":
                        calculation2 = Double.parseDouble(txtView2.getText().toString().trim());
                        store_result = calculation1 * calculation2;
                        final_result = Double.toString(store_result);
                        txtView2.setText("");
                        txtView1.setText(final_result);
                        break;

                    case "/":
                        calculation2 = Double.parseDouble(txtView2.getText().toString().trim());
                        store_result = calculation1 / calculation2;
                        final_result = Double.toString(store_result);
                        txtView2.setText("");
                        txtView1.setText(final_result);
                        break;


                }


            }
        });

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "+".toString();
                String grab = txtView2.getText().toString().trim();
                calculation1 = Double.parseDouble(grab);
                //System.out.println(calculation);
                txtView2.setText("");
                num = "";
                num2 = num2 + grab;
                txtView1.setText(num2 + " +");
            }
        });
        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "-".toString();
                String grab = txtView2.getText().toString().trim();
                calculation1 = Double.parseDouble(grab);
                //System.out.println(calculation);
                txtView2.setText("");
                num = "";
                num2 = num2 + grab;
                txtView1.setText(num2 + " -");
            }
        });
        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "*".toString();
                String grab = txtView2.getText().toString().trim();
                calculation1 = Double.parseDouble(grab);
                //System.out.println(calculation);
                txtView2.setText("");
                num = "";
                num2 = num2 + grab;
                txtView1.setText(num2 + " *");
            }
        });
        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "/".toString();
                String grab = txtView2.getText().toString().trim();
                calculation1 = Double.parseDouble(grab);
                //System.out.println(calculation);
                txtView2.setText("");
                num = "";
                num2 = num2 + grab;
                txtView1.setText(num2 + " /");
            }
        });
        percent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "%".toString();
                String grab = txtView2.getText().toString().trim();
                calculation1 = Double.parseDouble(grab);
                //System.out.println(calculation);
                txtView2.setText("");
                num = "";
                num2 = num2 + grab;
                txtView1.setText(num2 + " %");

                txtView1.setText("");
                store_result = calculation1 /100;
                final_result = Double.toString(store_result);
                txtView2.setText("");
                txtView1.setText(final_result);
            }
        });
        erease_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String storeErease = txtView2.getText().toString().trim();
                int len = storeErease.length()-1;

                String sb = storeErease.substring(0,len);
                txtView2.setText(sb);
            }
        });

    }
}