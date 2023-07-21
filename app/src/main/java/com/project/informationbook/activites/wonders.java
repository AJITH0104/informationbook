package com.project.informationbook.activites;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.viewpageradapterwonders;

public class wonders extends AppCompatActivity {

    TabLayout tabwonders;
    ViewPager2 viewwonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabwonders=findViewById(R.id.tabwonders);
        viewwonders=findViewById(R.id.wonderspager);

        viewpageradapterwonders adapter=new viewpageradapterwonders(getSupportFragmentManager(),getLifecycle());
        viewwonders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabwonders, viewwonders, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position)
                {
                    case 0:
                        tab.setText("Taj Mahal");
                        break;
                    case 1:
                        tab.setText("The Pyramid Of Giza");
                        break;
                    case 2:
                        tab.setText("The Great Wall of China");
                        break;
                    case 3:
                        tab.setText("Machu Pichu");
                        break;
                    case 4:
                        tab.setText("Petra");
                        break;
                    case 5:
                        tab.setText("COlosseum");
                        break;
                    case 6:
                        tab.setText("Christ The Redeemer");
                        break;
                    case 7:
                        tab.setText("Chicken Itza");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}