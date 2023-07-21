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

public class fragalain extends Fragment {
ImageView imageViewalain;
ProgressBar progress;

    public static fragalain newInstance() {
        return new fragalain();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmentalain,container,false);
        imageViewalain=view.findViewById(R.id.imageViewalain);
        progress=view.findViewById(R.id.progressBaralain);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Alain_Berset_%282023%29.jpg/330px-Alain_Berset_%282023%29.jpg").into(imageViewalain, new Callback() {
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
