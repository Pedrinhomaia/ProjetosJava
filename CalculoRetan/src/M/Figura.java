/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M;

/**
 *
 * @author Pedro Henrique Maia
 */
public class Figura {
private long base;
private long altura;
public Figura(long altura, long base){
    this.setAltura(altura);
    this.setBase(base);
   
}
    public long getAltura() {
        return altura;
    }

    public long getBase() {
        return base;
    }
    

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public void setBase(long base) {
        this.base = base;
    }
public double area(){
    return (getBase()*getAltura());
}
    
}
