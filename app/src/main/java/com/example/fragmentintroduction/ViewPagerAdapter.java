package com.example.fragmentintroduction;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    Fragment fragment=null;
    String stringTitle=null;

    public ViewPagerAdapter(@NonNull  FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            fragment=new RachitFragment();
        }if (position==1){
            fragment=new PujanFragment();
        }if (position==2){
            fragment=new YugFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        if (position==0){
            stringTitle="Rachit";
        }if (position==1){
            stringTitle="Pujan";
        }if (position==2){
            stringTitle="Yug";
        }
        return stringTitle;
    }
}
