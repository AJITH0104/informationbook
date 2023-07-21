package com.project.informationbook.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.project.informationbook.R;
import com.project.informationbook.adapters.adapterclass;
import com.project.informationbook.modelclass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<modelclass> arrayList=new ArrayList<>();
    RecyclerView recyclerView;
    adapterclass adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycle);
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        modelclass modelClass1=new modelclass("countries","the countries");
        modelclass modelClass2=new modelclass("leader","the leaders");
        modelclass modelClass3=new modelclass("museum","the museum");
        modelclass modelClass4=new modelclass("wonders","the wonders");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);
        adapter=new adapterclass(arrayList,this);
        recyclerView.setAdapter(adapter);
    }
}