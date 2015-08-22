package com.example.gowtham.cheffbakers;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by gowtham on 22-08-2015.
 */
public class City extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    Toolbar mytoolbar;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavigationView navigationView;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.home_layout);

    }
}
