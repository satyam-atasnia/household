package com.example.lbm1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class c_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_view);
        Button v_dn =(Button) findViewById(R.id.v_dn);


        v_dn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(c_view.this,"Review/Suggestion sent successfully",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), book.class);
                startActivity(i);
            }
        });


        Button v_bn =(Button) findViewById(R.id.v_bn);

        v_bn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), book.class);
                startActivity(i);
            }
        });



    }
}
