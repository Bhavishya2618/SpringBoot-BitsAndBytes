package com.bitsnbytes.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    private MyComponent myComponent;

    @Autowired //This annotation is used to automatically inject dependency for multi-arguments
    public MyApp(MyComponent myComponent){ //injecting dependency through constructor
        this.myComponent = myComponent;
    }
    public void run(){
        System.out.println("This message is from Run Method of MyApp");
        myComponent.getMessage();
    }
}
