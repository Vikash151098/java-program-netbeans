/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.io.IOException;
import java.net.URISyntaxException;
import sun.net.www.http.HttpClient;


/**
 *
 * @author VK
 */
public class ServerCheck {
    public ServerCheck() throws InterruptedException
    {
        String []sites={
        "https://www.apple.com",
          "https://www.microsoft.com",
        "http://www.compaq.com",
        "http://www.hp.com",
        "https://www.oracle.com",
        "http://www.informit.com"
        };
        try
        {
            load(sites);
        }
        catch(URISyntaxException oops)
        {
            System.out.println("bad URI:"+oops.getMessage());
        }
        catch(IOException oops)
        {
            System.out.println("Error:"+oops.getMessage());
        }
       
    }
     public void load(String[] sites) throws URISyntaxException,IOException,InterruptedException
        {
            for(String site:sites)
            {
                System.out.println("\nsite:"+site);
                //creat the web client
               // HttpClient browser=HttpClient.
                
            }
        }
    
}
