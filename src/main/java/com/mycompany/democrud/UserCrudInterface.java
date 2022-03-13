/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.democrud;

/**
 *
 * @author khali
 */
public interface UserCrudInterface {
    public void CreateUser(String nom);
    public void updateUser(UserModel u);
    public void deleteUser(int id);
    //public static void showUsers();
}
