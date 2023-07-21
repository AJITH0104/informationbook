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

public class fragmeloni extends Fragment {
ImageView imageViewmeloni;
ProgressBar progress;

    public static fragmeloni newInstance() {
        return new fragmeloni();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentmeloni,container,false);
        imageViewmeloni=view.findViewById(R.id.imageViewmeloni);
        progress=view.findViewById(R.id.progressBarmeloni);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Giorgia_Meloni_Official_2023_%28cropped%29.jpg/330px-Giorgia_Meloni_Official_2023_%28cropped%29.jpg").into(imageViewmeloni, new Callback() {
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
