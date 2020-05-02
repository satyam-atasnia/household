package com.example.lbm1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class book extends AppCompatActivity {
    EditText time;
    EditText lb_typ;
    CalendarView date;

    DatabaseReference databaseBooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        databaseBooking = FirebaseDatabase.getInstance().getReference("bookings");

         time = (EditText) findViewById(R.id.time);
         lb_typ = (EditText) findViewById(R.id.lb_typ);
         date = (CalendarView) findViewById(R.id.date);
        Button b_btn =(Button) findViewById(R.id.b_btn);

        b_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), c_view.class);
                addBooking();
                startActivity(i);
            }
        });

        Button vpo =(Button) findViewById(R.id.vpo);

        vpo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), c_view.class);
                startActivity(i);
            }
        });


    }
    public void addBooking(){

        String time1 = time.getText().toString().trim();
        String lb_typ1 = lb_typ.getText().toString().trim();

        if(!TextUtils.isEmpty(time1)&&!TextUtils.isEmpty(lb_typ1)){

            String id = databaseBooking.push().getKey();

            Booking booking = new Booking(lb_typ,date,time);

            databaseBooking.child(id).setValue(booking);

            Toast.makeText(this,"Booking successful",Toast.LENGTH_LONG).show();
        }
        else{Toast.makeText(this,"Enter complete Details",Toast.LENGTH_LONG).show();
        }

    }


}
