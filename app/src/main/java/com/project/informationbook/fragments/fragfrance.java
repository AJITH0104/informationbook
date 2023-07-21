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

public class fragfrance extends Fragment {
ImageView imageViewfrance;
ProgressBar progress;


    public static fragfrance newInstance() {
        return new fragfrance();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentfrance,container,false);
        imageViewfrance=view.findViewById(R.id.imageViewfrance);
        progress=view.findViewById(R.id.progressBarfrance);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/188px-Flag_of_France.svg.png").into(imageViewfrance, new Callback() {
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
