package com.example.lbm1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class l_s extends AppCompatActivity {
    Database myDB = new Database(this);
    EditText editl_name;
    EditText editl_phone;
    EditText editl_pin;
    Spinner editl_typ;
    EditText editl_email;
    EditText editl_pass;
    Button btnl_sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_s);

        editl_name = (EditText)findViewById(R.id.l_name);
        editl_phone = (EditText)findViewById(R.id.l_phone);
        editl_pin = (EditText)findViewById(R.id.l_pin);
        editl_typ = (Spinner) findViewById(R.id.l_typ);
        editl_email = (EditText)findViewById(R.id.l_email);
        editl_pass = (EditText)findViewById(R.id.l_pass);
        btnl_sb = (Button)findViewById(R.id.l_sb);


        SignUp();
    }
    public void SignUp(){
        btnl_sb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDB.insertData(editl_name.getText().toString(),
                                editl_phone.getText().toString(),
                                editl_pin.getText().toString(),
                                editl_typ.getTransitionName(),
                                editl_email.getText().toString(),
                                editl_pass.getText().toString());
                        if(isInserted = true) {
                            Toast.makeText(l_s.this,"Sign up Successfully",Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(), l_l.class);
                            startActivity(i);
                        }
                        else {
                            Toast.makeText(l_s.this,"Try again",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

    }

}