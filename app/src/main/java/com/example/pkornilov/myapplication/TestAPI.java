package com.example.pkornilov.myapplication;

import javax.inject.Inject;

/**
 * Created by p.kornilov on 12.12.2017.
 */

public class TestAPI {
    private String text;

    public  TestAPI(){
        text = "Test test";
    }

    public String getText(){
        return text;
    }
}
;