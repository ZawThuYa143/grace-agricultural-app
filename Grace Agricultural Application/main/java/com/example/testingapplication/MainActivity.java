package com.example.testingapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setTitle("Grace Agricultural Application");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new AimFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_aim);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_aim:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AimFragment()).commit();
                break;
            case R.id.nav_fruit:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FruitFragment()).commit();
                break;
            case R.id.nav_soil:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SoilFragment()).commit();
                break;
            case R.id.nav_kitchenfruit:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new KitchenVegi()).commit();
                break;
            case R.id.nav_flower:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Flower()).commit();
                break;
            case R.id.nav_mushroom:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Mushroom()).commit();
                break;
            case R.id.nav_disease:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Disease()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else{
        super.onBackPressed();
        }
    }
}