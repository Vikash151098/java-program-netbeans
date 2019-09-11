package com.trial;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Calculators {

    //instance variables
    JFrame frame;
    JPanel mainPanel, northPanel, southPanel;
    JTextField numberLabel;
    JButton backspace, multiply, divide, add, subtract, equal; //four function buttons
    JButton one, two, three, four, five, six, seven, eight, nine, zero; //number buttons
    JButton posOrNeg, decimal, leftParenthese, rightParenthese;
    

    //constructor
    public Calculators()
    {
        //create it
       
        frame = new JFrame();
        mainPanel = new JPanel(); //contains both panels
        mainPanel.setForeground(Color.BLACK);
        mainPanel.setBackground(Color.DARK_GRAY);
        northPanel = new JPanel(new BorderLayout()); //contains the number label in border layout
        southPanel = new JPanel(new GridLayout(5, 4)); //contains the buttons in border layout
        numberLabel = new JTextField(37); //*************************
        backspace = new JButton();
        backspace.setForeground(Color.WHITE);
        backspace.setBackground(Color.GRAY);
        multiply = new JButton();
        multiply.setForeground(Color.WHITE);
        multiply.setBackground(Color.MAGENTA);
        divide = new JButton();
        divide.setForeground(Color.WHITE);
        divide.setBackground(Color.PINK);
        add = new JButton();
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLUE);
        subtract = new JButton();
        subtract.setForeground(Color.WHITE);
        subtract.setBackground(Color.RED);
        equal = new JButton();
        equal.setForeground(Color.WHITE);
        equal.setBackground(Color.ORANGE);
        zero = new JButton();
        zero.setForeground(Color.DARK_GRAY);
        zero.setBackground(Color.GREEN);
        one = new JButton();
        one.setForeground(Color.DARK_GRAY);
        one.setBackground(Color.GREEN);
        two = new JButton();
        two.setForeground(Color.DARK_GRAY);
        two.setBackground(Color.GREEN);
        three = new JButton();
        three.setForeground(Color.DARK_GRAY);
        three.setBackground(Color.GREEN);
        four = new JButton();
        four.setForeground(Color.DARK_GRAY);
        four.setBackground(Color.GREEN);
        five = new JButton();
        five.setForeground(Color.DARK_GRAY);
        five.setBackground(Color.GREEN);
        six = new JButton();
        six.setForeground(Color.DARK_GRAY);
        six.setBackground(Color.GREEN);
        seven = new JButton();
        seven.setForeground(Color.DARK_GRAY);
        seven.setBackground(Color.GREEN);
        eight = new JButton();
        eight.setForeground(Color.DARK_GRAY);
        eight.setBackground(Color.GREEN);
        nine = new JButton();
        nine.setForeground(Color.DARK_GRAY);
        nine.setBackground(Color.GREEN);
        posOrNeg = new JButton();
        posOrNeg.setForeground(Color.WHITE);
        posOrNeg.setBackground(Color.LIGHT_GRAY);
        decimal = new JButton();
        decimal.setForeground(Color.WHITE);
        decimal.setBackground(Color.CYAN);
        leftParenthese = new JButton();

        rightParenthese = new JButton();

        //configure it
        frame.setTitle("My Calculator");
        frame.setSize(450, 225);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //buttons
        backspace.setText("Back Space");
        leftParenthese.setText("(");
        rightParenthese.setText(")");
        multiply.setText("x");
        divide.setText("/");
        add.setText("+");
        subtract.setText("-");
        equal.setText("=");
        zero.setText("0");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        posOrNeg.setText("+/-");
        decimal.setText(".");

        //add it
        northPanel.add(numberLabel, BorderLayout.NORTH);
        southPanel.add(backspace);
        southPanel.add(leftParenthese);
        southPanel.add(rightParenthese);
        southPanel.add(multiply);
        southPanel.add(seven);
        southPanel.add(eight);
        southPanel.add(nine);
        southPanel.add(divide);
        southPanel.add(four);
        southPanel.add(five);
        southPanel.add(six);
        southPanel.add(add);
        southPanel.add(one);
        southPanel.add(two);
        southPanel.add(three);
        southPanel.add(subtract);
        southPanel.add(zero);
        southPanel.add(decimal);
        southPanel.add(posOrNeg);
        southPanel.add(equal);
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        frame.add(mainPanel);

        //add listener
        one.addActionListener(new ButtonListener());
        two.addActionListener(new ButtonListener());
        three.addActionListener(new ButtonListener());
        four.addActionListener(new ButtonListener());
        five.addActionListener(new ButtonListener());
        six.addActionListener(new ButtonListener());
        seven.addActionListener(new ButtonListener());
        eight.addActionListener(new ButtonListener());
        nine.addActionListener(new ButtonListener());
        zero.addActionListener(new ButtonListener());
        multiply.addActionListener(new ButtonListener());
        divide.addActionListener(new ButtonListener());
        add.addActionListener(new ButtonListener());
        subtract.addActionListener(new ButtonListener());
        equal.addActionListener(new ButtonListener());
        posOrNeg.addActionListener(new ButtonListener());
        decimal.addActionListener(new ButtonListener());
        backspace.addActionListener(new ButtonListener());
        leftParenthese.addActionListener(new ButtonListener());
        rightParenthese.addActionListener(new ButtonListener());

    }

    //define action listener
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == one)
            {

            }
            if(e.getSource() == two)
            {

            }
            if(e.getSource() == three)
            {

            }
            if(e.getSource() == four)
            {

            }
            if(e.getSource() == five)
            {

            }
            if(e.getSource() == six)
            {

            }
            if(e.getSource() == seven)
            {

            }
            if(e.getSource() == eight)
            {

            }
            if(e.getSource() == nine)
            {

            }
            if(e.getSource() == zero)
            {

            }
            if(e.getSource() == multiply)
            {

            }
            if(e.getSource() == divide)
            {

            }
            if(e.getSource() == add)
            {

            }
            if(e.getSource() == subtract)
            {

            }
            if(e.getSource() == equal)
            {

            }
            if(e.getSource() == posOrNeg)
            {

            }
            if(e.getSource() == decimal)
            {

            }
            if(e.getSource() == backspace)
            {

            }
            if(e.getSource() == leftParenthese)
            {

            }
            if(e.getSource() == rightParenthese)
            {

            }
        }
    }   
    public static void main(String[] args) {
        new Calculators();
    }
}