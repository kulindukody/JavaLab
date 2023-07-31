/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab05;

public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setempID(int id)
    {
        empID=id;
    }
    public int getempID()
    {
        return empID;
    }
    
    public void setempName(String en)
    {
        empName=en;
    }
    public String getempName()
    {
        return empName;
    }
    
    public void setempDesignation(String ed)
    {
        empDesignation=ed;
    }
    public String getempDesignation()
    {
        return empDesignation; 
    }
}
