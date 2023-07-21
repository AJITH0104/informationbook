package com.project.informationbook.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.viewpageradaptermus;

public class museum extends AppCompatActivity {

    TabLayout tabmus;
    ViewPager2 musview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        tabmus=findViewById(R.id.tabmus);
        musview=findViewById(R.id. muspager);

        viewpageradaptermus mus=new viewpageradaptermus(getSupportFragmentManager(),getLifecycle());
        musview.setAdapter(mus);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabmus, musview, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("Louvre Museum");
                        break;
                    case 1:
                        tab.setText("British Museum");
                        break;
                    case 2:
                        tab.setText("Hermitage Museum");
                        break;
                    case 3:
                        tab.setText("Metropolitan Museum of Art");
                        break;
                    case 4:
                        tab.setText("Vatican Museums");
                        break;
                    case 5:
                        tab.setText("Uffizi");
                        break;

                    case 6:
                        tab.setText("Museo del Prado");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}