/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Rubaba Hasan
 */
public class SwingListenerDemo {
   private JFrame mainFrame, frameObject;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingListenerDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingListenerDemo  swingListenerDemo = new SwingListenerDemo();  
      swingListenerDemo.showKeyListenerDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      
      controlPanel.add(headerLabel);
      controlPanel.add(statusLabel);
     // mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
     // mainFrame.add(statusLabel);
      
     /* frameObject = new JFrame();
      frameObject.setTitle("My Application");
      frameObject.setSize(400, 400);
      frameObject.setLocation(100, 100);
      frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      */
      mainFrame.setVisible(true);  
   }
   private JTextField textField;
   private void showKeyListenerDemo(){
      headerLabel.setText("Listener in action: KeyListener");      
      textField  = new JTextField(10);
      textField.addKeyListener(new CustomKeyListener());
      JButton okButton = new JButton("OK");
      
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Entered text: " + textField.getText());                
         }
      });
      controlPanel.add(textField);
      controlPanel.add(okButton);    
      mainFrame.setVisible(true);  
   }
   class CustomKeyListener implements KeyListener{
      public void keyTyped(KeyEvent e) {
      }
      public void keyPressed(KeyEvent e) {
         if(e.getKeyCode() == KeyEvent.VK_ENTER){
            statusLabel.setText("Entered text: " + textField.getText());
            //mainFrame.setVisible(false);
            //frameObject.setVisible(true);
         }
      }
      public void keyReleased(KeyEvent e) {
      }   
   }
}