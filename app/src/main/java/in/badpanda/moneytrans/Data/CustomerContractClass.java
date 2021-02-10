package in.badpanda.moneytrans.Data;

import android.provider.BaseColumns;

public final class CustomerContractClass {
    private CustomerContractClass(){}

    public static abstract class customers implements BaseColumns{
        public static final String TABLE_NAME = "Customers";

        public static final String COLUMN_ACCNUM = "ACCOUNT NUMBER";
        public static final String COLUMN_NAME = "NAME";
        public static final String COLUMN_BALANCE = "BALANCE";
    }

    public static abstract class transactions implements BaseColumns{
        public static final String TABLE_NAME = "Transactions";

        public static final String COLUMN_TRANSACTION_ID = "TRANSACTION ID";
        public static final String COLUMN_AMOUNT = "TRANSFER AMOUNT";
        public static final String COLUMN_FROM_ACCOUNT = "FROM ACCOUNT";
        public static final String COLUMN_TO_ACCOUNT = "TO ACCOUNT";
        public static final String COLUMN_DATE = "TRANSACTION DATE";
    }


}
