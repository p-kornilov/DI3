package com.example.pkornilov.myapplication.Presenter;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.pkornilov.myapplication.TestAPI;

import javax.inject.Inject;

/**
 * Created by Smile on 14.12.2017.
 */

public class FragmentPresenter extends ViewModel {
    private final MutableLiveData<String> data = new MutableLiveData<>();
    TestAPI api;

    @Inject
    public FragmentPresenter(TestAPI api){
     //   super();
        this.api = api;
    }

    public MutableLiveData<String> getData(){
        //data.setValue("Hello!");
        data.setValue(api.getText());
        return data;
    }
}
