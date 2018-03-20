package com.alextroy.tourguidealextroy.model;

import android.content.Context;

import com.alextroy.tourguidealextroy.R;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Attraction> getFirstList(Context context) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction(
                context.getString(R.string.saint_petersburg),
                (float) 5.0,
                R.drawable.sp,
                context.getString(R.string.sp_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.the_louvre),
                (float) 4.0,
                R.drawable.louvre,
                context.getString(R.string.tl_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.colosseum),
                (float) 4.6,
                R.drawable.colosseum,
                context.getString(R.string.colosseum_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.taj_mahal),
                (float) 4.5,
                R.drawable.tajmahal,
                context.getString(R.string.taj_mahal_description)));

        return attractionList;
    }

    public static ArrayList<Attraction> getSecondList(Context context) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction(
                context.getString(R.string.holi),
                (float) 5.0,
                R.drawable.holi,
                context.getString(R.string.holi_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.songkran),
                (float) 4.0,
                R.drawable.songkran,
                context.getString(R.string.songkran_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.holi),
                (float) 5.0,
                R.drawable.holi,
                context.getString(R.string.holi_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.songkran),
                (float) 4.0,
                R.drawable.songkran,
                context.getString(R.string.songkran_description)));

        return attractionList;
    }

    public static ArrayList<Attraction> getThirdList(Context context) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction(
                context.getString(R.string.mcdonalds),
                (float) 5.0,
                R.drawable.mcdonald,
                context.getString(R.string.mcdonalds_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.kfc),
                (float) 5.0,
                R.drawable.kfc,
                context.getString(R.string.kfc_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.pizza_hut),
                (float) 5.0,
                R.drawable.pizzahut,
                context.getString(R.string.pizza_hut_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.kfc),
                (float) 5.0,
                R.drawable.kfc,
                context.getString(R.string.kfc_description)));

        return attractionList;
    }

    public static ArrayList<Attraction> getFourthList(Context context) {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction(
                context.getString(R.string.starbucks),
                (float) 5.0,
                R.drawable.starbucks,
                context.getString(R.string.starbucks_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.bradleys_spanish_bar),
                (float) 4.0,
                R.drawable.bradleys_spanish_bar,
                context.getString(R.string.bradleys_spanish_bar_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.starbucks),
                (float) 5.0,
                R.drawable.starbucks,
                context.getString(R.string.starbucks_description)));

        attractionList.add(new Attraction(
                context.getString(R.string.bradleys_spanish_bar),
                (float) 4.0,
                R.drawable.bradleys_spanish_bar,
                context.getString(R.string.bradleys_spanish_bar_description)));

        return attractionList;
    }
}
