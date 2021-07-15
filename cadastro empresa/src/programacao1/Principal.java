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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        presidente p = new presidente();
        p.setNome("Asdrubal Leôncio Correa");
        p.setDocumento("111.254.125-55");
        p.setSalario(25000.00);
        p.setRamal(100);
        
        Secretaria s1 = new Secretaria();
        s1.setNome("Fátima ");
        s1.setDocumento("123.456.789-00");
        s1.setSalario(2000.00);
        s1.setRamal(10);
        
        Secretaria s2 = new Secretaria();
        s2.setNome("Ana");
        s2.setDocumento("321.654.789-00");
        s2.setSalario(2000.00);
        s2.setRamal(20);
        
        Vendedor v1 = new Vendedor();
        v1.setNome("João");
        v1.setDocumento("111.544.888-88");
        v1.setSalario(3000.00);
        v1.setRamal(30);
        v1.setComissao(50);
        
        Vendedor v2 = new Vendedor();
        v2.setNome("Vanessa");
        v2.setDocumento("222.222.222-87");
        v2.setSalario(3000.00);
        v2.setRamal(40);
        v2.setComissao(40);
        
        Vendedor v3 = new Vendedor();
        v3.setNome("Carlos");
        v3.setDocumento("333.222.333-87");
        v3.setSalario(3000.00);
        v3.setRamal(50);
        v3.setComissao(20);
        
        Cliente c1 = new Cliente();
        c1.setNome("Marcos");
        c1.setDocumento("654.789.321-98");
        c1.setUsuario("marcos");
        c1.setSenha("1!2@3#4$5%");
        
        Cliente c2 = new Cliente();
        c2.setNome("Joana");
        c2.setDocumento("555.222.321-77");
        c2.setUsuario("Joana");
        c2.setSenha("123mudar");
        
        Cliente c3 = new Cliente();
        c3.setNome("Elisa");
        c3.setDocumento("357.951.321-77");
        c3.setUsuario("Elisa");
        c3.setSenha("Elisa123");
        
        Cliente c4 = new Cliente();
        c4.setNome("Lucas");
        c4.setDocumento("852.258.951-77");
        c4.setUsuario("Lucas");
        c4.setSenha("segredo");
        
        System.out.println("\nDados Cadastrados\n");
        System.out.println("PRESIDENTE: ");
        p.exibeDados();
        System.out.println("Ramal: "+p.getRamal());
        System.out.println("Salario: "+p.getSalario());
        System.out.println("Salario Anual: "+p.calculaSalarioAnual());
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("SECRETARIA: ");
        s1.exibeDados();
        System.out.println("Ramal: "+s1.getRamal());
        System.out.println("Salario: "+s1.getSalario());
        System.out.println();
        
        s2.exibeDados();
        System.out.println("Ramal: "+s2.getRamal());
        System.out.println("Salario: "+s2.getSalario());               
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("VENDEDORES: ");
        v1.exibeDados();
        System.out.println("Ramal: "+v1.getRamal());
        System.out.println("Salario: "+v1.getSalario());    
        System.out.println("Salario Mensal com Comissão: "+v1.salarioMesComComissao()); 
        System.out.println();
        
        v2.exibeDados();
        System.out.println("Ramal: "+v2.getRamal());
        System.out.println("Salario: "+v2.getSalario());    
        System.out.println("Salario Mensal com Comissão: "+v2.salarioMesComComissao()); 
        System.out.println();
        
        v3.exibeDados();
        System.out.println("Ramal: "+v3.getRamal());
        System.out.println("Salario: "+v3.getSalario());    
        System.out.println("Salario Mensal com Comissão: "+v3.salarioMesComComissao()); 
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("CLIENTES: ");
        c1.exibeDados();
        System.out.println("Usuario: "+c1.getUsuario());
        System.out.println("Senha: "+c1.getSenha());
        System.out.println();
        
        c2.exibeDados();
        System.out.println("Usuario: "+c2.getUsuario());
        System.out.println("Senha: "+c2.getSenha());
        System.out.println();
        
        c3.exibeDados();
        System.out.println("Usuario: "+c3.getUsuario());
        System.out.println("Senha: "+c3.getSenha());
        System.out.println();
        
        c4.exibeDados();
        System.out.println("Usuario: "+c4.getUsuario());
        System.out.println("Senha: "+c4.getSenha());
        System.out.println();
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Senha do Clientes Lucas: ");
        if(c4.verificarSenha("123456") == true){
           System.out.println("Senha correta: 123456 ");
       }else if(c4.verificarSenha("segredo") == true){
           System.out.println("Senha correta: segredo ");
       }else if(c4.verificarSenha("teste") == true){
           System.out.println("Senha correta: teste ");
       }
       else{
           System.out.println("Senha invalida");
       }
          
    }
    
}
