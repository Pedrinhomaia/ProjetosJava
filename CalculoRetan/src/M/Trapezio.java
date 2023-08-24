/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Trapezio extends Figura {
    private long baseMaior;
public Trapezio(long altura,long base,long baseMaior){
super(altura, base);
this.baseMaior = baseMaior;
}
@Override
public double area(){
return ((super.getBase()+baseMaior)*super.getAltura()/2);
}
    
}
