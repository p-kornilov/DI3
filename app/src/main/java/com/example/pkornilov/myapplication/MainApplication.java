package com.example.pkornilov.myapplication;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by p.kornilov on 13.12.2017.
 */

public class MainApplication extends Application implements HasActivityInjector {
    private AppComponent appComponent;
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        //DaggerAppComponent.builder().application(this).build();
        DaggerAppComponent.builder().application(this).build().inject(this);
       // DaggerAppComponent.builder().build().inject(this);


      /*  appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this,"eee"))
                .build();*/
    //    component.inject(this);
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector(){
        return dispatchingAndroidInjector;
    }
}
