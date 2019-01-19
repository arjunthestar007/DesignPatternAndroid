package com.example.arjun.designpatternandroid;

import com.example.arjun.designpatternandroid.bread.Bread;
import com.example.arjun.designpatternandroid.Filling.Filling;

public abstract class AbstractFactory  {

    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filing);

}
