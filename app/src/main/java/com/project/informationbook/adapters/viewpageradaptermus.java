package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.fragbritish;
import com.project.informationbook.fragments.fragdel;
import com.project.informationbook.fragments.fragfrance;
import com.project.informationbook.fragments.fraghermi;
import com.project.informationbook.fragments.fragindia;
import com.project.informationbook.fragments.fragitaly;
import com.project.informationbook.fragments.fraglove;
import com.project.informationbook.fragments.fragmetro;
import com.project.informationbook.fragments.fraguff;
import com.project.informationbook.fragments.fraguk;
import com.project.informationbook.fragments.fragusa;
import com.project.informationbook.fragments.fragvati;

public class viewpageradaptermus extends FragmentStateAdapter {
    public viewpageradaptermus(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       Fragment frag;
        switch (position)
        {
            case 0:
                frag= fraglove.newInstance();
                break;
            case 1:
                frag= fragbritish.newInstance();
                break;
            case 2:
                frag= fraghermi.newInstance();
                break;
            case 3:
                frag= fragmetro.newInstance();
                break;
            case 4:
                frag= fragvati.newInstance();
                break;
            case 5:
                frag= fraguff.newInstance();
                break;
            case 6:
                frag= fragdel.newInstance();
                break;


            default:
                return null;
        }
        return frag;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
