package com.mycompany.person;

public class Student extends Person
{
    private int stdID;
    private String stdName;
    private String stdCourse;
    
    public void setstdid(int id)
    {
        stdID=id;
    }
    public int getstdID()
    {
        return stdID;
    }
    
    public void setstdName(String sn)
    {
        stdName=sn;
    }
    public String getstdName()
    {
        return stdName;
    }
    
    public void setstdcourse(String sd)
    {
        stdCourse=sd;
    }
    public String getstdCourse()
    {
        return stdCourse; 
    }
}
