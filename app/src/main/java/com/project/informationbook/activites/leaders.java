package com.project.informationbook.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.viewpageradapterleaders;

public class leaders extends AppCompatActivity {

    TabLayout tableader;
    ViewPager2 viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);
        tableader=findViewById(R.id.tableaders);
        viewpager=findViewById(R.id.leaderpager);

        viewpageradapterleaders viewpageradapterleaders=new viewpageradapterleaders(getSupportFragmentManager(),getLifecycle());
        viewpager.setAdapter(viewpageradapterleaders);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tableader, viewpager, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0:
                        tab.setText("Narendra Modi");
                        break;
                    case 1:
                        tab.setText("Andrés Manuel López Obrador");
                        break;
                    case 2:
                        tab.setText("Alain Berset");
                        break;
                    case 3:
                        tab.setText("Anthony Albanese");
                        break;
                    case 4:
                        tab.setText("Giorgia Meloni");
                        break;
                    case 5:
                        tab.setText("Joe Biden");
                        break;
                    case 6:
                        tab.setText("Rishi Sunak");
                        break;
                    case 7:
                        tab.setText("Leo Varadkar");
                        break;


                }
            }
        });
        tabLayoutMediator.attach();
    }
}