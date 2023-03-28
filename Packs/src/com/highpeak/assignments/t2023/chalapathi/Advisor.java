package com.highpeak.assignments.t2023.chalapathi;

import java.util.Random;
public class Advisor
{

    String[] msg;


    public void advisor(String[] msg)
    {
        this.msg=msg;
    }
    public String getAdvice()
    {
        Random rd=new Random();
        int red=rd.nextInt(4);

        return msg[red];
    }
}
