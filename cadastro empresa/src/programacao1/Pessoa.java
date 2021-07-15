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
public abstract class Pessoa {
    protected String nome;
    protected String documento;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public void exibeDados(){
        System.out.println("Nome: " + this.nome +
                "\nDocumento: " + this.documento);

    }
    
}




