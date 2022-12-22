/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

import java.awt.TextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author lines
 */
public class Calculator implements ActionListener{
    
    Label t1;
    Button badd,bsub,bdiv,bmul,brem,bc,blank,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,be;
    Frame f;
    double num1,num2;
    int op;
    
    Calculator()
    {
        f=new Frame();
        
        t1=new Label();
        
        t1.setBounds(50,50,150,40);
        
        
        bc=new Button("CE");
        bsub=new Button("-");
        bdiv=new Button("/");
        bmul=new Button("*");
        brem=new Button("%");
        badd=new Button("+");
        blank=new Button("");
        be=new Button("=");
        
        bc.setBounds(50,100,40,30);
        badd.setBounds(100,100,40,30);
        bsub.setBounds(150,100,40,30);
        bmul.setBounds(50,150,40,30);
        bdiv.setBounds(100,150,40,30);
        brem.setBounds(150,150,40,30);
       
        
        
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        
        
        b1.setBounds(50,200,40,30);
        b2.setBounds(100,200,40,30);
        b3.setBounds(150,200,40,30);
        
        b4.setBounds(50,250,40,30);
        b5.setBounds(100,250,40,30);
        b6.setBounds(150,250,40,30);
        
        b7.setBounds(50,300,40,30);
        b8.setBounds(100,300,40,30);
        b9.setBounds(150,300,40,30);
        
        b0.setBounds(100,350,40,30);
        be.setBounds(150,350,40,30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        
       // f.addWindowListener(this);
        f.add(t1);
        f.add(bc);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(brem);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(be);
        f.add(blank);
        
        f.setTitle("Calculator");
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(null);
 
    }
    
    public void windowClosing(WindowEvent e) {
         f.dispose();
    }
   
    public void actionPerformed(ActionEvent e)
    {
        String x,xt;
       
        if(e.getSource()==b1)   
        {
            xt=t1.getText();
            x=xt+"1";
            t1.setText(x);
        }
        
        if(e.getSource()==b2)
        {
            xt=t1.getText();
            x=xt+"2";
            t1.setText(x);
        }
        
        if(e.getSource()==b3)
        {
            xt=t1.getText();
            x=xt+"3";
            t1.setText(x);
        }
        
        if(e.getSource()==b4)
        {
            xt=t1.getText();
            x=xt+"4";
            t1.setText(x);
        }
        
        
        if(e.getSource()==b5)
        {
            xt=t1.getText();
            x=xt+"5";
            t1.setText(x);
        }
        
        
        if(e.getSource()==b6)
        {
            xt=t1.getText();
            x=xt+"6";
            t1.setText(x);
        }
        
        if(e.getSource()==b7)
        {
            xt=t1.getText();
            x=xt+"7";
            t1.setText(x);
        }
        
        if(e.getSource()==b8)
        {
            xt=t1.getText();
            x=xt+"8";
            t1.setText(x);
        }
        
        if(e.getSource()==b9)
        {
            xt=t1.getText();
            x=xt+"9";
            t1.setText(x);
        }
        
        if(e.getSource()==b0)
        {
            xt=t1.getText();
            x=xt+"0";
            t1.setText(x);
        }
        
        
        if(e.getSource()==badd)
        {
            try{
                num1=Double.parseDouble(t1.getText());
            }
            catch(NumberFormatException ex)
            {
                t1.setText("Invalid Format");
                return;
            }
            x="";
            t1.setText(x);
            op=1;
        }
        
        if(e.getSource()==bsub)
        {
            try{
                num1=Double.parseDouble(t1.getText());
            }
            catch(NumberFormatException ex)
            {
                t1.setText("Invalid Format");
                return;
            }
            x="";
            t1.setText(x);
            op=2;
        }
        
        if(e.getSource()==bmul)
        {
            try{
                num1=Double.parseDouble(t1.getText());
            }
            catch(NumberFormatException ex)
            {
                t1.setText("Invalid Format");
                return;
            }
            x="";
            t1.setText(x);
            op=3;
        }
        
        if(e.getSource()==bdiv)
        {
            try{
                num1=Double.parseDouble(t1.getText());
            }
            catch(NumberFormatException ex)
            {
                t1.setText("Invalid Format");
                return;
            }
            x="";
            t1.setText(x);
            op=4;
        }
        
        if(e.getSource()==badd)
        {
            try{
                num1=Double.parseDouble(t1.getText());
            }
            catch(NumberFormatException ex)
            {
                t1.setText("Invalid Format");
                return;
            }
            x="";
            t1.setText(x);
            op=1;
        }
    }


    
    
    
    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
