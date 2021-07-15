/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leabarros
 */
public abstract class Poligono
{ 
  private int lados;

  public Poligono(int lados) {
        this.lados = lados;
    }
   
  public void imprimir(){
        System.out.println("Lados : "+lados);
    }

  abstract float area();
}

