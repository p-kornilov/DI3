package com.example.pkornilov.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by p.kornilov on 13.12.2017.
 */

@Module
public class APIModule {

    @Provides
    @FragmentScope
    public TestAPI provideAPI() {
        return new TestAPI();
    }
}
