/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Quadrado extends Figura {
public Quadrado(long altura,long base){
super(altura, base);
}
@Override
public double area(){
return super.area()/2;
}
    
}
