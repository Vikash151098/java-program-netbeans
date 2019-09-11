/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author VK
 */
public class ID3Reader {
    public static void main(String[] args) {
        File song=new File(args[0]);
        try(FileInputStream file=new FileInputStream(song))
        {
            int size=(int)song.length();
            file.skip(size-128);
            byte []last128=new byte[128];
            file.read(last128);
            String id3=new String(last128);
            String tag=id3.substring(0, 3);
            if(tag.equals("TAG"))
            {
                System.out.println("Title"+id3.substring(4, 33));
                System.out.println("Artist"+id3.substring(34, 62));
                System.out.println("Album"+id3.substring(63, 91));
                System.out.println("Year"+id3.substring(93, 97));
            }
            else
            {
                System.out.println(args[0]+"does not contains id3 info");
            }
            file.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    
}
