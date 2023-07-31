package com.mycompany.person;

public class Person {

    public static void main(String[] args) 
    {
        Student a=new Student();
        Lecturer b=new Lecturer();
        a.setstdid(24822);
        a.setstdName("Thisas");
        a.setstdcourse("Cyber security");
        b.setlecid(1234);
        b.setlecName("ABC");
        b.setlecProgramme("JAVA");
        
        System.out.println("Student ID: "+a.getstdID());
        System.out.println("Student Name: "+a.getstdName());
        System.out.println("Student Course: "+a.getstdCourse());
        System.out.println("Lecturer ID: "+b.getlecID());
        System.out.println("Lecturer Name: "+b.getlecName());
        System.out.println("Lecturer Programme: "+b.getlecProgramme());
    }
}
