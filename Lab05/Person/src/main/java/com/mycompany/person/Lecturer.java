package com.mycompany.person;

public class Lecturer extends Person
{
    private int lecID;
    private String lecName;
    private String lecProgramme;
    
    public void setlecid(int id)
    {
        lecID=id;
    }
    public int getlecID()
    {
        return lecID;
    }
    
    public void setlecName(String ln)
    {
        lecName=ln;
    }
    public String getlecName()
    {
        return lecName;
    }
    
    public void setlecProgramme(String ld)
    {
        lecProgramme=ld;
    }
    public String getlecProgramme()
    {
        return lecProgramme; 
    }
}
