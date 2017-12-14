package com.example.pkornilov.myapplication;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pkornilov.myapplication.Presenter.FragmentPresenter;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
/*    @Inject
    TestAPI api;*/
    @Inject
    ViewModelProvider.Factory viewModelFactory;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        final TextView tv = v.findViewById(R.id.text);
       // AndroidInjection.inject(this);
    //    AndroidSupportInjection.inject(this);
/*        AppComponent component = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();*/
     //   AppComponent component = DaggerAppComponent.create();
     //   component.inject(this);

    //    DaggerAPIComponent.builder().aPIModule(new APIModule()).build().inject(this);
//        ((MainApplication) getActivity().getApplicationContext()).getAppComponent().plusAPIComponent(new APIModule()).inject(this);
        FragmentPresenter model = ViewModelProviders.of(getActivity(),viewModelFactory).get(FragmentPresenter.class);
        model.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tv.setText(s);
            }
        });
        //tv.setText(api.getText());
        return v;
    }

}
