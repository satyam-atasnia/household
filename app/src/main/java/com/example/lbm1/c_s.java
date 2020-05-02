package com.example.lbm1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class c_s extends AppCompatActivity {
    Database myDB = new Database(this);
    EditText editc_name,
            editc_phone,
            editc_add,
            editc_pin,
            editc_email,
            editc_pass;
    Button btnc_sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_s);
        editc_name = (EditText) findViewById(R.id.c_name);
        editc_phone = (EditText) findViewById(R.id.c_phone);
        editc_add = (EditText) findViewById(R.id.c_add);
        editc_pin = (EditText) findViewById(R.id.c_pin);
        editc_email = (EditText) findViewById(R.id.c_email);
        editc_pass = (EditText) findViewById(R.id.c_pass);
        btnc_sb = (Button) findViewById(R.id.c_sb);
        SignUp();
    }

    public void SignUp() {
        btnc_sb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDB.insertData1(editc_name.getText().toString(),
                                editc_phone.getText().toString(),
                                editc_add.getText().toString(),
                                editc_pin.getText().toString(),
                                editc_email.getText().toString(),
                                editc_pass.getText().toString());
                        if (isInserted = true) {
                            Toast.makeText(c_s.this, "Sign up Successfully", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(), c_l.class);
                            startActivity(i);
                        } else {
                            Toast.makeText(c_s.this, "Try again", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );


    }

}



