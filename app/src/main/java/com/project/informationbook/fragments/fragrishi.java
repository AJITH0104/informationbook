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

public class fragrishi extends Fragment {
ImageView imageViewrishi;
ProgressBar progress;

    public static fragrishi newInstance() {
        return new fragrishi();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentrishi,container,false);
        imageViewrishi=view.findViewById(R.id.imageViewrishi);
        progress=view.findViewById(R.id.progressBarrishi);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Prime_Minister_Rishi_Sunak_arrives_in_Downing_Street_%28cropped%29.jpg/330px-Prime_Minister_Rishi_Sunak_arrives_in_Downing_Street_%28cropped%29.jpg").into(imageViewrishi, new Callback() {
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
