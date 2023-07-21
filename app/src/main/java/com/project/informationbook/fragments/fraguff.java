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

public class fraguff extends Fragment {
ImageView imageViewuff;
ProgressBar progress;

    public static fraguff newInstance() {
        return new fraguff();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentuff,container,false);
        imageViewuff=view.findViewById(R.id.imageViewuff);
        progress=view.findViewById(R.id.progressBaruff);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Florence%2C_Italy_Uffizi_Museum_-_panoramio_%285%29.jpg/330px-Florence%2C_Italy_Uffizi_Museum_-_panoramio_%285%29.jpg").into(imageViewuff, new Callback() {
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
