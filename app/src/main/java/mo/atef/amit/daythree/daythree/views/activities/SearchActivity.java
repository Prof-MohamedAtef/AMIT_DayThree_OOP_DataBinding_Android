package mo.atef.amit.daythree.daythree.views.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {

    ActivitySearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_search);

        Intent intent= getIntent();
        if (intent!=null) {
            Bundle bundle = intent.getExtras();
            String name = bundle.getString("name");
            Integer age = bundle.getInt("age");
            Boolean tall = bundle.getBoolean("tall");
            binding.tvDisplayIntent.setText(name + "\n" + age + "\n" + tall);
        }
    }
}