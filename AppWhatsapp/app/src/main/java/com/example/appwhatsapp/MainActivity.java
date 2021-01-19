package com.example.appwhatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.appwhatsapp.controlador.PageAdapter;
import com.example.appwhatsapp.controlador.chats;
import com.example.appwhatsapp.controlador.estados;
import com.example.appwhatsapp.controlador.llamadas;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewpager;
    PageAdapter pagerAdapter;
    TabItem Ti1,Ti2,Ti3,Ti4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        Ti1= findViewById(R.id.tb0);
        Ti2= findViewById(R.id.tb1);
        Ti3= findViewById(R.id.tb2);
        Ti4= findViewById(R.id.tb3);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
       // pagerAdapter = new PageAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        //viewpager.setAdapter(pagerAdapter);
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
              if(tab.getPosition()==0) {
                  pagerAdapter.notifyDataSetChanged();
              }
                if(tab.getPosition()==1) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==2) {
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==3) {
                    pagerAdapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menutoolbar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chats:
                Toast.makeText(this.getApplicationContext(),"Buscar ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.miseetiong:
                Toast.makeText(this.getApplicationContext(),"Opciones " ,Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onClick(View view) {
        Intent mms = new Intent(MainActivity.this,sms.class);
        startActivity(mms);
    }

}