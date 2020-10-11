package com.vikas.studytable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;

    private static final String DB_NAME = "datadb";
    private static final String TABLE_NAME = "subjects";
    private static final String COL1 = "id";
    private static final String COL2 = "name";
    private static final String COL3 = "sub1";
    private static final String COL4 = "sub2";
    private static final String COL5 = "sub3";
    private static final String COL6 = "sub4";
    private static final String COL7 = "sub5";
    private static final String COL8 = "sub6";
    private static final String COL9 = "sub7";
    private static final String COL10 = "bio";


    public DbHelper(Context context){
        super(context , DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DATA = "CREATE TABLE " + TABLE_NAME + "("
                + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COL2 + " TEXT,"
                + COL3 + " TEXT,"
                + COL4 + " TEXT,"
                + COL5 + " TEXT,"
                + COL6 + " TEXT,"
                + COL7 + " TEXT,"
                + COL8 + " TEXT,"
                + COL9 + " TEXT,"
                + COL10 + " TEXT" + ")";

        String createTable = "CREATE TABLE " + TaskContract.TaskEntry.TABLE + " ( " +
                TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(CREATE_DATA);
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        switch (i) {
            case 1:
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
                break;
            case 2:
                db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE);
                break;
        }
        onCreate(db);
    }


    public void insert_name(String name) {
        String x = "no";
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, name);
        contentValues.put(COL3, x);
        contentValues.put(COL4, x);
        contentValues.put(COL5, x);
        contentValues.put(COL6, x);
        contentValues.put(COL7, x);
        contentValues.put(COL8, x);
        contentValues.put(COL9, x);
        contentValues.put(COL10, x);
        db.insert(TABLE_NAME,null, contentValues);
        db.close();
    }

    public void sub1(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL3, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub2(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL4, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub3(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL5, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub4(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL6, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub5(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL7, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub6(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL8, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void sub7(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL9, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public void profile(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL10, name);
        db.update(TABLE_NAME, contentValues, COL1 + " = " + 1, null);
        db.close();
    }

    public Cursor get_data() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

}
