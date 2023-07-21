package com.project.informationbook.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.viewpageradaptercountry;

public class country extends AppCompatActivity {
    private TabLayout table;
    ViewPager2 viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        table=findViewById(R.id.tabuk);
        viewpager=findViewById(R.id.ukpager);

        viewpageradaptercountry adapter=new viewpageradaptercountry(getSupportFragmentManager(),getLifecycle());
        viewpager.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(table, viewpager, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position)
                {
                    case 0:
                        tab.setText("United Kingdom");
                        break;//here we add the different fragments then we specify the necessary titles
                    case 1:
                        tab.setText("France");
                        break;
                    case 2:
                        tab.setText("India");
                        break;
                    case 3:
                        tab.setText("USA");
                        break;
                    case 4:
                        tab.setText("Italy");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}