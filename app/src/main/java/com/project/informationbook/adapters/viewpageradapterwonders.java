package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.fragchicken;
import com.project.informationbook.fragments.fragchrist;
import com.project.informationbook.fragments.fragcolo;
import com.project.informationbook.fragments.fragfrance;
import com.project.informationbook.fragments.fraggiza;
import com.project.informationbook.fragments.fragindia;
import com.project.informationbook.fragments.fragitaly;
import com.project.informationbook.fragments.fragpetra;
import com.project.informationbook.fragments.fragpichu;
import com.project.informationbook.fragments.fragtajmahal;
import com.project.informationbook.fragments.fraguk;
import com.project.informationbook.fragments.fragusa;
import com.project.informationbook.fragments.fragwall;

public class viewpageradapterwonders extends FragmentStateAdapter {
    public viewpageradapterwonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       Fragment frag;
        switch (position)
        {
            case 0:
               frag= fragtajmahal.newInstance();
               break;
            case 1:
                frag= fraggiza.newInstance();
                break;
            case 2:
                frag= fragwall.newInstance();
                break;
            case 3:
                frag= fragpichu.newInstance();
                break;
            case 4:
                frag= fragpetra.newInstance();
                break;
            case 5:
                frag= fragcolo.newInstance();
                break;
            case 6:
                frag= fragchrist.newInstance();
                break;

            case 7:
                frag= fragchicken.newInstance();
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
