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

public class fraglopez extends Fragment {
ImageView imageViewlopez;
ProgressBar progress;

    public static fraglopez newInstance() {
        return new fraglopez();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentlopez,container,false);
        imageViewlopez=view.findViewById(R.id.imageViewlopez);
        progress=view.findViewById(R.id.progressBarlopez);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Conferencia_de_prensa_del_Presidente_de_M%C3%A9xico_-_Mi%C3%A9rcoles_24_de_junio_de_2020_6_%28cropped%29.jpg/330px-Conferencia_de_prensa_del_Presidente_de_M%C3%A9xico_-_Mi%C3%A9rcoles_24_de_junio_de_2020_6_%28cropped%29.jpg").into(imageViewlopez, new Callback() {
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
