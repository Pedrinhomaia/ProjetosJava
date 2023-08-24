/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Poupança extends Banco {
private int aniversario;
    public int getAniversario() {
        return aniversario;
    }

    public boolean setAniversario(int aniversario) {
        if ((aniversario > 0 ) && (aniversario < 32))
        this.aniversario = aniversario;
        return true;
        
    }
 
}
    

