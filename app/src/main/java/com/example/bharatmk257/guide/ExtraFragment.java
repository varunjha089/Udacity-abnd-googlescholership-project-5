package com.example.bharatmk257.guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ExtraFragment extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Places> placesList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
     return inflater.inflate(R.layout.fragment_extra,null);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        initViews();
        photos();
        adapter = new PlaceAdapter(getContext(),placesList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
    }
    private void initViews(){
        recyclerView = getActivity().findViewById(R.id.recyclerViewExtraPlace);
    }
    private void photos(){
        int [] covers = new int[]{
        R.drawable.cinema,
                R.drawable.cinema,
                R.drawable.mcdonalds,
                R.drawable.dhosa,
                R.drawable.dhosa,
                R.drawable.gym,
                R.drawable.gym,
                R.drawable.gym,
                R.drawable.gym,
                R.drawable.extra
    };
        String [] extra = getResources().getStringArray(R.array.extra);
        placesList = new ArrayList<>();
        Places a = new Places(extra[0],covers[0],extra[10]);
        placesList.add(a);
        a = new Places(extra[1],covers[1],extra[10]);
        placesList.add(a);
        a = new Places(extra[2],covers[2],extra[10]);
        placesList.add(a);
        a = new Places(extra[3],covers[3],extra[10]);
        placesList.add(a);
        a = new Places(extra[4],covers[4],extra[10]);
        placesList.add(a);
        a = new Places(extra[5],covers[5],extra[10]);
        placesList.add(a);
        a = new Places(extra[6],covers[6],extra[10]);
        placesList.add(a);
        a = new Places(extra[7],covers[7],extra[10]);
        placesList.add(a);
        a = new Places(extra[8],covers[8],extra[10]);
        placesList.add(a);
        a = new Places(extra[9],covers[9],extra[10]);
        placesList.add(a);
    }
}
