package mo.atef.amit.daythree.daythree.views.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.views.fragments.MarketFragment;
import mo.atef.amit.daythree.daythree.views.fragments.ProfileFragment;
import mo.atef.amit.daythree.daythree.views.fragments.SettingsFragment;

public class BottomNavigationView extends AppCompatActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {

    com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.person);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.person:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.farmeLayout, ProfileFragment.newInstance(getApplicationContext())).commit();
                return true;
            case R.id.home:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.farmeLayout, MarketFragment.newInstance(getApplicationContext())).commit();
                return true;
            case R.id.settings:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.farmeLayout, SettingsFragment.newInstance(getApplicationContext())).commit();
                return true;
        }
        return false;
    }
}