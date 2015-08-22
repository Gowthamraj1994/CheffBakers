package com.example.gowtham.cheffbakers;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by gowtham on 22-08-2015.
 */
public class Home extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    Toolbar mytoolbar;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offers_layout);
        mytoolbar=(Toolbar)findViewById(R.id.toolbar);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nvView);
        setSupportActionBar(mytoolbar);
        mytoolbar.setTitleTextColor(0xFFFFFFFF);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.home);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.flContent,new Offers()).commit();
        }
navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Fragment fragment = null;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.commit();
        if (menuItem.isChecked())
            menuItem.setChecked(false);
        else menuItem.setChecked(true);
        drawerLayout.closeDrawers();
        switch (menuItem.getItemId()) {

            case R.id.offer_frg:
                fragment = new Offers();
                transaction.replace(R.id.flContent, fragment);

        }
        return true;
    }
});
mDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,mytoolbar,R.string.drawer_open,R.string.drawer_close){

    public void onDraweropened(View drawerview){

    }
    public void onDrawerClosed(View view){

    }
};
        drawerLayout.setDrawerListener(mDrawerToggle);
    }
}
