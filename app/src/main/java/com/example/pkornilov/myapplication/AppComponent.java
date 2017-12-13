package com.example.pkornilov.myapplication;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by p.kornilov on 12.12.2017.
 */
@Singleton
@Component (modules = AppModule.class)
public interface AppComponent {
    Context context();
    APIComponent plusAPIComponent(APIModule apiModule);
}
