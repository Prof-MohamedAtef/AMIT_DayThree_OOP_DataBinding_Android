package mo.atef.amit.daythree.daythree.views.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.views.dialogues.MyDialogue;
import mo.atef.amit.daythree.daythree.views.fragments.MarketFragment;
import mo.atef.amit.daythree.daythree.views.fragments.ProfileFragment;
import mo.atef.amit.daythree.daythree.views.fragments.SettingsFragment;

public class BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        // findViewById
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //catch interface in my activity
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // set default selected fragment
        bottomNavigationView.setSelectedItemId(R.id.person);
    }


    /*
    implemented function vy BottomNavigation interface
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.person:
                // fragment transaction
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, ProfileFragment.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.home:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, MarketFragment.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;

            case R.id.settings:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, SettingsFragment.newInstance(
                                getApplicationContext()
                        ))
                        .commit();
                return true;
        }
        return false;
    }
}