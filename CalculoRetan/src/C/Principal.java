/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;
import M.Figura;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Principal {
    public static void main(String[] args) {
        Figura obj_Qd = new Figura(55, 80);
        Figura obj_Tri = new Figura(10, 8);
        Figura obj_Tra = new Figura(100,80);
        System.out.println(obj_Qd.area());
        System.out.println(obj_Tra.area());
        System.out.println(obj_Tri.area());

    }
}
