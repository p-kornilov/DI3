package com.example.pkornilov.myapplication;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by p.kornilov on 13.12.2017.
 */

@FragmentScope
@Component(modules = APIModule.class)
public interface APIComponent {
    void inject(MainActivityFragment fragment);
/*
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivityFragment> {}
*/
}
