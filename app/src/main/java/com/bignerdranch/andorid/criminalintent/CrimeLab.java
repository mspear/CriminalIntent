package com.bignerdranch.andorid.criminalintent;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by mspear on 2/29/16.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private static final String TAG = "log tag";

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
    public void deleteCrime(Crime crime) {
        Log.d(TAG, "deleteCrime: " + crime.getId().toString());
        for (int i=0; i <= mCrimes.size(); i++) {
            Log.d(TAG, "deleteCrime: "+mCrimes.get(i).getId().toString());
            if (mCrimes.get(i).getId().equals(crime.getId())) {
                mCrimes.remove(i);
                break;
            }
        }
    }

}
