package com.example.pkornilov.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    @Inject
    TestAPI api;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        TextView tv = v.findViewById(R.id.text);
/*        AppComponent component = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();*/
     //   AppComponent component = DaggerAppComponent.create();
     //   component.inject(this);

        ((MainApplication) getActivity().getApplicationContext()).getAppComponent().plusAPIComponent(new APIModule()).inject(this);
        tv.setText(api.getText());
        return v;
    }
}
