package mo.atef.amit.daythree.daythree.views.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import mo.atef.amit.daythree.daythree.R;
import mo.atef.amit.daythree.daythree.databinding.FragmentExclusiveBinding;
import mo.atef.amit.daythree.daythree.oop.engines.Electricity;
import mo.atef.amit.daythree.daythree.oop.engines.Engine;
 /*
    Pillars of OOP
    - Inheritance
    - Encapsulation : Data Hiding
    - Polymorphism
    - Abstraction
     */
/*
        Object Oriented Programming illustration
        ----------------------------------------
        Electricity electricity=new Electricity();
        electricity.startEngine(5,8,"s","asdasdas");
        electricity.apply(5);
        electricity.returnResult(5);
        Engine engine=new Engine();
        engine.square();
        engine.calculate();
        Log.e( "Inherited","value: "+electricity.NumOfCylinders);
 */

public class ExclusiveOffer extends Fragment {

    FragmentExclusiveBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_exclusive,container,false);

//        binding.rvExclusive.setAdapter();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}