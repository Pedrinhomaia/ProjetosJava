/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Conta {
    private String nome;
    private double saldo;
    
    public void sacar (double valor){
        this.saldo = this.saldo - valor;
        
    }
public void depositar(double valor){
this.saldo = this.saldo + valor;
}
void transferir(){}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
    
}
public double getSaldo(){
    return saldo;
    
}
public void setSaldo(double saldo){
    this.saldo = saldo;
}
}
