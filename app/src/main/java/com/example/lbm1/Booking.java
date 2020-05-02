package com.example.lbm1;

import android.widget.CalendarView;
import android.widget.EditText;

public class Booking {

    String lb_typ;
    String date;
    String time;

    public Booking(EditText lb_typ, CalendarView date, EditText time){

    }

    public Booking(String lb_typ, String date, String time) {
        this.lb_typ = lb_typ;
        this.date = date;
        this.time = time;
    }

    public void setLb_typ(String lb_typ) {
        this.lb_typ = lb_typ;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
