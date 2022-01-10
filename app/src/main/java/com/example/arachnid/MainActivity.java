package com.example.arachnid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public NavigationView navigationView;

    //SearchView Search_View;
    //TextView searchViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        navigationView=findViewById(R.id.nav_view_id);
        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.nav_downloads:
                    Toast.makeText(MainActivity.this, "Downloads", Toast.LENGTH_SHORT).show();
                    return true;


                case R.id.nav_settings:
                    Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nav_updates:
                    Toast.makeText(MainActivity.this, "Update", Toast.LENGTH_SHORT).show();
                    return true;


                case R.id.nav_privacy_policy:
                    Toast.makeText(MainActivity.this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nav_Terms_conditions:
                    Toast.makeText(MainActivity.this, "terms and conditions", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nav_help:
                    Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.nav_contact_us:
                    Toast.makeText(MainActivity.this, "Contact Us ", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return true;
        });
        //actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        //drawerLayout.addDrawerListener(actionBarDrawerToggle);
        //actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // setNavigationViewListener();

    }


    //public boolean onOptionsItemSelected(@NonNull MenuItem item) {  // To Open 3 line icon for navigation

       // if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
          //  return true;
       // }
        //return super.onOptionsItemSelected(item);
   // }
    /**

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        Toast.makeText(getApplicationContext(), "Item id: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        //drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }


    private void setNavigationViewListener(){

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_id);
        navigationView.setNavigationItemSelectedListener(this);
    }

    */

}