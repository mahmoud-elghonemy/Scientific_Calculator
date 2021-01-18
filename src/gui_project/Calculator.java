package gui_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculator {
    
    //Containers...
    //Creating "JFrame" Object...
    JFrame f1;
    //Creating "JPanel" Objects...
    JPanel p, p1, p2, p3;
    //MenuBar for Menus...
    //Creating "JMenuBar" Object...
    JMenuBar mb1;
    //Menus Components...
    //Creating "JMenu" Objects...
    JMenu m1, m2;
    //MenuItems For Each Menu...
    JMenuItem mi1, mi2, mi3, mi4;
    //TextField For Display...
    //Creating "JTextField" Object...
    JTextField tf1;
    //Buttons For The Numbers and Operations...
    //Creating "JButton" Objects...
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, 
            b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, 
            b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45;
    //CheckBox For Scientific Part To Make That Part Appear If It's Checked...
    //Creating "JCheckBox" Object...
    JCheckBox c1;
    
    //Creating "Events" Object...
    Events e1 = new Events();
    
    public Calculator() {
        //Initialization For Containers...
        f1 = new JFrame();
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        //Initialization For MenuBar...
        mb1 = new JMenuBar();
        
        //Initialization For Menus...
        m1 = new JMenu("File");
        m2 = new JMenu("Help");
        
        //Initialization For MenuItems...
        mi1 = new JMenuItem("Standard");
        mi2 = new JMenuItem("Scientific");
        mi3 = new JMenuItem("Exit...");
        mi4 = new JMenuItem("About...");
        
        //Initialization For The Display TextField...
        tf1 = new JTextField();
        
        //Initialization For Buttons...
        b1 = new JButton("DEL");
        b2 = new JButton("CLR");
        b3 = new JButton("ANS");
        b4 = new JButton("EXIT");
        b5 = new JButton("7");
        b6 = new JButton("8");
        b7 = new JButton("9");
        b8 = new JButton("+");
        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");
        b13 = new JButton("1");
        b14 = new JButton("2");
        b15 = new JButton("3");
        b16 = new JButton("*");
        b17 = new JButton("0");
        b18 = new JButton(".");
        b19 = new JButton("±");
        b20 = new JButton("/");
        b21 = new JButton("x^2");
        b22 = new JButton("x^3");
        b23 = new JButton("x^y");
        b24 = new JButton("1/x");
        b25 = new JButton("(");
        b26 = new JButton("√");
        b27 = new JButton("3√");
        b28 = new JButton("y√");
        b29 = new JButton("n!");
        b30 = new JButton(")");
        b31 = new JButton("sin");
        b32 = new JButton("cos");
        b33 = new JButton("tan");
        b34 = new JButton("exp");
        b35 = new JButton("nPr");
        b36 = new JButton("asin");
        b37 = new JButton("acos");
        b38 = new JButton("atan");
        b39 = new JButton("log");
        b40 = new JButton("nCr");
        b41 = new JButton("sinh");
        b42 = new JButton("cosh");
        b43 = new JButton("tanh");
        b44 = new JButton("log10");
        b45 = new JButton("π");
        
        //Initialization For The "Scientific" CheckBox...
        c1 = new JCheckBox("Scientific");
        
        //Calling The Method That Has All Design Code and "Adding-Events-To-Components" Code...
        design();

    }
    
    //Private Method For All "Design" and "Adding-Events-To-Components" Code...
    private void design() {
        //Properties For JFrame...
        f1.setTitle("Calculator");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setSize(330, 390);
        f1.setResizable(false);
        f1.setLocation(450, 300);
        f1.setLayout(null);
        
        //Properties For JPanel p...
        p.setBounds(0, 0, 330, 390);
        p.setBackground(new Color(102, 153, 255));
        p.setLayout(null);
        
        //Properties For JMenuBar mb1...
        mb1.setBounds(0, 0, 330, 25);
        //Properties For JMenus m1, m2...
        m1.setForeground(Color.GRAY);
        m2.setForeground(Color.GRAY);
        
        //Properties For JTextField tf1...
        tf1.setBounds(10, 35, 305, 30);
        //"new Font("Dialog", 0, 15)"
        //I got it from testing in drag and drop part in java...
        tf1.setFont(new Font("Dialog", 0, 15));
        //"new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102))"
        //I got it from testing in drag and drop part in java...
        tf1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102)));
        tf1.setEditable(false);
        
        //Properties For JPanel p1... 
        p1.setBounds(10, 80, 305, 50);
        p1.setBackground(new Color(37, 114, 108));
        p1.setLayout(null);
        //Properties For b1 "DEL"...
        b1.setBounds(10, 10, 60, 30);
        //"new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 1, true)"
        //I got it from testing in drag and drop part in java...
        b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b1.setForeground(Color.DARK_GRAY);
        b1.setFont(new Font("Book Antiqua", 0, 12));
        //Properties For b2 "CLR"...
        b2.setBounds(85, 10, 60, 30);
        b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b2.setForeground(Color.DARK_GRAY);
        b2.setFont(new Font("Book Antiqua", 0, 12));
        //Properties For b3 "ANS"...
        b3.setBounds(160, 10, 60, 30);
        b3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b3.setForeground(Color.DARK_GRAY);
        b3.setFont(new Font("Book Antiqua", 0, 12));
        //Properties For b4 "EXIT"...
        b4.setBounds(235, 10, 60, 30);
        b4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b4.setForeground(Color.DARK_GRAY);
        b4.setFont(new Font("Book Antiqua", 0, 12));
        
        //Properties For JPanel p2...
        p2.setBounds(10, 150, 305, 175);
        p2.setBackground(new Color(0, 204, 153));
        p2.setLayout(null);
        //Properties For b5 "7"...
        b5.setBounds(10, 10, 60, 35);
        b5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b5.setForeground(Color.DARK_GRAY);
        b5.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b6 "8"...
        b6.setBounds(85, 10, 60, 35);
        b6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b6.setForeground(Color.DARK_GRAY);
        b6.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b7 "9"...
        b7.setBounds(160, 10, 60, 35);
        b7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b7.setForeground(Color.DARK_GRAY);
        b7.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b8 "+"...
        b8.setBounds(235, 10, 60, 35);
        b8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b8.setForeground(Color.DARK_GRAY);
        b8.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b9 "4"...
        b9.setBounds(10, 50, 60, 35);
        b9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b9.setForeground(Color.DARK_GRAY);
        b9.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b10 "5"...
        b10.setBounds(85, 50, 60, 35);
        b10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b10.setForeground(Color.DARK_GRAY);
        b10.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b11 "6"...
        b11.setBounds(160, 50, 60, 35);
        b11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b11.setForeground(Color.DARK_GRAY);
        b11.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b12 "-"...
        b12.setBounds(235, 50, 60, 35);
        b12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b12.setForeground(Color.DARK_GRAY);
        b12.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b13 "1"...
        b13.setBounds(10, 90, 60, 35);
        b13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b13.setForeground(Color.DARK_GRAY);
        b13.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b14 "2"...
        b14.setBounds(85, 90, 60, 35);
        b14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b14.setForeground(Color.DARK_GRAY);
        b14.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b15 "3"...
        b15.setBounds(160, 90, 60, 35);
        b15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b15.setForeground(Color.DARK_GRAY);
        b15.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b16 "*"...
        b16.setBounds(235, 90, 60, 35);
        b16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b16.setForeground(Color.DARK_GRAY);
        b16.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b17 "0"...
        b17.setBounds(10, 130, 60, 35);
        b17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b17.setForeground(Color.DARK_GRAY);
        b17.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b18 "."...
        b18.setBounds(85, 130, 60, 35);
        b18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b18.setForeground(Color.DARK_GRAY);
        b18.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b19 "+/-"...
        b19.setBounds(160, 130, 60, 35);
        b19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b19.setForeground(Color.DARK_GRAY);
        b19.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b20 "/"...
        b20.setBounds(235, 130, 60, 35);
        b20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b20.setForeground(Color.DARK_GRAY);
        b20.setFont(new Font("Book Antiqua", 0, 15));
        
        //Properties For JPanel p3...
        p3.setBounds(330, 150, 410, 175);
        p3.setBackground(new Color(0, 204, 153));
        p3.setLayout(null);
        p3.setVisible(false);
        //Properties For b21 "x^2"...
        b21.setBounds(10, 10, 70, 29);
        b21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b21.setForeground(Color.DARK_GRAY);
        b21.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b22 "x^3"...
        b22.setBounds(90, 10, 70, 29);
        b22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b22.setForeground(Color.DARK_GRAY);
        b22.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b23 "x^y"...
        b23.setBounds(170, 10, 70, 29);
        b23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b23.setForeground(Color.DARK_GRAY);
        b23.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b24 "1/x"...
        b24.setBounds(250, 10, 70, 29);
        b24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b24.setForeground(Color.DARK_GRAY);
        b24.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b25 "("...
        b25.setBounds(330, 10, 70, 29);
        b25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b25.setForeground(Color.DARK_GRAY);
        b25.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b26 "root of second degree"...
        b26.setBounds(10, 43, 70, 29);
        b26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b26.setForeground(Color.DARK_GRAY);
        b26.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b27 "root of third degree"...
        b27.setBounds(90, 43, 70, 29);
        b27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b27.setForeground(Color.DARK_GRAY);
        b27.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b28 "root of degree y"...
        b28.setBounds(170, 43, 70, 29);
        b28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b28.setForeground(Color.DARK_GRAY);
        b28.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b29 "n!"...
        b29.setBounds(250, 43, 70, 29);
        b29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b29.setForeground(Color.DARK_GRAY);
        b29.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b30 ")"...
        b30.setBounds(330, 43, 70, 29);
        b30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b30.setForeground(Color.DARK_GRAY);
        b30.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b31 "sin"...
        b31.setBounds(10, 76, 70, 29);
        b31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b31.setForeground(Color.DARK_GRAY);
        b31.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b32 "cos"...
        b32.setBounds(90, 76, 70, 29);
        b32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b32.setForeground(Color.DARK_GRAY);
        b32.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b33 "tan"...
        b33.setBounds(170, 76, 70, 29);
        b33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b33.setForeground(Color.DARK_GRAY);
        b33.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b34 "exp"...
        b34.setBounds(250, 76, 70, 29);
        b34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b34.setForeground(Color.DARK_GRAY);
        b34.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b35 "nPr"...
        b35.setBounds(330, 76, 70, 29);
        b35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b35.setForeground(Color.DARK_GRAY);
        b35.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b36 "asin"...
        b36.setBounds(10, 109, 70, 29);
        b36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b36.setForeground(Color.DARK_GRAY);
        b36.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b37 "acos"...
        b37.setBounds(90, 109, 70, 29);
        b37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b37.setForeground(Color.DARK_GRAY);
        b37.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b38 "atan"...
        b38.setBounds(170, 109, 70, 29);
        b38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b38.setForeground(Color.DARK_GRAY);
        b38.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b39 "log"...
        b39.setBounds(250, 109, 70, 29);
        b39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b39.setForeground(Color.DARK_GRAY);
        b39.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b40 "nCr"...
        b40.setBounds(330, 109, 70, 29);
        b40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b40.setForeground(Color.DARK_GRAY);
        b40.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b41 "sinh"...
        b41.setBounds(10, 142, 70, 29);
        b41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b41.setForeground(Color.DARK_GRAY);
        b41.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b42 "cosh"...
        b42.setBounds(90, 142, 70, 29);
        b42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b42.setForeground(Color.DARK_GRAY);
        b42.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b43 "tanh"...
        b43.setBounds(170, 142, 70, 29);
        b43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b43.setForeground(Color.DARK_GRAY);
        b43.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b44 "log10"...
        b44.setBounds(250, 142, 70, 29);
        b44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b44.setForeground(Color.DARK_GRAY);
        b44.setFont(new Font("Book Antiqua", 0, 15));
        //Properties For b45 "pi"...
        b45.setBounds(330, 142, 70, 29);
        b45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153)));
        b45.setForeground(Color.DARK_GRAY);
        b45.setFont(new Font("Book Antiqua", 0, 15));
        
        //Properties For JCheckBox c1...
        c1.setBounds(5, 325, 103, 30);
        c1.setBackground(new Color(102, 153, 255));
        c1.setForeground(Color.BLACK);
        c1.setFont(new Font("TIMES NEW ROMAN", 1, 20));
        c1.setLayout(null);
        
        //Adding JPanel p To Our JFrame...
        f1.add(p);
        
        //Adding Components of p To It (in this case we are adding containers p1, p2, p3 to p)...
        p.add(mb1);
        mb1.add(m1);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        mb1.add(m2);
        m2.add(mi4);
        p.add(tf1);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(c1);
        
        //Adding Components of p1 To It...
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        //Adding Components of p2 To It...
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        
        //Adding Components of p3 To It...
        p3.add(b21);
        p3.add(b22);
        p3.add(b23);
        p3.add(b24);
        p3.add(b25);
        p3.add(b26);
        p3.add(b27);
        p3.add(b28);
        p3.add(b29);
        p3.add(b30);
        p3.add(b31);
        p3.add(b32);
        p3.add(b33);
        p3.add(b34);
        p3.add(b35);
        p3.add(b36);
        p3.add(b37);
        p3.add(b38);
        p3.add(b39);
        p3.add(b40);
        p3.add(b41);
        p3.add(b42);
        p3.add(b43);
        p3.add(b44);
        p3.add(b45);
        
        //Adding Events To MenuItems...
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //The Original Size For The Whole Frame...
                f1.setSize(330, 390);
                //The Original Location For The Whole Frame...
                f1.setLocation(450, 300);
                //Make p3 Invisible...
                p3.setVisible(false);
                //The Original Bounds For p...
                p.setBounds(0, 0, 330, 390);
                //The Original Bounds For mb1...
                mb1.setBounds(0, 0, 330, 25);
                //The Original Bounds For tf1...
                tf1.setBounds(10, 35, 305, 30);
                //The Original Bounds For p1..
                p1.setBounds(10, 80, 305, 50);
                //The Original Bounds For b1...
                b1.setBounds(10, 10, 60, 30);
                //The Original Bounds For b2...
                b2.setBounds(85, 10, 60, 30);
                //The Original Bounds For b3...
                b3.setBounds(160, 10, 60, 30);
                //The Original Bounds For b4...
                b4.setBounds(235, 10, 60, 30);
                //Change The Scientific CheckBox To Not Selected...
                c1.setSelected(false);
            }
        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //The Changed Size For The Whole Frame...
                f1.setSize(760, 390);
                //The Changed Location For The Whole Frame...
                f1.setLocation(270, 300);
                //Make p3 Visible...
                p3.setVisible(true);
                //The Changed Bounds For p...
                p.setBounds(0, 0, 800, 390);
                //The Changed Bounds For mb1...
                mb1.setBounds(0, 0, 800, 25);
                //The Changed Bounds For tf1...
                tf1.setBounds(10, 35, 730, 30);
                //The Changed Bounds For p1..
                p1.setBounds(10, 80, 730, 50);
                //The Changed Bounds For b1...
                b1.setBounds(10, 10, 60, 30);
                //The Changed Bounds For b2...
                b2.setBounds(85, 10, 60, 30);
                //The Changed Bounds For b3...
                b3.setBounds(590, 10, 60, 30);
                //The Changed Bounds For b4...
                b4.setBounds(660, 10, 60, 30);
                //Change The Scientific CheckBox To Selected...
                c1.setSelected(true);
            }
        });
        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        //Adding Events To Our Components: Buttons 1-45, Checkbox c1...
        b1.addActionListener(e1);
        b2.addActionListener(e1);
        b3.addActionListener(e1);
        b4.addActionListener(e1);
        b5.addActionListener(e1);
        b6.addActionListener(e1);
        b7.addActionListener(e1);
        b8.addActionListener(e1);
        b9.addActionListener(e1);
        b10.addActionListener(e1);
        b11.addActionListener(e1);
        b12.addActionListener(e1);
        b13.addActionListener(e1);
        b14.addActionListener(e1);
        b15.addActionListener(e1);
        b16.addActionListener(e1);
        b17.addActionListener(e1);
        b18.addActionListener(e1);
        b19.addActionListener(e1);
        b20.addActionListener(e1);
        b21.addActionListener(e1);
        b22.addActionListener(e1);
        b23.addActionListener(e1);
        b24.addActionListener(e1);
        b25.addActionListener(e1);
        b26.addActionListener(e1);
        b27.addActionListener(e1);
        b28.addActionListener(e1);
        b29.addActionListener(e1);
        b30.addActionListener(e1);
        b31.addActionListener(e1);
        b32.addActionListener(e1);
        b33.addActionListener(e1);
        b34.addActionListener(e1);
        b35.addActionListener(e1);
        b36.addActionListener(e1);
        b37.addActionListener(e1);
        b38.addActionListener(e1);
        b39.addActionListener(e1);
        b40.addActionListener(e1);
        b41.addActionListener(e1);
        b42.addActionListener(e1);
        b43.addActionListener(e1);
        b44.addActionListener(e1);
        b45.addActionListener(e1);
        c1.addActionListener(e1);
        
        //Adding Key-Events To TextField tf1...
        //This Part Is To Add The "KeyListener" or KeyEvent To All Components And Containers 
        //In The Displayed Application To Let The Keys Work Regardless of What Component Is 
        //Actived Now...
        f1.addKeyListener(e1);
        p.addKeyListener(e1);
        p1.addKeyListener(e1);
        p2.addKeyListener(e1);
        p3.addKeyListener(e1);
        mb1.addKeyListener(e1);
        tf1.addKeyListener(e1);
        b1.addKeyListener(e1);
        b2.addKeyListener(e1);
        b3.addKeyListener(e1);
        b4.addKeyListener(e1);
        b5.addKeyListener(e1);
        b6.addKeyListener(e1);
        b7.addKeyListener(e1);
        b8.addKeyListener(e1);
        b9.addKeyListener(e1);
        b10.addKeyListener(e1);
        b11.addKeyListener(e1);
        b12.addKeyListener(e1);
        b13.addKeyListener(e1);
        b14.addKeyListener(e1);
        b15.addKeyListener(e1);
        b16.addKeyListener(e1);
        b17.addKeyListener(e1);
        b18.addKeyListener(e1);
        b19.addKeyListener(e1);
        b20.addKeyListener(e1);
        b21.addKeyListener(e1);
        b22.addKeyListener(e1);
        b23.addKeyListener(e1);
        b24.addKeyListener(e1);
        b25.addKeyListener(e1);
        b26.addKeyListener(e1);
        b27.addKeyListener(e1);
        b28.addKeyListener(e1);
        b30.addKeyListener(e1);
        b31.addKeyListener(e1);
        b32.addKeyListener(e1);
        b33.addKeyListener(e1);
        b34.addKeyListener(e1);
        b35.addKeyListener(e1);
        b36.addKeyListener(e1);
        b37.addKeyListener(e1);
        b38.addKeyListener(e1);
        b39.addKeyListener(e1);
        b40.addKeyListener(e1);
        b41.addKeyListener(e1);
        b42.addKeyListener(e1);
        b43.addKeyListener(e1);
        b44.addKeyListener(e1);
        b45.addKeyListener(e1);
        c1.addKeyListener(e1);
        
    }
    
    //Private Method For Events...
    private class Events implements ActionListener, KeyListener {
        //Overriden actionPerformed Method To Make Our Own Events...
        @Override
        public void actionPerformed(ActionEvent e) {
            //Events For Buttons...
            String str1 = tf1.getText();
            String strForResult = "";
            
            if(e.getSource()==b1) {
                if(str1.length()>0) {
                    tf1.setText(str1.substring(0, str1.length()-1));
                }
            }
            if(e.getSource()==b2) {
                tf1.setText("");
            }
            if(e.getSource()==b3) {
                
                try {
                    String str2 = "";
                    if(str1.contains("sin(")) {
                        int j = str1.indexOf("sin(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+4, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.sin(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("cos(")) {
                        int j = str1.indexOf("cos(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+4, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.cos(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("tan(")) {
                        int j = str1.indexOf("tan(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+4, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.tan(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("arcsin")) {
                        int j = str1.indexOf("arcsin");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+7, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.asin(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("arccos")) {
                        int j = str1.indexOf("arccos");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+7, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.acos(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("arctan")) {
                        int j = str1.indexOf("arctan");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+7, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.atan(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("sinh(")) {
                        int j = str1.indexOf("sinh(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+5, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.sinh(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("cosh(")) {
                        int j = str1.indexOf("cosh(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+5, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.cosh(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("tanh(")) {
                        int j = str1.indexOf("tanh(");
                        int bracket = str1.indexOf(")");
                        double angle = Double.parseDouble(str1.substring(j+5, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.tanh(angle)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("exp")) {
                        int j = str1.indexOf("exp");
                        int bracket = str1.indexOf(")");
                        double a = Double.parseDouble(str1.substring(j+4, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.exp(a)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("log10(")) {
                        int j = str1.indexOf("log10(");
                        int bracket = str1.indexOf(")");
                        double a = Double.parseDouble(str1.substring(j+6, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.log10(a)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("log(")) {
                        int j = str1.indexOf("log(");
                        int bracket = str1.indexOf(")");
                        double a = Double.parseDouble(str1.substring(j+4, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.log(a)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("^")) {
                        int j = str1.indexOf("^");
                        int base = Integer.parseInt(str1.substring(j-1, j));
                        int power = Integer.parseInt(String.valueOf(str1.charAt(j+1)));
                        str2 = str1.substring(0, j-1) + String.valueOf(Math.pow(base, power)) 
                                + str1.substring(j+2);
                    }
                    if(str1.contains("sqrt")) {
                        int j = str1.indexOf("sqrt");
                        int bracket = str1.indexOf(")");
                        Integer number = Integer.parseInt(str1.substring(j+5, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(Math.sqrt(number)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("cbcrt")) {
                        int j = str1.indexOf("cbcrt");
                        int bracket = str1.indexOf(")");
                        double number = Double.parseDouble(str1.substring(j+6, bracket));
                        str2 = str1.substring(0, j) + String.valueOf(cubicRoot(number)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("yroot")) {
                        int j = str1.indexOf("yroot");
                        int bracket = str1.indexOf(")");
                        int number = Integer.parseInt(str1.substring(j+6, bracket));
                        int y = Integer.parseInt(str1.substring(j-1, j));
                        str2 = str1.substring(0, j-2) + String.valueOf(nthRoot(number, y)) 
                                + str1.substring(bracket+1);
                    }
                    if(str1.contains("!")) {
                        int j = str1.indexOf("!");
                        int number = Integer.parseInt(str1.substring(j-1, j));
                        str2 = str1.substring(0, j-1) + String.valueOf(factorial(number)) 
                                + str1.substring(j+1);
                    }
                    if(str1.contains("C")) {
                        int j = str1.indexOf("C");
                        int n = Integer.parseInt(str1.substring(j-1, j));
                        int r = Integer.parseInt(str1.substring(j+1, j+2));
                        str2 = str1.substring(0, j-1) + String.valueOf(nCr(n, r)) 
                                + str1.substring(j+2);
                    }
                    if(str1.contains("P")) {
                        int j = str1.indexOf("P");
                        int n = Integer.parseInt(str1.substring(j-1, j));
                        int r = Integer.parseInt(str1.substring(j+1, j+2));
                        str2 = str1.substring(0, j-1) + String.valueOf(nPr(n, r)) 
                                + str1.substring(j+2);
                    }
                    if(str1.contains("/0")) {
                        throw new IllegalArgumentException("");
                    }
                    if(str1.contains("sqrt(-")) {
                        throw new ArithmeticException("");
                    }
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("JavaScript");
                    tf1.setText(str1 + "= " + engine.eval(str2));
                }catch(ScriptException ex) {
                    
                }catch(ArithmeticException ex1) {
                    tf1.setText("Error!");
                    JOptionPane.showMessageDialog(null, "Error!");
                }catch(IllegalArgumentException ex2){
                    tf1.setText("Division By Zero is Undefined!");
                    JOptionPane.showMessageDialog(null, "Division By Zero is Undefined!");
                    
                }catch(Exception e3) {
                    tf1.setText("Error!");
                }
            }
            if(e.getSource()==b4) {
                /*
                That dispose" Method: Releases all of the native screen resources 
                  used by this Window, its subcomponents, and all of its owned children. 
                  That is, the resources for these Components will be destroyed, any memory 
                  they consume will be returned to the OS, and they will be marked as 
                  undisplayable.
                */
                f1.dispose();
            }
            if(e.getSource()==b5) {
                tf1.setText(str1 + "7");
            }
            if(e.getSource()==b6) {
                tf1.setText(str1 + "8");
            }
            if(e.getSource()==b7) {
                tf1.setText(str1 + "9");
            }
            if(e.getSource()==b8) {
                tf1.setText(str1 + "+");
            }
            if(e.getSource()==b9) {
                tf1.setText(str1 + "4");
            }
            if(e.getSource()==b10) {
                tf1.setText(str1 + "5");
            }
            if(e.getSource()==b11) {
                tf1.setText(str1 + "6");
            }
            if(e.getSource()==b12) {
                tf1.setText(str1 + "-");
            }
            if(e.getSource()==b13) {
                tf1.setText(str1 + "1");
            }
            if(e.getSource()==b14) {
                tf1.setText(str1 + "2");
            }
            if(e.getSource()==b15) {
                tf1.setText(str1 + "3");
            }
            if(e.getSource()==b16) {
                tf1.setText(str1 + "*");
            }
            if(e.getSource()==b17) {
                tf1.setText(str1 + "0");
            }
            if(e.getSource()==b18) {
                tf1.setText(str1 + ".");
            }
            if(e.getSource()==b19) {
            }
            if(e.getSource()==b20) {
                tf1.setText(str1 + "/");
            }
            if(e.getSource()==b21) {
                tf1.setText(str1 + "^2");
            }
            if(e.getSource()==b22) {
                tf1.setText(str1 + "^3");
            }
            if(e.getSource()==b23) {
                tf1.setText(str1 + "^");
            }
            if(e.getSource()==b24) {
                tf1.setText(str1 + "1/");
            }
            if(e.getSource()==b25) {
                tf1.setText(str1 + "(");
            }
            if(e.getSource()==b26) {
                tf1.setText(str1 + "sqrt(");
            }
            if(e.getSource()==b27) {
                tf1.setText(str1 + "cbcrt(");
            }
            if(e.getSource()==b28) {
                tf1.setText(str1 + "yroot(");
            }
            if(e.getSource()==b29) {
                tf1.setText(str1 + "!");
            }
            if(e.getSource()==b30) {
                tf1.setText(str1 + ")");
            }
            if(e.getSource()==b31) {
                tf1.setText(str1 + "sin(");
            }
            if(e.getSource()==b32) {
                tf1.setText(str1 + "cos(");
            }
            if(e.getSource()==b33) {
                tf1.setText(str1 + "tan(");
            }
            if(e.getSource()==b34) {
                tf1.setText(str1 + "exp(");
            }
            if(e.getSource()==b35) {
                tf1.setText(str1 + "P");
            }
            if(e.getSource()==b36) {
                tf1.setText(str1 + "arcsin(");
            }
            if(e.getSource()==b37) {
                tf1.setText(str1 + "arccos(");
            }
            if(e.getSource()==b38) {
                tf1.setText(str1 + "arctan(");
            }
            if(e.getSource()==b39) {
                tf1.setText(str1 + "log(");
            }
            if(e.getSource()==b40) {
                tf1.setText(str1 + "C");
            }
            if(e.getSource()==b41) {
                tf1.setText(str1 + "sinh(");
            }
            if(e.getSource()==b42) {
                tf1.setText(str1 + "cosh(");
            }
            if(e.getSource()==b43) {
                tf1.setText(str1 + "tanh(");
            }
            if(e.getSource()==b44) {
                tf1.setText(str1 + "log10(");
            }
            if(e.getSource()==b45) {
                tf1.setText(str1 + Math.PI);
            }
            //The Event For c1 To Control The Visibility of The Scientific Part...
            if(!c1.isSelected()) {
                //The Original Size For The Whole Frame...
                f1.setSize(330, 390);
                //The Original Location For The Whole Frame...
                f1.setLocation(450, 300);
                //Make p3 Invisible...
                p3.setVisible(false);
                //The Original Bounds For p...
                p.setBounds(0, 0, 330, 390);
                //The Original Bounds For mb1...
                mb1.setBounds(0, 0, 330, 25);
                //The Original Bounds For tf1...
                tf1.setBounds(10, 35, 305, 30);
                //The Original Bounds For p1..
                p1.setBounds(10, 80, 305, 50);
                //The Original Bounds For b1...
                b1.setBounds(10, 10, 60, 30);
                //The Original Bounds For b2...
                b2.setBounds(85, 10, 60, 30);
                //The Original Bounds For b3...
                b3.setBounds(160, 10, 60, 30);
                //The Original Bounds For b4...
                b4.setBounds(235, 10, 60, 30);
            }
            else {
                //The Changed Size For The Whole Frame...
                f1.setSize(760, 390);
                //The Changed Location For The Whole Frame...
                f1.setLocation(270, 300);
                //Make p3 Visible...
                p3.setVisible(true);
                //The Changed Bounds For p...
                p.setBounds(0, 0, 800, 390);
                //The Changed Bounds For mb1...
                mb1.setBounds(0, 0, 800, 25);
                //The Changed Bounds For tf1...
                tf1.setBounds(10, 35, 730, 30);
                //The Changed Bounds For p1..
                p1.setBounds(10, 80, 730, 50);
                //The Changed Bounds For b1...
                b1.setBounds(10, 10, 60, 30);
                //The Changed Bounds For b2...
                b2.setBounds(85, 10, 60, 30);
                //The Changed Bounds For b3...
                b3.setBounds(590, 10, 60, 30);
                //The Changed Bounds For b4...
                b4.setBounds(660, 10, 60, 30);
            }
        }
        //Overriden keyPressed Method To Make Our Own Key-events...
        @Override
        public void keyPressed(KeyEvent e) {
            int keyASCII = e.getKeyCode();
            String str1 = tf1.getText();
            switch(keyASCII){
                case KeyEvent.VK_0:
                case KeyEvent.VK_NUMPAD0:
                    tf1.setText(str1 + "0");
                    break;
                case KeyEvent.VK_1:
                case KeyEvent.VK_NUMPAD1:
                    tf1.setText(str1 + "1");
                    break;
                case KeyEvent.VK_2:
                case KeyEvent.VK_NUMPAD2:
                    tf1.setText(str1 + "2");
                    break;
                case KeyEvent.VK_3:
                case KeyEvent.VK_NUMPAD3:
                    tf1.setText(str1 + "3");
                    break;
                case KeyEvent.VK_4:
                case KeyEvent.VK_NUMPAD4:
                    tf1.setText(str1 + "4");
                    break;
                case KeyEvent.VK_5:
                case KeyEvent.VK_NUMPAD5:
                    tf1.setText(str1 + "5");
                    break;
                case KeyEvent.VK_6:
                case KeyEvent.VK_NUMPAD6:
                    tf1.setText(str1 + "6");
                    break;
                case KeyEvent.VK_7:
                case KeyEvent.VK_NUMPAD7:
                    tf1.setText(str1 + "7");
                    break;
                case KeyEvent.VK_8:
                case KeyEvent.VK_NUMPAD8:
                    tf1.setText(str1 + "8");
                    break;
                case KeyEvent.VK_9:
                case KeyEvent.VK_NUMPAD9:
                    tf1.setText(str1 + "9");
                    break;
                case KeyEvent.VK_ADD:
                    tf1.setText(str1 + "+");
                    break;
                case KeyEvent.VK_MINUS:
                    tf1.setText(str1 + "-");
                case KeyEvent.VK_SUBTRACT:
                    tf1.setText(str1 + "-");
                    break;
                case KeyEvent.VK_MULTIPLY:
                    tf1.setText(str1 + "*");
                    break;
                case KeyEvent.VK_DIVIDE:
                    tf1.setText(str1 + "/");
                    break;
                case KeyEvent.VK_SLASH:
                    tf1.setText(str1 + "/");
                    break;
                case KeyEvent.VK_PERIOD:
                case KeyEvent.VK_DECIMAL:
                    tf1.setText(str1 + ".");
                    break;
                case KeyEvent.VK_BACK_SPACE:
                    if(str1.length()>0) {
                        tf1.setText(str1.substring(0, str1.length()-1));
                    }
                    break;
                case KeyEvent.VK_EQUALS:
                    tf1.setText(str1 + "=");
                    break;
                case KeyEvent.VK_ENTER:
                    try {
                        ScriptEngineManager manager = new ScriptEngineManager();
                        ScriptEngine engine = manager.getEngineByName("JavaScript");
                        String str = tf1.getText();
                        tf1.setText(str + "=" + engine.eval(str));
                    }catch(ScriptException e1) {
                    
                    }
                    
            }
        }
        //Overriden keyReleased Method... We Should Make The Implementation To Make 
        //Our Class implements The Interface "KeyListener"...
        @Override
        public void keyReleased(KeyEvent e) {
             //We Won't Use This Method... 
        }
        //Overriden keyTyped Method... We Should Make The Implementation To Make 
        //Our Class implements The Interface "KeyListener"...
        @Override
        public void keyTyped(KeyEvent e) {
            //We Won't Use This Method...
        }
        
        //Mathematical Methods...
        //cubic root Method (Not In Math Class)...
        public double cubicRoot(double number) {
            return nthRoot((int)number, 3);
        }
        //y-root Method (Not In Math Class)...
        public double nthRoot(int A, int N) { 
            // intially guessing a random number between 
            // 0 and 9 
            double xPre = Math.random() % 10; 

            // smaller eps, denotes more accuracy 
            double eps = 0.001; 

            // initializing difference between two 
            // roots by INT_MAX 
            double delX = 2147483647; 

            // xK denotes current value of x 
            double xK = 0.0; 

            // loop untill we reach desired accuracy 
            while (delX > eps) 
            { 
                // calculating current value from previous 
                // value by newton's method 
                xK = ((N - 1.0) * xPre + 
                (double)A / Math.pow(xPre, N - 1)) / (double)N; 
                delX = Math.abs(xK - xPre); 
                xPre = xK; 
            } 

            return xK; 
        }
        //Factorial Method (Not In Math Class)...
        public int factorial(int number) {
            int result = 1;
            for(int i=number ; i>0 ; i--) {
                result *= i;
            }
            return result;
        }
        //nPr Method (Not In Math Class)...
        public int nPr(int n, int r) {
            return factorial(n)/factorial(n-r);
        }
        //nCr Method (Not In Math Class)...
        public int nCr(int n, int r) {
            return factorial(n)/(factorial(r)*factorial(n-r));
        }

    }
    
}