package com.example.pkornilov.myapplication;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by p.kornilov on 12.12.2017.
 */
@Singleton
public class TestAPI {
    private String text;

    @Inject
    public  TestAPI(){
        text = "Test test";
    }

    public String getText(){
        return text;
    }
}
;