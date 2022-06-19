package com.example.lesson_1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tvTest;
private TextView tvRes;
private EditText eText1;
private EditText eText2;

private TextView tvTest2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTest2 = findViewById(R.id.tvText2);
        tvTest2.setText("");
        String testString = "Green <OAK> by the seaside";
        getTextFromSymbol(testString);



        tvTest = findViewById(R.id.tvTest);

        tvRes = findViewById(R.id.tvResult);
        tvRes.setVisibility(View.GONE);
        eText1 = findViewById(R.id.editTextTextPersonName);
        eText2 = findViewById(R.id.editTextTextPersonName2);

         int [] numbers = {23,32,6,78,9};
         String [] texts = {"YES", "NO", "MORE"};
         //int[] numbers2 = new int[10];

        Log.d("MyLog","Значение из массива: " + numbers[0]);
        Log.d("MyLog","Значение из массива: " + texts[0]);
    }


    public void onClickColor(View view) {
    tvTest.setTextColor(getResources().getColor(R.color.color_red));

    }

    public void onClickResult(View view){
        int num1 = Integer.parseInt(eText1.getText().toString());
        int num2 = Integer.parseInt(eText2.getText().toString());
        int result = num1 + num2;
        tvRes.setText(String.valueOf(result));
        tvRes.setVisibility(View.VISIBLE);
    }
    private void getTextFromSymbol(String textTest) {
        int pos_1 = textTest.indexOf('<');
        String temp = textTest.substring(pos_1 + 1);
        pos_1 = temp.indexOf('>');
        String temp2 = temp.substring(0,pos_1);
        tvTest2.setText(temp2);


            /*char ch;
                for (int i = 0; i < textTest.length();i++) {
                ch = textTest.charAt(i);
                tvTest2.append(String.valueOf(ch));
                //tvTest2.append("\n");
            }*/
    }

}