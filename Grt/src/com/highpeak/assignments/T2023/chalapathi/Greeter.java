package com.highpeak.assignments.T2023.chalapathi;

public class Greeter
{
    String name;

    public  Greeter(String name)
    {
        this.name=name;
    }
    public String sayHello()
    {
        return "Hello"+this.name;

    }
    public String goodBye()
    {
        return "GoodBye"+this.name;
    }
}
