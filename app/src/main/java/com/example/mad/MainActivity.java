package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText edt, edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        edt = findViewById(R.id.email);
        edt1 = findViewById(R.id.password);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!edt.getText().toString().equals("")
                        &&
                        !edt1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            edt.getText().toString() + " and " + edt1.getText().toString(),
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "Enter your value", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();

               /* Intent munu= new Intent(MainActivity.this , DashActivity.class);
                startActivity(munu);*/


            }
        });
    }
}