package com.example.pkornilov.myapplication;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * Created by p.kornilov on 12.12.2017.
 */
@Singleton
@Component (modules = {AppComponent.AppModule.class, BindingModule.class,AndroidInjectionModule.class})
public interface AppComponent {

    void inject(MainApplication application);
    //APIComponent plusAPIComponent(APIModule apiModule);

    @Module
    class AppModule{}
}
