/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trial;

/**
 *
 * @author VK
 */
import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch {
    
static int interval;
static Timer timer;

public static void main(String[] args) {
   
   // System.out.print("Input seconds => : ");
    int secs = 30;
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = secs;
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
            System.out.println(setInterval());
        }

   

        
    }, delay, period);
}

private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
}
}

