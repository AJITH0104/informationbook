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

public class fraghermi extends Fragment {
ImageView imageViewhermi;
ProgressBar progress;

    public static fraghermi newInstance() {
        return new fraghermi();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragmenthermi,container,false);
        imageViewhermi=view.findViewById(R.id.imageViewhermi);
        progress=view.findViewById(R.id.progressBarhermi);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/5174-3._St._Petersburg._Greater_Hermitage.jpg/330px-5174-3._St._Petersburg._Greater_Hermitage.jpg").into(imageViewhermi, new Callback() {
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
