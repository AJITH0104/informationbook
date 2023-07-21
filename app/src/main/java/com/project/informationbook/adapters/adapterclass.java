package com.project.informationbook.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.project.informationbook.R;
import com.project.informationbook.activites.country;
import com.project.informationbook.activites.leaders;
import com.project.informationbook.activites.museum;
import com.project.informationbook.activites.wonders;
import com.project.informationbook.modelclass;

import java.util.ArrayList;

public class adapterclass extends RecyclerView.Adapter<adapterclass.cardviewholder> {

    ArrayList<modelclass> modelist;
    Context context;

    public adapterclass(ArrayList<modelclass> modelist, Context context) {
        this.modelist = modelist;
        this.context = context;
    }

    @NonNull
    @Override
    public cardviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.carddesign,parent,false);
        return new cardviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardviewholder holder, @SuppressLint("RecyclerView") int position) {
        modelclass model=modelist.get(position);
        holder.textViewsplash.setText(model.getCategoryname());
        holder.imageViewsplash.setImageResource(context.getResources().getIdentifier(model.getImagename(),"drawable",context.getPackageName()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(context, country.class);
                    context.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(context, leaders.class);
                    context.startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(context, museum.class);
                    context.startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(context, wonders.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelist.size();
    }

    public class cardviewholder extends RecyclerView.ViewHolder {

        ImageView imageViewsplash;
        TextView textViewsplash;
        CardView cardView;

        public cardviewholder(@NonNull View itemView) {
            super(itemView);
            imageViewsplash=itemView.findViewById(R.id.imageviewsplash);
            textViewsplash=itemView.findViewById(R.id.textviewsplash);

            cardView=itemView.findViewById(R.id.cardview);

        }
    }
}
