package com.blogspot.przybyszd.guicetutorial.providerinmodule;

public class Quiz {
    private boolean initialized = false;

    public boolean initialized(){
        return initialized;
    }

    public void init(){
        initialized = true;
    }
}
