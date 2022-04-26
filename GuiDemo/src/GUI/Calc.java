///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package GUI;
//import java.awt.FlowLayout;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//import sun.awt.im.InputMethodJFrame;
///**
// *
// * @author Rubaba Hasan
// */
//public class Calc {
//    JFrame frame;
//    JLabel num1, num2, result;
//    JTextField num1tf, num2tf, restf;
//    JButton add, sub, mul, div;
//    Calc() {
//        frame = new JFrame();
//        frame.setLayout(new GridLayout(2,2));
//        frame.setSize(300, 250);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JPanel jp1, jp2, jp3, jp4;
//        jp1 = new JPanel(new GridLayout(1, 3));
//        jp2 = new JPanel(new GridLayout(1, 3));
//        jp3 = new JPanel(new GridLayout(1, 2));
//        jp4 = new JPanel(new GridLayout(1, 2));
//        
//        frame.add(jp1);
//        frame.add(jp2);
//        frame.add(jp3);
//        frame.add(jp4);
//        
//        num1 = new JLabel("Number 1: ");
//        num2 = new JLabel("Number 2: ");
//        result = new JLabel("Result: ");
//        
//        num1tf = new JTextField(2);
//        num2tf = new JTextField(2);
//        restf = new JTextField(2);
//        
//        add = new JButton("+");
//        sub = new JButton("-");
//        mul = new JButton("*");
//        div = new JButton("/");
//        
//        jp1.add(num1);
//        jp1.add(num1tf);
//        jp1.add(num2);
//        
//        jp2.add(num2tf);
//        jp2.add(result);
//        jp2.add(restf);
//        
//        jp3.add(add);
//        jp3.add(sub);
//        jp4.add(mul);
//        jp4.add(div);
//        
//        /*frame.add(num1);
//        frame.add(num1tf);
//        frame.add(num2);
//        frame.add(num2tf);
//        frame.add(result);
//        frame.add(restf);
//        frame.add(add);
//        frame.add(sub);
//        frame.add(mul);
//        frame.add(div);*/
//        
//        frame.setVisible(true);
//        
//    }
//    
//    public void calculation(){
//        add.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double res = Double.parseDouble(num1tf.getText()) + Double.parseDouble(num2tf.getText()); 
//                restf.setText(String.valueOf(res));
//            }
//        });
//    }
//    
//    public static void main(String[] args) {
//        new Calc().calculation();
//    }
//}
