package com.alextroy.tourguidealextroy.model;

import android.content.Context;

import com.alextroy.tourguidealextroy.R;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Attraction> getFirstList(Context c) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            attractionList.add(new Attraction(
                    c.getString(R.string.oh_name)
                            + " " + i,
                    (float) 1.0,
                    R.drawable.opera_house));
        }
        return attractionList;
    }

    public static ArrayList<Attraction> getSecondList(Context c) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            attractionList.add(new Attraction(
                    c.getString(R.string.rbg_name)
                            + " " + i,
                    (float) 2.0,
                    R.drawable.opera_house));
        }

        return attractionList;
    }

    public static ArrayList<Attraction> getThirdList(Context c) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            attractionList.add(new Attraction(
                    c.getString(R.string.bm_name)
                            + " " + i,
                    (float) 3.0,
                    R.drawable.opera_house));
        }

        return attractionList;
    }

    public static ArrayList<Attraction> getFourthList(Context c) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            attractionList.add(new Attraction(
                    c.getString(R.string.mb_name)
                            + " " + i,
                    (float) 4.0,
                    R.drawable.opera_house));
        }

        return attractionList;
    }
}
