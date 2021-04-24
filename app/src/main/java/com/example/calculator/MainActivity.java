package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10,buttonExp, buttonC, buttonEqual,
            buttonPi,buttonMplus,buttonMneg,buttonMr,buttonMc,buttonPer;
    EditText editTextInCalculator;
    String detailsString="";
    long result,intNumber;
    long memoryInt=0;
    double memoryDouble=0.0, realNumber=0.0;
    TextView tvDetails;
    float mValueOne, mValueTwo,result2;

    boolean calAddition, calSubtract, calMultiplication, calDivision,calExp,calPer;
            boolean isIntNumber=true,isIntMemory=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonExp = (Button) findViewById(R.id.button_exp);
        buttonPi = (Button) findViewById(R.id.button_pi);
        buttonMplus = (Button) findViewById(R.id.button_mplus);
        buttonMneg = (Button) findViewById(R.id.button_mneg);
        buttonMr = (Button) findViewById(R.id.button_mr);
        buttonMc = (Button) findViewById(R.id.button_mc);
        buttonC = (Button) findViewById(R.id.button_c);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonPer = (Button) findViewById(R.id.button_per);
        editTextInCalculator = (EditText) findViewById(R.id.edit_txt);
        tvDetails = findViewById(R.id.tv_details);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextInCalculator == null) {
                    editTextInCalculator.setText("");
                } else {
                    mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                    calAddition = true;
                    editTextInCalculator.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                calSubtract = true;
                editTextInCalculator.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                calMultiplication = true;
                editTextInCalculator.setText(null);

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                calDivision = true;
                editTextInCalculator.setText(null);
            }
        });
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextInCalculator.setText("3.14");
            }
        });

        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                calExp = true;
                editTextInCalculator.setText(null);
            }
        });
        buttonPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editTextInCalculator.getText() + "");
                calPer = true;
                editTextInCalculator.setText(null);
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editTextInCalculator.getText() + "");

                if (calAddition == true) {
                    editTextInCalculator.setText(mValueOne + mValueTwo + "");
                    calAddition = false;

                }

                if (calSubtract == true) {
                    editTextInCalculator.setText(mValueOne - mValueTwo + "");
                    calSubtract = false;
                }

                if (calMultiplication == true) {
                    editTextInCalculator.setText(mValueOne * mValueTwo + "");
                    calMultiplication = false;
                }

                if (calDivision == true) {
                    editTextInCalculator.setText(mValueOne / mValueTwo + "");
                    calDivision = false;
                }
                if (calPer == true) {

                    result2 = (float) (mValueTwo*(mValueOne/100));
                    editTextInCalculator.setText(result2+"");
                    calPer = false;
                }


                if (calExp == true) {
                    result=1;
                    while(mValueTwo != 0)
                    {
                        result  *= (float) mValueOne;
                        --mValueTwo;

                    }
                    editTextInCalculator.setText(result+"");
                    calExp = false;

                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInCalculator.setText(editTextInCalculator.getText() + ".");
            }
        });

        buttonMplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isIntMemory) {
                    if (isIntNumber) {
                        memoryInt += intNumber;
                        detailsString = "Memory:" + memoryInt;
                    } else {
                        isIntNumber = false;
                        memoryDouble = memoryDouble + realNumber;
                    }

                }

            }

        });
        buttonMneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                if(isIntMemory){
                    if(isIntNumber)
                    {
                        memoryInt -= intNumber;
                        detailsString = "Memory:"+memoryInt;
                    }

                    else
                    {
                        isIntNumber=false;
                        memoryDouble = memoryDouble + realNumber;
                    }

                }
            }
            private void updateCalcUI() {

                tvDetails.setText(detailsString);
            }

        });
        buttonMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailsString="";

            }

        });
    }

}