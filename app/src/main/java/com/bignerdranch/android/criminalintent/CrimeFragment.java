package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import static android.widget.CompoundButton.OnCheckedChangeListener;

/**
 * Create by zhengzhuangzhu on 2019-05-07
 * Describe:
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mCrimeTitle;
    private Button mCrimeDate;
    private CheckBox mCrimeSolved;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);
        initView(v);
        return v;
    }

    private void initView(View v) {
        mCrimeTitle = (EditText) v.findViewById(R.id.crime_title);
        mCrimeDate = (Button) v.findViewById(R.id.crime_date);
        mCrimeSolved = (CheckBox) v.findViewById(R.id.crime_solved);

        mCrimeTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mCrimeDate.setText(mCrime.getDate().toString());
        mCrimeDate.setEnabled(false);
        mCrimeSolved.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });
    }
}
