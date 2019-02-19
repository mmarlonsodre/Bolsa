package com.example.marlonsodre.bolsa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME= "bolsa.dp";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE = "CREATE TABLE acoes (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nome TEXT NOT NULL, data TEXT NOT NULL, valor TEXT NOT NULL);";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS acoes";

    public DbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DROP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);

    }
}
