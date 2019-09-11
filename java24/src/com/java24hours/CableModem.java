package com.java24hours;
public class CableModem extends Modem
{
  String method="cable connection";

public void connect()
{
    System.out.println("connecting to the internet.......");
    System.out.println("using a"+method);
}
}