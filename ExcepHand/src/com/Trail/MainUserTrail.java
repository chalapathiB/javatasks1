package com.Trail;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MainUserTrail
{
    public static void main(String[] args)
    {

        UserTrail usr=new UserTrail(2,9);
        boolean br=usr.show();
        System.out.println(br);
    }
}
