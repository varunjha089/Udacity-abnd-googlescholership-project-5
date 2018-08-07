package com.example.bharatmk257.guide;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class EntertainmentFragment extends Fragment {
    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Places> placesList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_entertainment,null);
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
        recyclerView = getActivity().findViewById(R.id.recyclerViewEntertainmentPlace);
    }
    private void photos(){
        int[] covers = new int[]{
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment,
                R.drawable.entertainment
        };
        String[] entertainment = getResources().getStringArray(R.array.entertainment);
        placesList = new ArrayList<>();
        Places a = new Places(entertainment[0],covers[0],entertainment[10]);
        placesList.add(a);
        a =  new Places(entertainment[1],covers[1],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[2],covers[2],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[3],covers[3],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[4],covers[4],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[5],covers[5],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[6],covers[6],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[7],covers[7],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[8],covers[8],entertainment[10]);
        placesList.add(a);
        a = new Places(entertainment[9],covers[9],entertainment[10]);
        placesList.add(a);
    }
}
