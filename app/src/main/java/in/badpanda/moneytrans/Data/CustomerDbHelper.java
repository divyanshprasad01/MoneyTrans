package in.badpanda.moneytrans.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import in.badpanda.moneytrans.Data.CustomerContractClass.customers;

public class CustomerDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "customer.db";
    private static final int DATABASE_VERSION = 1;

    public CustomerDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CUSTOMER_TABLE = "CREATE TABLE " + customers.TABLE_NAME + " ( " + customers.COLUMN_ACCNUM + " INTEGER PRIMARY KEY ,"
                + customers.COLUMN_NAME + " TEXT NOT NULL," + customers.COLUMN_BALANCE + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(CREATE_CUSTOMER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
