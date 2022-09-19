package mo.atef.amit.daythree.daythree.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mo.atef.amit.daythree.daythree.R;

public class MarketFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.market_fragment, container, false);

        return rootView;
    }

    public static MarketFragment newInstance(Context applicationContext) {
        return new MarketFragment();
    }
}
