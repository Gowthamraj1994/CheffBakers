package com.example.gowtham.cheffbakers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgcity,imgoffers,imgweb;
    RelativeLayout relay_layoutoffer,relay_layoutcity,relay_layoutwebsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgcity = (ImageView) findViewById(R.id.img_city);
        imgoffers = (ImageView) findViewById(R.id.img_offer);
        imgweb = (ImageView) findViewById(R.id.img_world);
        relay_layoutoffer = (RelativeLayout) findViewById(R.id.offer_realtive);
        relay_layoutcity = (RelativeLayout) findViewById(R.id.city_realtive);
        relay_layoutwebsite = (RelativeLayout) findViewById(R.id.website_realtive);

    }
    public void onclick(View v){
        if(v==relay_layoutoffer || v==relay_layoutcity || v==relay_layoutwebsite){
            Intent intent=new Intent(this,Home.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
            return;
        }
        else{
            Toast.makeText(this,"Something Went Wrong",Toast.LENGTH_LONG).show();
            return;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
