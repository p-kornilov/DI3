package com.example.pkornilov.myapplication;

import android.app.Application;

/**
 * Created by p.kornilov on 13.12.2017.
 */

public class MainApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this,"eee"))
                .build();
    //    component.inject(this);
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
