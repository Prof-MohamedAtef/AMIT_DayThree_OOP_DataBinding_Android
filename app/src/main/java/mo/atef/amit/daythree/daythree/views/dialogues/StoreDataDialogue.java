package mo.atef.amit.daythree.daythree.views.dialogues;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.StoreDataBindingBinding;
import mo.atef.amit.daythree.daythree.views.activities.MainActivity;

public class StoreDataDialogue extends DialogFragment {


    StoreDataBindingBinding binding;

    private final Context mContext;
    private final MainActivity mActivity;

    public StoreDataDialogue(Context context, MainActivity activity) {
        this.mContext =context;
        this.mActivity =activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.RatingDialog2);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.store_data_binding,container,false);
        binding.btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked No", Toast.LENGTH_SHORT).show();
                Log.e("StoreDialogue", "No");
                dismiss();
            }
        });

        binding.btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked Yes", Toast.LENGTH_SHORT).show();
                Log.e("StoreDialogue", "Yes");
            }
        });
        return binding.getRoot();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }
}