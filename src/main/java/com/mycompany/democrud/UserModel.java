/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democrud;

/**
 *
 * @author khali
 */
public class UserModel {
    private int id;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
// constructeur paramétré
    public UserModel(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
// obligation de création manuelle
    public UserModel() {
    }
    
  
}
