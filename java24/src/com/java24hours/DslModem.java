package com.java24hours;
public class DslModem extends Modem
{
    String method="Dsl phone connection";
    
    public void connect()
    {
        System.out.println("conneting to the internet......");
        System.out.println("using a"+method);
    }
}