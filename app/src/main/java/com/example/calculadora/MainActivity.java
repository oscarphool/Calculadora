package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    //Declaramos
    TextView text1, text2;
    Button btnAC, btnDEL, btnPorc, btnDiv, btn7, btn8, btn9, btnMulti, btn4, btn5, btn6, btnResta, btn1, btn2, btn3, btnSuma, btnCambio, btn0, btnPunto, btnIgual;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);

        btnAC =  (Button)findViewById(R.id.btnAC);
        btnDEL =  (Button)findViewById(R.id.btnDEL);
        btnPunto = (Button)findViewById(R.id.btnPunto);

        btnPorc =  (Button)findViewById(R.id.btnPorc);
        btnDiv =  (Button)findViewById(R.id.btnDiv);
        btnMulti =  (Button)findViewById(R.id.btnMulti);
        btnResta =  (Button)findViewById(R.id.btnResta);
        btnSuma =  (Button)findViewById(R.id.btnSuma);
        btnIgual =  (Button)findViewById(R.id.btnIgual);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                text2.setText("");
            }
        });

        btnPorc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"%");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"/");
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"*");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"-");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"+");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"9");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+".");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression miau = new Expression(text1.getText().toString());
                text2.setText(String.valueOf(miau.calculate()));
            }

        });

    }
}