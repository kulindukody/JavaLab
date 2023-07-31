/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab04;
public class Employee 
{
    private String name;
    private int age;
    private double salary;
    
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAge (int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }
    
    public void setSalary(double s)
    {
        salary=s;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void test()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
}
