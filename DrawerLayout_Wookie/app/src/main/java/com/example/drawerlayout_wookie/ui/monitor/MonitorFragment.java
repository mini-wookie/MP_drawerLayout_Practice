package com.example.drawerlayout_wookie.ui.monitor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.drawerlayout_wookie.R;

public class MonitorFragment extends Fragment {

    private MonitorViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_monitor, container, false);
        final TextView textView = root.findViewById(R.id.text_monitor);
        mViewModel = ViewModelProviders.of(this).get(MonitorViewModel.class);
        mViewModel.getText().observe(getViewLifecycleOwner(),
                new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        textView.setText(s); }
                });
        return root;
    }
}