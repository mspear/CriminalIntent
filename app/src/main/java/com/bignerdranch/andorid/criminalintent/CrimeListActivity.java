package com.bignerdranch.andorid.criminalintent;

import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by mspear on 2/29/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

//    private static final String EXTRA_CRIME_ID =
//            "com.bignerdranch.android.criminalintent.crime_id";

    @Override
    protected Fragment createFragment() {
//        UUID crimeId = (UUID) getIntent()
//                .getSerializableExtra(EXTRA_CRIME_ID);
        return new CrimeListFragment();
    }
}
