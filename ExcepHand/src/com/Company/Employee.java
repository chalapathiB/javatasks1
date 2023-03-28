package com.Company;

public class Employee
{
    int empid;
    String empname;
    String designation;
    double basic;
    private double hra;
    public Employee(int empid,String empname,String designation,double basic,int price)
    {
        this.empid=empid;
        this.empname=empname;
        this.designation=designation;
        this.basic=basic;
        if (basic<500)
            throw new LowSalException();
    }
    public void  details()
    {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(designation);
        System.out.println(basic);
    }
    public void calculateHRA()
    {
        if (designation.equalsIgnoreCase("Manager"))
        {
            hra=(basic*0.1)+basic;
        } else if (designation.equalsIgnoreCase("Officer")) 
        {
            hra=(basic*0.12)+basic;
        } else if (designation.equalsIgnoreCase("Clerk"))
        {
            hra=(basic*0.5)+basic;
        }
        else
        {
            System.out.println("invalid");
        }
    }
    public double getHra()
    {
        return hra;
    }
}