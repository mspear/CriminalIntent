package com.bignerdranch.andorid.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mspear on 2/29/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
