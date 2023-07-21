package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.fragfrance;
import com.project.informationbook.fragments.fragindia;
import com.project.informationbook.fragments.fragitaly;
import com.project.informationbook.fragments.fraguk;
import com.project.informationbook.fragments.fragusa;

public class viewpageradaptercountry extends FragmentStateAdapter {
    public viewpageradaptercountry(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       Fragment frag;
        switch (position)
        {
            case 0:
                frag= fraguk.newInstance();
                break;
            case 1:
                frag= fragfrance.newInstance();
                break;
            case 2:
               frag= fragindia.newInstance();
                break;
            case 3:
                frag= fragusa.newInstance();
                break;
            case 4:
                frag= fragitaly.newInstance();
                break;

            default:
                return null;
        }
        return frag;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
