package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.util.Log;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityMainBinding;
import mo.atef.amit.daythree.daythree.models.Market;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMarket(new Market("5th Settlement",
                getResources().getDrawable(R.drawable.carrot),
                getResources().getDrawable(R.drawable.location),
                getResources().getDrawable(R.drawable.image)));
        Log.e("LifeCycle", "OnCreate is called!");
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
}