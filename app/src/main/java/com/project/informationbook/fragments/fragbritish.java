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

public class fragbritish extends Fragment {
ImageView imageViewbritish;
ProgressBar progress;

    public static fragbritish newInstance() {
        return new fragbritish();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentbritish,container,false);
        imageViewbritish=view.findViewById(R.id.imageViewbritish);
        progress=view.findViewById(R.id.progressBarbritish);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/British_Museum_%28aerial%29.jpg/375px-British_Museum_%28aerial%29.jpg").into(imageViewbritish, new Callback() {
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
