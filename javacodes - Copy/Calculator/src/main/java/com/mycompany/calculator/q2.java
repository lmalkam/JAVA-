/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import javax.naming.ConfigurationException;
import javax.swing.*;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import java.awt.*;
import java.awt.event.ActionListener;
class Registration extends JFrame implements ActionListener {
JFrame window;
JLabel user = new JLabel("Username :");
JLabel pass = new JLabel("Password :");
JLabel conf = new JLabel("Confirm :");
JLabel email = new JLabel("E-Mail :");
JLabel branch = new JLabel("Choose Branch :");
JLabel about = new JLabel("About:");
JTextField userTxt = new JTextField();
JPasswordField passTxt = new JPasswordField();
JPasswordField confTxt = new JPasswordField();
JTextField emailTxt = new JTextField();
Choice branchc = new Choice();
JTextArea abouty = new JTextArea();
JButton btn = new JButton("Submit");
JLabel noValid = new JLabel();
Registration() {
setLayout(null);
user.setBounds(100, 50, 150, 50);
userTxt.setBounds(250, 50, 150, 40);
pass.setBounds(100, 100, 150, 50);
passTxt.setBounds(250, 100, 150, 40);
conf.setBounds(100, 150, 150, 50);
confTxt.setBounds(250, 150, 150, 40);
email.setBounds(100, 200, 150, 50);
emailTxt.setBounds(250, 200, 150, 40);
branch.setBounds(100, 250, 150, 50);
branchc.setBounds(250, 250, 150, 40);
about.setBounds(100, 300, 150, 50);
abouty.setBounds(250, 300, 350, 200);
btn.setBounds(250, 519, 200, 50);
add(btn);
btn.addActionListener((ActionListener) this);
branchc.add("CSE");
branchc.add("ECE");
branchc.add("EEE");
branchc.add("CHE");
branchc.add("CE");
branchc.add("ME");
branchc.add("MME");
add(user);
add(userTxt);
add(pass);
add(passTxt);
add(conf);
add(confTxt);
add(email);
add(emailTxt);
add(branch);
add(branchc);
add(about);
add(abouty);
}
@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
String s = e.getActionCommand();
char[] p1;
char[] p2;
p1 = passTxt.getPassword();
p2 = confTxt.getPassword();
String s1 = new String(p1);
String s2 = new String(p2);
if (s1.equals(s2)) {
JOptionPane.showMessageDialog(window, "Submitted successfully");
} else {
JOptionPane.showMessageDialog(window, "password and confirm password are not matching");
passTxt.setText("");
confTxt.setText("");
}
}
}
class Q2 {
public static void main(String[] args) throws Exception {
Registration f = new Registration();
f.setVisible(true);
f.setBounds(10, 10, 1000, 1000);
}
}