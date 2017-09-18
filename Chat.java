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
public class Chat extends Animal {
    private String crier;

    //Constructeur
    public Chat(int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        crier = "Miaou"; 
    }
    //Fin Constructeur

    public Chat(String crier, int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        this.crier = crier;
    }
    
    public String getCrier() {
        return crier;
    }

    public void setCrier(String crier) {
        this.crier = crier;
    }
    
    public String unChat(){
        String str = super.unAnimal()+ " "+this.crier+ " est le bruit de ce chat";
        return str;
    }
   
}
