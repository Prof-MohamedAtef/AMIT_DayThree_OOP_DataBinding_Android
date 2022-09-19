package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityAppBarActivtyBinding;

public class AppBarActivty extends AppCompatActivity {

    ActivityAppBarActivtyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_app_bar_activty);
        initAppBar();
    }

    private void initAppBar() {
        setSupportActionBar(binding.detailToolbar);
        assert getSupportActionBar()!=null;
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}