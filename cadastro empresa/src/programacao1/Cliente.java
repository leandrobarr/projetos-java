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
public class Cliente extends Pessoa {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public boolean verificarSenha(String s){
        if(getSenha().equals(s)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
