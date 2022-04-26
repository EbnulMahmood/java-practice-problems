/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Rubaba Hasan
 */
public class SumNum {
   
   public static void main(String[] args) throws Exception {
      String thisLine = null;
      FileReader in = null;
      FileWriter out = null; 
      
      try {
      
         // open input stream test.txt for reading purpose.
         in = new FileReader("input2.txt");
         BufferedReader br = new BufferedReader(in);
         BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"));
         //String[] s = thisLine.split(",");
         int i=1;
         while ((thisLine = br.readLine()) != null) {
            System.out.println(i + ". " + thisLine);
            String[] s = thisLine.split(" ");
            int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            bw.write(s[0] + " " + s[1] + " " + sum + "\n");
            i++;
         }       
         br.close();
         bw.close();
      } catch(Exception e) {
         e.printStackTrace();
      }
      
   }
}
