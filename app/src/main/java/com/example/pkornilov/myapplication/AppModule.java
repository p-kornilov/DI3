package com.example.pkornilov.myapplication;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by p.kornilov on 12.12.2017.
 */

@Module
public class AppModule {
    private Context context;
    private String te;

    public AppModule(Context context, String te) {
        this.context = context;
        this.te = te;
    }

    @Provides
    public Context provideContext() {
        return context;
    }
}
