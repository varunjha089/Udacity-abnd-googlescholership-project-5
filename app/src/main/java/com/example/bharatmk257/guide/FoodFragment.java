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

public class FoodFragment extends Fragment {
    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Places> placesList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_food, null);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        photos();
        adapter = new PlaceAdapter(getContext(), placesList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
    }
    private void initViews() {
        recyclerView = getActivity().findViewById(R.id.recyclerViewFoodPlace);
    }
    private void photos() {
        int[] covers = new int[]{
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image,
                R.raw.food_image
        };
        placesList = new ArrayList<>();
        Places a = new Places("Hotel Damjis", covers[0], "Location");
        placesList.add(a);
        a = new Places("Hotel Pinnacle", covers[1], "Loction");
        placesList.add(a);
        a = new Places("Moti Mahal", covers[2], "Loction");
        placesList.add(a);
        a = new Places("Hotel AVN", covers[3], "Loction");
        placesList.add(a);
        a = new Places("Hotel Amber", covers[4], "Loction");
        placesList.add(a);
        a = new Places("Hotel Manila", covers[5], "Loction");
        placesList.add(a);
        a = new Places("Ramada", covers[6], "Loction");
        placesList.add(a);
        a = new Places("Cama Hotel", covers[7], "Loction");
        placesList.add(a);
        a = new Places("Summit", covers[8], "Loction");
        placesList.add(a);
        a = new Places("Nami", covers[9], "Loction");
        placesList.add(a);
    }
}