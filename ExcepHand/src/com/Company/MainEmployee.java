package com.Company;

import com.Company.Employee;

public class MainEmployee
{
    public static void main(String[] args)
    {
        Employee e=new Employee(123,"chalapathi","manager",4000,500);
        e.details();
        e.calculateHRA();
        e.getHra();
    }

}
