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

public class fragant extends Fragment {
ImageView imageViewant;
ProgressBar progress;

    public static fragant newInstance() {
        return new fragant();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentant,container,false);
        imageViewant=view.findViewById(R.id.imageViewant);
        progress=view.findViewById(R.id.progressBarant);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Anthony_Albanese_portrait_%28cropped%29.jpg/330px-Anthony_Albanese_portrait_%28cropped%29.jpg").into(imageViewant, new Callback() {
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
