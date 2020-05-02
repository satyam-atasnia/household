package com.example.lbm1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class l_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_login);
        Button l_l =(Button)findViewById(R.id.l_l);

        l_l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), l_l.class);
                startActivity(i);
            }
        });

        Button l_s =(Button)findViewById(R.id.l_s);

        l_s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(), l_s.class);
                startActivity(j);
            }
        });
    }
}
