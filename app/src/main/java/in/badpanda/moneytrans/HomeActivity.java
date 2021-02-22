package in.badpanda.moneytrans;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

import in.badpanda.moneytrans.Data.CustomerDbHelper;

public class HomeActivity extends AppCompatActivity {

    private CustomersAdapter mAdapter;
    private CustomerDbHelper mCustomerDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ArrayList<Customers> listofaccounts = new ArrayList<>();
        listofaccounts.add(new Customers("Divyansh Prasad", 500000000, "1080397222"));

        mCustomerDbHelper = new CustomerDbHelper(this);
        SQLiteDatabase DB = mCustomerDbHelper.getReadableDatabase();

        mAdapter = new CustomersAdapter(this, listofaccounts);
        ListView earthquakeView = findViewById(R.id.listView);
        earthquakeView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.inflater_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.insertDummyData:
                startActivity(new Intent(this,InsertDummyData.class));
                return true;


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }
}