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

public class fragpetra extends Fragment {
ImageView imageViewpetra;
ProgressBar progress;

    public static fragpetra newInstance() {
        return new fragpetra();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentpetra,container,false);
        imageViewpetra=view.findViewById(R.id.imageViewpetra);
        progress=view.findViewById(R.id.progressBarpetra);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Treasury_petra_crop.jpeg/300px-Treasury_petra_crop.jpeg").into(imageViewpetra, new Callback() {
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
