package com.Trail;
public class UserTrail
{
    int value1;
    int value2;
    public UserTrail(int value1,int value2)
    {
        this.value1=value1;
        this.value2=value2;
        if (value1<0 &&value2<0)
        {
            throw new IllegalvalueException();
        }
    }
    public boolean show()
    {
       if (value1==0 || value2==0)
           return false;
       else if (value1 >0 || value2> 0)
           return true;
       else
        return false;
    }
}
