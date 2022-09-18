package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityAddToBasketReadyAppBarBinding;

public class AddToBasketReadyAppBar extends AppCompatActivity {

    ActivityAddToBasketReadyAppBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_add_to_basket_ready_app_bar);
        initAppBar();
    }

    private void initAppBar() {
        setSupportActionBar(binding.detailToolbar);
        assert getSupportActionBar()!=null;
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}