package mo.atef.amit.daythree.daythree.views.dialogues;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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

    private final MainActivity mActivity;
    private final Context mContext;
    MyDialogueBinding binding;
    private MyDialogue addFamilyMemberDialogListener;

    public MyDialogue(Context applicationContext, MainActivity mainActivity) {
        this.mContext=applicationContext;
        this.mActivity=mainActivity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Config.isDialogueRunning=false;
        Config.ListenerKEY="";
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Config.isDialogueRunning=false;
        Config.ListenerKEY="";
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        Config.isDialogueRunning=false;
        Config.ListenerKEY="";
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE,R.style.RatingDialog2);
        Config.isDialogueRunning=true;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.my_dialogue,container,false);

        return binding.getRoot();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
//        try {
//            // Instantiate the NoticeDialogListener so we can send events to the host
//            addFamilyMemberDialogListener= (MyDialogue) context;
//        } catch (ClassCastException e) {
//            // The activity doesn't implement the interface, throw exception
//            throw new ClassCastException(mActivity.toString()
//                    + " must implement NoticeDialogListener");
//        }
    }

}
