package com.bibek.labmp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "College", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE BCA6th(" +
                "RollNumber INTEGER PRIMARY KEY," +
                "Name TEXT," +
                "Batch TEXT," +
                "Course TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS BCA6th");
        onCreate(db);
    }

    public boolean insertData(int roll, String name, String batch, String course) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("RollNumber", roll);
        cv.put("Name", name);
        cv.put("Batch", batch);
        cv.put("Course", course);

        long result = db.insert("BCA6th", null, cv);

        return result != -1;
    }

    public Cursor getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM BCA6th", null);
    }

    public boolean updateData(int roll, String name, String batch, String course) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name", name);
        cv.put("Batch", batch);
        cv.put("Course", course);

        db.update("BCA6th", cv, "RollNumber=?", new String[]{String.valueOf(roll)});
        return true;
    }

    public void deleteData(int roll) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("BCA6th", "RollNumber=?", new String[]{String.valueOf(roll)});
    }
}