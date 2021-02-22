package in.badpanda.moneytrans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.badpanda.moneytrans.Data.CustomerContractClass;
import in.badpanda.moneytrans.Data.CustomerDbHelper;

public class InsertDummyData extends AppCompatActivity {

    private CustomerDbHelper customerDbHelper;
    EditText dummyName, dummyAccountNumber, dummyBalance;
    Button saveDummyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_dummy_data);

        dummyAccountNumber = findViewById(R.id.dummyAccountNumber);
        dummyBalance = findViewById(R.id.dummyBalance);
        dummyName  = findViewById(R.id.dummyName);
        saveDummyData = findViewById(R.id.saveDummyData);

        customerDbHelper = new CustomerDbHelper(this);
        SQLiteDatabase database = customerDbHelper.getWritableDatabase();



        saveDummyData.setOnClickListener(v -> {
            String  Name = "Divyansh Prasad";
            String  AccountNumber = "1";
            long  Balance = 5000;

            ContentValues contentValues = new ContentValues();

            contentValues.put(CustomerContractClass.customers.COLUMN_NAME,Name);
            contentValues.put(CustomerContractClass.customers.COLUMN_BALANCE,Balance);
            contentValues.put(CustomerContractClass.customers.COLUMN_ACCNUM,AccountNumber);

            long vlaue = database.insert(CustomerContractClass.customers.TABLE_NAME, null, contentValues);

        });



    }
}