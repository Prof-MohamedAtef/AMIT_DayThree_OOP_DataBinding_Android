package mo.atef.amit.daythree.daythree.views.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.ActivityAddToBasketReadyAppBarBinding;

public class AddToBasketReadyAppBar extends AppCompatActivity {

    /*
    Intent Types:
    1. Implicit Intent
        Phone sent on Facebook messenger
            Press Phone - > Open Activity for making a call
        Location sent on Whatsapp
            Press Phone -> Uber or Google Maps
    2. Explicit Intent
        Send Data from
            MainActivity to AddToBasketReadyAppBar
     */
    private static final int SELECT_PICTURE = 1;
    ActivityAddToBasketReadyAppBarBinding binding;
    private String selectedImagePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // data binding object to inflate layout
        binding= DataBindingUtil.setContentView(this, R.layout.activity_add_to_basket_ready_app_bar);

        /*
        init app bar method
        to setup a custom appBar
         */

        initAppBar();

        binding.uploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("OnClick", "Open Dialogue");
//                openGallery();
            }
        });
    }

//    private void openGallery() {
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivityForResult(Intent.createChooser(intent,"Select Picture"), SELECT_PICTURE);
//    }

    private void initAppBar() {
        setSupportActionBar(binding.detailToolbar);
        assert getSupportActionBar()!=null;
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK) {
//            if (requestCode == SELECT_PICTURE) {
//                Uri selectedImageUri = data.getData();
//                selectedImagePath = getPath(selectedImageUri);
//                System.out.println("Image Path : " + selectedImagePath);
//                binding.coverImage.setImageURI(selectedImageUri);
//            }
//        }
//    }

//    public String getPath(Uri uri) {
//        String[] projection = { MediaStore.Images.Media.DATA };
//        Cursor cursor = managedQuery(uri, projection, null, null, null);
//        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//        cursor.moveToFirst();
//        return cursor.getString(column_index);
//    }
}