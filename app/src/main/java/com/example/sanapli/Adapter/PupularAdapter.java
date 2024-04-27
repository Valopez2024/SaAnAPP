package com.example.sanapli.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.sanapli.databinding.ViewholderOraListBinding;
import com.example.sanapli.domain.PopularDomain;

import java.util.ArrayList;

import kotlin.text.UStringsKt;

public class PupularAdapter extends RecyclerView.Adapter<PupularAdapter.viewholde>{

    ArrayList<PopularDomain> Items;
    Context context;
    ViewholderOraListBinding binding;

    public PupularAdapter(ArrayList<PopularDomain> items) {
        Items = items;
    }

    @NonNull
    @Override
    public PupularAdapter.viewholde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding=ViewholderOraListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new viewholde(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PupularAdapter.viewholde holder, int position) {
        binding.Titletext.setText(Items.get(position).getTitle());
        binding.feeTxt.setText("$"+ Items.get(position).getPrice());
        binding.scoretext.setText(""+Items.get(position).getScore());

        int drawableResourced; drawableResourced= holder.itemView.getResources().getIdentifier(Items.get(position).getPicurl()
                ,"drawable",holder.itemView.getContext().getPackageName());


    Glide.with(context).load(drawableResourced).transform(new GranularRoundedCorners(30,30,0,0))
            .into(binding.imageView15);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    public class viewholde extends RecyclerView.ViewHolder {

        public viewholde(ViewholderOraListBinding binding){
            super(binding.getRoot());
        }
    }
}
