package com.bignerdranch.andorid.criminalintent.database;

import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mspear on 3/15/16.
 */
public class CrimeDbSchema{

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
