package com.highpeak.assignments.t2023.chalapathi;

public class Greeter {
    String name;
    public  Greeter(String name)
    {
         this.name=name;
    }
    public  String sayHello()
    {
        return "Hello message"+this.name;
    }
    public String sayGoodye()
    {
        return "Good bye"+this.name;
    }
}