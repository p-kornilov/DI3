package com.example.pkornilov.myapplication;

import android.app.Application;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by p.kornilov on 13.12.2017.
 */

public class MainApplication extends Application implements HasSupportFragmentInjector {
    private AppComponent appComponent;
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);

      /*  appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this,"eee"))
                .build();*/
    //    component.inject(this);
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector(){
        return fragmentInjector;
    }
}
