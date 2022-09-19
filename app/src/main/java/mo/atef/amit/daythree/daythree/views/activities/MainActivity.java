package mo.atef.amit.daythree.daythree.views.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityMainBinding;
import mo.atef.amit.daythree.daythree.models.Market;
import mo.atef.amit.daythree.daythree.views.dialogues.MyDialogue;

/*
1.enable AppBarLayout disable ActionBar
2.Overflow icon and menu
3.BottomNavigationView






Dialogue
DataTimePicker Dialogue
FragmentDialogue

 */

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private boolean isLargeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMarket(new Market("5th Settlement",
                getResources().getDrawable(R.drawable.carrot),
                getResources().getDrawable(R.drawable.location),
                getResources().getDrawable(R.drawable.image)));
        Log.e("LifeCycle", "OnCreate is called!");

        binding.editTextSearchBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // send explicit intent
                Intent searchIntent=new Intent(MainActivity.this, SearchActivity.class);

                // send data using bundle
                Bundle bundle = new Bundle();
                bundle.putString("name","mohamed atef");
                bundle.putInt("age",29);
                bundle.putBoolean("tall",true);
                searchIntent.putExtras(bundle);
                startActivity(searchIntent);
            }
        });

        binding.storeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialogFragment();
//                Log.e("Clicke","Clicked ME");
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(android.R.id.content, MyDialogue.newInstance(
//                                getApplicationContext()
//                        ))
//                        .commit();
            }
        });

        binding.carrotImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycle", "OnStart is called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycle", "OnResume is called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle", "OnPause is called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifeCycle", "OnStop is called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycle", "OnDestroy is called!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(getApplicationContext(), "Settings is selected!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.profile:
                Toast.makeText(getApplicationContext(), "Profile is selected!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void displayDialogFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MyDialogue newFragment = new MyDialogue(getApplicationContext(), MainActivity.this);
        isLargeLayout = getResources().getBoolean(R.bool.large_layout);
        if (isLargeLayout) {
            newFragment.show(fragmentManager, "MemberDialog");
        } else {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            transaction.add(android.R.id.content, newFragment,"MemberDialog")
                    .addToBackStack(null).commit();
        }
    }
}