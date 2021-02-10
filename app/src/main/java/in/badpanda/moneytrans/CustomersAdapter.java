package in.badpanda.moneytrans;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomersAdapter extends ArrayAdapter<Customers> {

    public CustomersAdapter(Activity context, ArrayList<Customers> CoustmersView) {
        super(context, 0, CoustmersView);
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custmer_adapter, parent, false);
        }

        Customers customer = getItem(position);

//        Date dateObject = new Date(mEarthQuake.getTime());

        TextView mcustomerName = (TextView) listItemView.findViewById(R.id.CustomerName);
        mcustomerName.setText(customer.getName());

        TextView mcustomerAccountNumber = (TextView) listItemView.findViewById(R.id.AccountNumber);
        mcustomerAccountNumber.setText(customer.getAccountNumber());

        TextView mAccountBalance = (TextView) listItemView.findViewById(R.id.AccountBalance);
        mAccountBalance.setText(Long.toString(customer.getCurrBalance()));



//        Log.e("TEST", "TEST: ADAPTER  STARTED");

        return listItemView;
    }
}
