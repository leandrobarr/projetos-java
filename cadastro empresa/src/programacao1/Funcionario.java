/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao1;

/**
 *
 * @author leabarros
 */
public abstract class Funcionario extends Pessoa{
    protected double salario;
    protected int ramal;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    public double calculaSalarioAnual(){
        return (getSalario() * 12 ) + getSalario();
    }
    
   
}
