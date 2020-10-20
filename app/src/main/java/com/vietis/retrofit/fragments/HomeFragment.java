package com.vietis.retrofit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vietis.retrofit.R;
import com.vietis.retrofit.storage.SharedPrefManager;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView txtEmail = view.findViewById(R.id.txtEmail);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtSchool = view.findViewById(R.id.txtSchool);

        txtEmail.setText(SharedPrefManager.getInstance(getActivity()).getUser().getEmail());
        txtName.setText(SharedPrefManager.getInstance(getActivity()).getUser().getName());
        txtSchool.setText(SharedPrefManager.getInstance(getActivity()).getUser().getSchool());
    }
}
