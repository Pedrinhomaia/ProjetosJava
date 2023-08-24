/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro Henrique Maia
 */
public abstract class Banco extends Conta {
  private int numero;
  private String agencia;
    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
    

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        

    }
       
    
    
  
    
    
}
