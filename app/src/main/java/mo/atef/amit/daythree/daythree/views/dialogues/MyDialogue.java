package mo.atef.amit.daythree.daythree.views.dialogues;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.MyDialogueBinding;
import mo.atef.amit.daythree.daythree.util.Config;
import mo.atef.amit.daythree.daythree.views.activities.MainActivity;

public class MyDialogue extends DialogFragment {

    public static MyDialogue newInstance() {
        MyDialogue frag = new MyDialogue();
        return frag;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Runner Details");
        alertDialog.setMessage("Enter Your Details ... .... bla bla bla ... ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        Log.e("onCreateDialogue","Called Me");
        return alertDialog.create();
    }
}