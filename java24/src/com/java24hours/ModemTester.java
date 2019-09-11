package com.java24hours;

public class ModemTester
{
    public static void main(String[] args) {
        CableModem  c=new CableModem();
        DslModem d=new DslModem();
        c.speed = 500000;
        d.speed=400000;
        System.out.println("trying the cable modem");
        c.displayspeed();
        c.connect();
        System.out.println("trying the Dsl modem");
        d.displayspeed();
        d.connect();
        
    }
}