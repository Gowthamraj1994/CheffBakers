package com.example.gowtham.cheffbakers;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by gowtham on 22-08-2015.
 */
public class Offers extends Fragment {

ListView listview;
    public static int [] prgmImages={R.drawable.cake1,R.drawable.cake2,R.drawable.cake3,R.drawable.cake2,R.drawable.cake1,
            R.drawable.cake3,R.drawable.cake1,R.drawable.cake2,R.drawable.cake3};
Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        context=getActivity();
        View view=inflater.inflate(R.layout.listoffer_items,container,false);
        listview=(ListView)view.findViewById(R.id.list_data);
        AdapterOffers adpater=new AdapterOffers(context,prgmImages);
        listview.setAdapter(adpater);
        return view;
    }
}
