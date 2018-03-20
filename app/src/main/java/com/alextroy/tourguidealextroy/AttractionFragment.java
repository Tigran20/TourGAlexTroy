package com.alextroy.tourguidealextroy;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alextroy.tourguidealextroy.adapter.RecyclerAdapter;
import com.alextroy.tourguidealextroy.model.Attraction;
import com.alextroy.tourguidealextroy.model.Data;

import java.util.ArrayList;

public class AttractionFragment extends Fragment {

    private static final String TYPE = "type";
    private AttractiveType attrType;

    public static AttractionFragment newInstance(AttractiveType type) {
        Bundle args = new Bundle();
        args.putInt(TYPE, type.getValue());
        AttractionFragment fragment = new AttractionFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();
        if (arguments != null) {
            int type = arguments.getInt(TYPE);
            attrType = AttractiveType.valueOf(type);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.attraction_list, container, false);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new RecyclerAdapter(getData()));
        return recyclerView;
    }

    private ArrayList<Attraction> getData() {
        Context context = getContext();
        switch (attrType) {
            case TAB_1:
                return Data.getFirstList(context);
            case TAB_2:
                return Data.getSecondList(context);
            case TAB_3:
                return Data.getThirdList(context);
            case TAB_4:
                return Data.getFourthList(context);
        }
        return null;
    }


}
