package com.highpeak.assignments.T2023.chalapathi;
import java.util.Random;
public class Advisor
{
    String[] msg;
    public Advisor(String[] msg)
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
