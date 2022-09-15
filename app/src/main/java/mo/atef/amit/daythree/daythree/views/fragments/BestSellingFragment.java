package mo.atef.amit.daythree.daythree.views.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import mo.atef.amit.daythree.daythree.oop.engines.Electricity;
import mo.atef.amit.daythree.daythree.oop.engines.Engine;

public class BestSellingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Electricity electricity=new Electricity();

        electricity.startEngine(5,8,"s","asdasdas");
        electricity.apply(5);
        electricity.returnResult(5);

        Engine engine=new Engine();
        engine.square();

        engine.calculate();



        Log.e( "Inherited","value: "+electricity.NumOfCylinders);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /*
    Pillars of OOP
    - Inheritance
    - Encapsulation : Data Hiding
    - Polymorphism
    - Abstraction
     */


}
