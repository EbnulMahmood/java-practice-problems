/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah Al Amin
 */
public class FileUtility {
    public static ArrayList<User> loadUsers(){
        try {
            InputStream loader = new BufferedInputStream(new FileInputStream("users.ser"));
            ObjectInputStream deser = new ObjectInputStream(loader);
            ArrayList<User> users = (ArrayList<User>) deser.readObject();
            return users;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;      
    }
    
    public static void saveUsers(ArrayList<User> users){
        try {
            OutputStream saver = new BufferedOutputStream(new FileOutputStream("users.ser"));
            ObjectOutputStream ser = new ObjectOutputStream(saver);
            ser.writeObject(users);
            ser.flush();
            System.out.println("saved succesfully");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
