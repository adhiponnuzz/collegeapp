package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getname,getmob,getemail,getpass,getcpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mob);
        ed3=(EditText) findViewById(R.id.email);
        ed4=(EditText) findViewById(R.id.pass);
        ed5=(EditText) findViewById(R.id.cpass);
        b1=(AppCompatButton) findViewById(R.id.reg);
        b2=(AppCompatButton) findViewById(R.id.btl);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getmob=ed2.getText().toString();
                getemail=ed3.getText().toString();
                getpass=ed4.getText().toString();
                getcpass=ed5.getText().toString();
                if (getpass.equals(getcpass)) {

                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getmob, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getemail, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getpass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getcpass, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Password and confirm password doesnot match",Toast.LENGTH_SHORT).show();
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}