/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trial;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 *
 * @author VK
 */
public class date {
    
    public date()
    {
        LocalDateTime now=LocalDateTime.now();
        int day=now.get(ChronoField.DAY_OF_MONTH);
        int month=now.get(ChronoField.MONTH_OF_YEAR);
        int year=now.get(ChronoField.YEAR);
        System.out.print(day+" ");
        System.out.print(month+" ");
        System.out.print(year+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        new date();
    }
}
