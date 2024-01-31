package com.driver;



public class Main
{
    public class A
    {
        public String meth()
        {
            return "Invoking method from class A";
        }
    }
    public static void main(String[] args)
    {
        B obj=new B();
        System.out.println(obj.meth());

    }
}
