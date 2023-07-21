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

public class fragvati extends Fragment {
ImageView imageViewvati;
ProgressBar progress;

    public static fragvati newInstance() {
        return new fragvati();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentvati,container,false);
        imageViewvati=view.findViewById(R.id.imageViewvati);
        progress=view.findViewById(R.id.progressBarvati);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Rome_Vatican_Museums.jpg/330px-Rome_Vatican_Museums.jpg").into(imageViewvati, new Callback() {
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
