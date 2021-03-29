package com.example.calculadorarobusta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMais, btnMenos, btnMulti, btnDividir, btnC, btnResult;
    private TextView txtResult, txtCursor;
    private String expressao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCursor = findViewById(R.id.txtCursor);
        txtResult = findViewById(R.id.txtResult);

    }

    public void getBtn1 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"1");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }

    public void getBtn2 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"2");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn3 (View view){
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            txtCursor.setText(txtCursor.getText().toString()+"3");
            recalcular();
        } else {
            txtCursor.setText(txtCursor.getText().toString()+"3");
        }
    }
    public void getBtn4 (View view){
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            txtCursor.setText(txtCursor.getText().toString()+"4");
            recalcular();
        } else {
            txtCursor.setText(txtCursor.getText().toString()+"4");
        }
    }
    public void getBtn5 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"5");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn6 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"6");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn7 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"7");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn8 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"8");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn9 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"9");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }
    public void getBtn0 (View view){
        txtCursor.setText(txtCursor.getText().toString()+"0");
        if(txtCursor.getText().toString().contains("+") || txtCursor.getText().toString().contains("-") || txtCursor.getText().toString().contains("/") || txtCursor.getText().toString().contains("*")){
            recalcular();
        }
    }

    public void getBtnMais (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText(txtCursor.getText().toString()+"+");
        }
    }
    public void getBtnMenos (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText(txtCursor.getText().toString()+"-");
        }
    }
    public void getBtnDividir (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText(txtCursor.getText().toString()+"/");
        }
    }
    public void getBtnMulti (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText(txtCursor.getText().toString()+"*");
        }
    }
    public void getBtnC (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText("");
            txtResult.setText("");
        }
    }
    public void getBtnDot (View view){
        if(!txtCursor.getText().toString().isEmpty()){
            txtCursor.setText(txtCursor.getText().toString()+".");
        }
    }

    public void recalcular (){

        Float x, y, result = Float.valueOf(0);

            if(txtCursor.getText().toString().contains("+")){
                String[] numeros = (txtCursor.getText().toString()).split(Pattern.quote("+"));
                x = Float.parseFloat(numeros[0]);
                y = Float.parseFloat(numeros[1]);

                result = x + y;

            } else if(txtCursor.getText().toString().contains("-")){
                String[] numeros = (txtCursor.getText().toString()).split("-");
                x = Float.parseFloat(numeros[0]);
                y = Float.parseFloat(numeros[1]);

                result = x - y;

            } else if(txtCursor.getText().toString().contains("*")){
                String[] numeros = (txtCursor.getText().toString()).split(Pattern.quote("*"));
                x = Float.parseFloat(numeros[0]);
                y = Float.parseFloat(numeros[1]);

                result = x * y;

            } else if(txtCursor.getText().toString().contains("/")){
                String[] numeros = (txtCursor.getText().toString()).split("/");
                x = Float.parseFloat(numeros[0]);
                y = Float.parseFloat(numeros[1]);

                result = x / y;
            }

        formataFloat(result);
    }

    public void formataFloat(Float result){
        if (result != Math.round(result)) {
            txtResult.setText(""+result);
        } else {
            txtResult.setText(""+Math.round(result));
        }

    }
}