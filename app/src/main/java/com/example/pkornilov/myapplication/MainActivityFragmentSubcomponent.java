package com.example.pkornilov.myapplication;

import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by p.kornilov on 13.12.2017.
 */
@Subcomponent//(modules = {APIModule.class,MainActivityFragmentSubcomponent.FragmentModule.class})
public interface MainActivityFragmentSubcomponent extends AndroidInjector<MainActivityFragment> {
/*
    @Module
    class FragmentModule {}

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivityFragment> {}*/
}
