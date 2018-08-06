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
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food
        };
        String[] food = getResources().getStringArray(R.array.food);
        placesList = new ArrayList<>();
        Places a = new Places(food[0], covers[0], food[10]);
        placesList.add(a);
        a = new Places(food[1], covers[1], food[10]);
        placesList.add(a);
        a = new Places(food[2], covers[2], food[10]);
        placesList.add(a);
        a = new Places(food[3], covers[3], food[10]);
        placesList.add(a);
        a = new Places(food[4], covers[4], food[10]);
        placesList.add(a);
        a = new Places(food[5], covers[5], food[10]);
        placesList.add(a);
        a = new Places(food[6], covers[6], food[10]);
        placesList.add(a);
        a = new Places(food[7], covers[7], food[10]);
        placesList.add(a);
        a = new Places(food[8], covers[8], food[10]);
        placesList.add(a);
        a = new Places(food[9], covers[9], food[10]);
        placesList.add(a);
    }
}