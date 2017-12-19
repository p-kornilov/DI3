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
/*    @Inject
    TestAPI api;*/
    private String text;

    @Inject
    public FragmentPresenter(TestAPI api){
     //   super();
       // this.api = api;
        text = api.getText();
    }

    public MutableLiveData<String> getData(){
        //data.setValue("Hello!");
        data.setValue(text);
        return data;
    }
}
