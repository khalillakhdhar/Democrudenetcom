/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.democrud;

/**
 *
 * @author khali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Connect c=new Connect();
        UserCrudImplement uci=new UserCrudImplement();
     //   uci.CreateUser("admin");
     UserModel us=new UserModel(2, "administrateur");
     //uci.updateUser(us);
        //uci.deleteUser(3);
        
    }
    
}
