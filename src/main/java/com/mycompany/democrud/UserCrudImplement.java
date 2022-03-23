/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democrud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            // begin statement
            String sql="INSERT INTO `user`(`nom`) VALUES (?)"; //query syntax
            PreparedStatement statement=Connect.conn.prepareStatement(sql);
            statement.setString(1, nom);
            // statement created
            
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
        try {
            String sql="UPDATE `user` SET `nom`=? WHERE `id`=?";
            PreparedStatement stm=Connect.conn.prepareStatement(sql);
            stm.setString(1, u.getNom());
            stm.setInt(2, u.getId());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "modifié avec succés!");
            
            
            
        } catch (Exception e) {
            
            System.out.println("exception: "+e);
        }





    }

    @Override
    public void deleteUser(int id) {
    try {
        String query="Delete from user WHERE id=?";

        PreparedStatement statement=Connect.conn.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "supprimé!");
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
    
}
