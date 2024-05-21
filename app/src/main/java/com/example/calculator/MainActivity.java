package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn0=(Button) findViewById(R.id.btn0);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);
        Button btn6=(Button) findViewById(R.id.btn6);
        Button btn7=(Button) findViewById(R.id.btn7);
        Button btn8=(Button) findViewById(R.id.btn8);
        Button btn9=(Button) findViewById(R.id.btn9);
        Button btnAdd=(Button) findViewById(R.id.btnAdd);
        Button btnClear=(Button) findViewById(R.id.btnClear);
        Button btnDivide=(Button) findViewById(R.id.btnDivide);
        Button btnEquals=(Button) findViewById(R.id.btnEquals);
        Button btnDot=(Button) findViewById(R.id.btnDot);
        Button btnMultiply=(Button) findViewById(R.id.btnMultiply);
        Button btnSubtract=(Button) findViewById(R.id.btnSubtract);
        EditText editTextResult=(EditText) findViewById(R.id.editTextResult);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"0";
              editTextResult.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"1";
                editTextResult.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"2";
                editTextResult.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"3";
                editTextResult.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"4";
                editTextResult.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"5";
                editTextResult.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"6";
                editTextResult.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"7";
                editTextResult.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"8";
                editTextResult.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"9";
                editTextResult.setText(text);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"+";
                editTextResult.setText(text);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"*";
                editTextResult.setText(text);
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String text= editTextResult.getText().toString();

                    double equal= (double) new ExpressionBuilder(text)
                            .build()
                            .evaluate();
                    text=Double.toString(equal);
                    editTextResult.setText(text);
                } catch (Exception e) {
                    System.out.println(e);
                    Toast.makeText(MainActivity.this, "لطفا فقط از اعداد و عملگر های ریاضی استفاده کنید", Toast.LENGTH_SHORT).show();
            }

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"-";
                editTextResult.setText(text);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextResult.setText("");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+".";
                editTextResult.setText(text);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text= editTextResult.getText().toString();
                text=text+"/";
                editTextResult.setText(text);
            }
        });





    }
}