package com.miftahjuanda.jahitanku.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.miftahjuanda.jahitanku.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMall extends Fragment {


    public FragmentMall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mall, container, false);
    }

}
