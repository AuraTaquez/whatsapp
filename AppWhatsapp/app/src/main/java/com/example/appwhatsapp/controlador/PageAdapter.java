package com.example.appwhatsapp.controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numTabs;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numTabs=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
switch (position){
    case 0:
        new camara();
    case 1:
        new chats();
    case 2:
        new estados();
    case 3:
        new llamadas();
    default:return null;
}
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
