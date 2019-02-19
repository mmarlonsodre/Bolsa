package com.example.marlonsodre.bolsa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ConexaoDB {
    private static ConexaoDB conexaoDB;
    private SQLiteDatabase db;

    private ConexaoDB(Context context){
        DbHelper helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }

    public static ConexaoDB getInstance(Context context){
        if (conexaoDB == null){
            conexaoDB = new ConexaoDB(context);
        }
        return conexaoDB;
    }

    public SQLiteDatabase getDb(){
        return db;
    }
}
