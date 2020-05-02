package com.example.lbm1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "lbm.db";
    public static final String TABLE_N1 = "labour";
    public static final String TABLE_N2 = "customer";
    public static final String col_1 = "NAME";
    public static final String col_2 = "PHONE";
    public static final String col_3 = "AREA";
    public static final String col_4 = "TYPE";
    public static final String col_5 = "EMAIL";
    public static final String col_6 = "PASSWORD";
    public static final String col_1c = "NAME";
    public static final String col_2c = "PHONE";
    public static final String col_3c = "AREA";
    public static final String col_4c = "TYPE";
    public static final String col_5c = "EMAIL";
    public static final String col_6c = "PASSWORD";

    Database(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_N1 + "(" + col_1 + "TEXT," + col_2 + "INTEGER," + col_3 + " TEXT," + col_4 + "TEXT," + col_5 + " TEXT," + col_6 + "TEXT)");
        db.execSQL("create table " + TABLE_N2 + "(" + col_1c + "TEXT," + col_2c + "INTEGER," + col_3c + "TEXT," + col_4c + "TEXT," + col_5c + "TEXT," + col_6c + "TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_N1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_N2);
        onCreate(db);
    }

    public boolean insertData(String name, String phone, String area, String type, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1, name);
        contentValues.put(col_2, phone);
        contentValues.put(col_3, area);
        contentValues.put(col_4, type);
        contentValues.put(col_5, email);
        contentValues.put(col_6, password);
        long result = db.insert(TABLE_N1, null, contentValues);
        return result != -1;

    }

    public boolean insertData1(String name, String phone, String address, String pin, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1c, name);
        contentValues.put(col_2c, phone);
        contentValues.put(col_3c, address);
        contentValues.put(col_4c, pin);
        contentValues.put(col_5c, email);
        contentValues.put(col_6c, password);
        long result = db.insert(TABLE_N2, null, contentValues);
          return result != -1;

    }
}

