package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.fragalain;
import com.project.informationbook.fragments.fragant;
import com.project.informationbook.fragments.fragfrance;
import com.project.informationbook.fragments.fragindia;
import com.project.informationbook.fragments.fragitaly;
import com.project.informationbook.fragments.fragjoe;
import com.project.informationbook.fragments.fragleo;
import com.project.informationbook.fragments.fraglopez;
import com.project.informationbook.fragments.fragmeloni;
import com.project.informationbook.fragments.fragmodi;
import com.project.informationbook.fragments.fragrishi;
import com.project.informationbook.fragments.fraguk;
import com.project.informationbook.fragments.fragusa;

public class viewpageradapterleaders extends FragmentStateAdapter {
    public viewpageradapterleaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       Fragment frag;
        switch (position)
        {
            case 0:
               frag= fragmodi.newInstance();
               break;
            case 1:
                frag= fraglopez.newInstance();
                break;
            case 2:
                frag= fragalain.newInstance();
                break;
            case 3:
                frag= fragant.newInstance();
                break;
            case 4:
                frag= fragmeloni.newInstance();
                break;
            case 5:
                frag= fragjoe.newInstance();
                break;
            case 6:
                frag= fragrishi.newInstance();
                break;
            case 7:
                frag= fragleo.newInstance();
                break;

            default:
                return null;
        }
        return frag;
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
