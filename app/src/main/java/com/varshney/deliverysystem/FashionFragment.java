package com.varshney.deliverysystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.varshney.deliverysystem.Adapters.FashionAdapter;
import com.varshney.deliverysystem.Pojos.Fashion;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FashionFragment extends Fragment {
    public static final String TAG = "FF";

    public FashionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView rvRecyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view,container,false);

        ArrayList<Fashion> fashionArrayList = new ArrayList<>();

        Fashion dummyData = new Fashion();
        dummyData.setCount_of_item(5);
        dummyData.setName("Hello");
        fashionArrayList.add(dummyData);
        fashionArrayList.add(dummyData);
        fashionArrayList.add(dummyData);
        fashionArrayList.add(dummyData);
        fashionArrayList.add(dummyData);

        FashionAdapter fashionAdapter = new FashionAdapter(getContext(),fashionArrayList);
        rvRecyclerView.setHasFixedSize(true);
        rvRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvRecyclerView.setAdapter(fashionAdapter);

        Log.d(TAG, "onCreateView: "+fashionArrayList.size());
        return  rvRecyclerView;
    }

}
