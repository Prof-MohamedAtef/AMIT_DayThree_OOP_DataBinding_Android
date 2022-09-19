package mo.atef.amit.daythree.daythree.views.dialogues;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialogueBuilder extends DialogFragment {

    OnDialogueBuilderUserResponse dialogueBuilderUserResponse;
    String location="Al-Fayoum City, Fayoum Governorate, Egypt";

    public static MyDialogueBuilder newInstance() {
        MyDialogueBuilder frag = new MyDialogueBuilder();
        return frag;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogueBuilderUserResponse= (OnDialogueBuilderUserResponse) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Runner Details");
        alertDialog.setMessage(location);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogueBuilderUserResponse.onYesSelected(location);
            }
        });
        alertDialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogueBuilderUserResponse.onNoSelected(-1);
            }
        });
        Log.e("onCreateDialogue","Called Me");
        return alertDialog.create();
    }


    public interface OnDialogueBuilderUserResponse{
        public void onYesSelected(String location);
        public int onNoSelected(int value);
    }
}