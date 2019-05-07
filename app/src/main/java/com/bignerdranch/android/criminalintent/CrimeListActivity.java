package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Create by zhengzhuangzhu on 2019-05-07
 * Describe:
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
