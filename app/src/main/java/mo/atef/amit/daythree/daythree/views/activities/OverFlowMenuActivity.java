package mo.atef.amit.daythree.daythree.views.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import mo.atef.amit.daythree.daythree.R;

public class OverFlowMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_flow_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.overflow_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.profile){
            Toast.makeText(getApplicationContext(), "Profile is selected!", Toast.LENGTH_LONG).show();
        }else if (item.getItemId()==R.id.settings){
            Toast.makeText(getApplicationContext(), "Settings is selected!", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}