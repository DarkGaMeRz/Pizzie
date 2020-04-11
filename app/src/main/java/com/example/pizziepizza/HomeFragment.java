package com.example.pizziepizza;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home,container,false);

    }
}