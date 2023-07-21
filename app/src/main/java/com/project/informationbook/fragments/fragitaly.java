package com.project.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class fragitaly extends Fragment {


    ImageView imageViewitaly;
ProgressBar progress;

    public static fragitaly newInstance() {
        return new fragitaly();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentitaly,container,false);
        imageViewitaly=view.findViewById(R.id.imageViewitaly);
        progress=view.findViewById(R.id.progressBaritaly);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/188px-Flag_of_Italy.svg.png").into(imageViewitaly, new Callback() {
            @Override
            public void onSuccess() {
                progress.setVisibility(view.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progress.setVisibility(view.INVISIBLE);
            }
        });
        return view;
    }
}
