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

public class fragcolo extends Fragment {
ImageView imageViewcolo;
ProgressBar progress;

    public static fragcolo newInstance() {
        return new fragcolo();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentcolo,container,false);
        imageViewcolo=view.findViewById(R.id.imageViewcolo);
        progress=view.findViewById(R.id.progressBarcolo);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Colosseo_2020.jpg/405px-Colosseo_2020.jpg").into(imageViewcolo, new Callback() {
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
