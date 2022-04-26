/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.ArrayList;

/**
 *
 * @author Abdullah Al Amin
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User admin = new User();
       admin.setName("abc");
       admin.setPassword("123");
       ArrayList<User> users = new ArrayList<>();
       users.add(admin);
       FileUtility.saveUsers(users);
       WellcomePage page = new WellcomePage();
       page.setVisible(true);
    }
    
}
