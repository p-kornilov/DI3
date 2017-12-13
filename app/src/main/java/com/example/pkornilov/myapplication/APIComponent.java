package com.example.pkornilov.myapplication;

import dagger.Subcomponent;

/**
 * Created by p.kornilov on 13.12.2017.
 */

@FragmentScope
@Subcomponent(modules = APIModule.class)
public interface APIComponent {
    void inject(MainActivityFragment fragment);
}
