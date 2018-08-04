package com.example.bharatmk257.guide;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class LibraryFragment extends Fragment {

    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Places> placesList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_library,null);
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
        recyclerView =getActivity().findViewById(R.id.recyclerViewLibraryPlace);
    }

    private void photos(){
        int[] covers = new int[]{
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image,
                R.raw.library_image
        };

        placesList =new ArrayList<>();
        Places
                a = new Places("Reading library",covers[0],"Location");
        placesList.add(a);
        a = new Places("MJ Library",covers[1],"Location");
        placesList.add(a);
        a = new Places("G.S.",covers[2],"Location");
        placesList.add(a);
        a = new Places("Naroda Library",covers[3],"Location");
        placesList.add(a);
        a = new Places("Vikram Sarabhai",covers[4],"Location");
        placesList.add(a);
        a = new Places("Garg Library",covers[5],"Location");
        placesList.add(a);
        a = new Places("Shreeji",covers[6],"Location");
        placesList.add(a);
        a = new Places("Asarva Library",covers[7],"Location");
        placesList.add(a);
        a = new Places("Shubh",covers[8],"Location");
        placesList.add(a);
        a = new Places("American Corner",covers[9],"Location");
        placesList.add(a);
    }

}
