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

public class fragmodi extends Fragment {
ImageView imageViewmodi;
ProgressBar progress;

    public static fragmodi newInstance() {
        return new fragmodi();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentmodi,container,false);
        imageViewmodi=view.findViewById(R.id.imageViewmodi);
        progress=view.findViewById(R.id.progressBarmodi);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/c/c4/Official_Photograph_of_Prime_Minister_Narendra_Modi_Portrait.png").into(imageViewmodi, new Callback() {
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
