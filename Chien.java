/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.chat;

/**
 *
 * @author Antho
 */
public class Chien extends Animal {
    private String crier;

    //Constructeur
    public Chien(int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        crier = "Ouaf";   
    }
    //Fin Constructeur

    public Chien(String crier, int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        this.crier = crier;
    }
     
    public String getCrier() {
        return crier;
    }

    public void setCrier(String crier) {
        this.crier = crier;
    }
    
    public String unChien(){
        String str = super.unAnimal()+ " "+this.crier+ " est le bruit de ce chien";
        return str;
    }
   
}
