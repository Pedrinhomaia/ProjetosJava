/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Carteira;
import Model.ContaCorrente;
import Model.Poupança;
/**
 *
 * @author Pedro Henrique Maia
 */
public class Principal {
    public static void main(String[] args) {
        Carteira obj_carteira = new Carteira();
        obj_carteira.setSaldo(1000);
        obj_carteira.setNome("aparecido");
        System.out.println(obj_carteira.getNome());
        System.out.println(obj_carteira.getSaldo());
        
        obj_carteira.sacar(860);
        System.out.println("O cliente "+obj_carteira.getNome() +" tem R$ "+ obj_carteira.getSaldo()+ " de saldo");
        
        
        ContaCorrente obj_cc = new ContaCorrente();
        obj_cc.setNome("Pedro");
        obj_cc.setNumero(1000);
        System.out.println("vc se chama "+ obj_cc.getNome());
        System.out.println("o numero é "+ obj_cc.getNumero());
        
        Poupança obj_poupança = new Poupança();
        obj_poupança.setAniversario(12);
        System.out.println("vc completou "+ obj_poupança.getAniversario()+" de aniversario");
        
        
    }
}
