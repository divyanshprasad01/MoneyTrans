package in.badpanda.moneytrans;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import in.badpanda.moneytrans.Data.CustomerDbHelper;

public class HomeActivity extends AppCompatActivity {

    private CustomersAdapter mAdapter;
    private CustomerDbHelper mCustomerDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<Customers> listofaccounts = new ArrayList<>();
        listofaccounts.add(new Customers("Divyansh Prasad", 500000000,"1080397222"));

        mCustomerDbHelper = new CustomerDbHelper(this);
        SQLiteDatabase DB = mCustomerDbHelper.getReadableDatabase();

        mAdapter = new CustomersAdapter(this, listofaccounts);
        ListView earthquakeView = findViewById(R.id.listView);
        earthquakeView.setAdapter(mAdapter);
    }
}