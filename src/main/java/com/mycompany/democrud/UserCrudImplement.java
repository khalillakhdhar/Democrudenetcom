/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democrud;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class UserCrudImplement implements UserCrudInterface{
Connect c=new Connect();

    @Override
    public void CreateUser(String nom) {
        try
        {
            String sql="INSERT INTO `user`(`nom`) VALUES (?)"; //query syntax
            PreparedStatement statement=Connect.conn.prepareStatement(sql);
            statement.setString(1, nom);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "ajouté avec succés"); // affichage de message
            
        }
        catch(Exception ex)
        {
            System.out.println("exception "+ex);
        }

    }

    @Override
    public void updateUser(UserModel u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
