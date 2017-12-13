package com.example.pkornilov.myapplication;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by p.kornilov on 12.12.2017.
 */

@Module//(subcomponents = APIComponent.class)
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

/*    @Binds
    @IntoMap
    @FragmentKey()*/
}
