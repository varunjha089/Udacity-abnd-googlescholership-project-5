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
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library,
                R.drawable.library
        };
        String[] library = getResources().getStringArray(R.array.library);
        placesList =new ArrayList<>();
        Places a = new Places(library[0],covers[0],library[10]);
        placesList.add(a);
        a = new Places(library[1],covers[1],library[10]);
        placesList.add(a);
        a = new Places(library[2],covers[2],library[10]);
        placesList.add(a);
        a = new Places(library[3],covers[3],library[10]);
        placesList.add(a);
        a = new Places(library[4],covers[4],library[10]);
        placesList.add(a);
        a = new Places(library[5],covers[5],library[10]);
        placesList.add(a);
        a = new Places(library[6],covers[6],library[10]);
        placesList.add(a);
        a = new Places(library[7],covers[7],library[10]);
        placesList.add(a);
            a = new Places(library[8],covers[8],library[10]);
        placesList.add(a);
        a = new Places(library[9],covers[9],library[10]);
        placesList.add(a);
    }
}
