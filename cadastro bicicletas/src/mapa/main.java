package mapa;

import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        int opçãoMenu = 0, op2 = 0, codigo = 0, contContrato = 0;
        String cor, tipo;
        int marcha;
        double valorAluguel;   
        
        Scanner Texto = new Scanner(System.in);
        Scanner dadosNumero = new Scanner(System.in);
        
        Bicicleta[] bicicleta = new Bicicleta[5];
        bicicleta[0] = new Bicicleta(1, "Preta", "Profissional", 6, 25);
        bicicleta[1] = new Bicicleta(2, "Branca", "Corrida", 6, 50);
        
        
        Cliente[] cliente = new Cliente[10];
        cliente[0] = new Cliente("Evandro", "6565421-11", 1, "1020304050");
        cliente[1] = new Cliente("Carlos", "2222222-22", 2, "666666666666");
        cliente[2] = new Cliente("José", "11111111-11", 3, "555555555555");
        cliente[3] = new Cliente("Ricardo", "33333333333-22", 4, "8888888855");
        System.out.println("\n\n\t\tDados de Cliente e Bicicleta inserido com sucesso");
        
         Contrato[] contrato = new Contrato[10];
        System.out.println("=======================================================================================");
        do{
          
          
          opçãoMenu = menu();
          switch(opçãoMenu){
              case 1:
                  System.out.println("=======================================================================================");
                  System.out.println(bicicleta[0].exibeDados());
                  System.out.println(bicicleta[1].exibeDados());
                  System.out.println("=======================================================================================");
              break;
              case 2:
                  System.out.println("==================================Alterar Dados=========================================");
                  System.out.println(bicicleta[0].exibeDados());
                  System.out.println(bicicleta[1].exibeDados());
                  do{
                      System.out.println("\nInforme o Codigo : \n");
                      codigo = dadosNumero.nextInt();
                      if(codigo <= 0 || codigo > 2){
                         System.out.println("Código Invalido"); 
                      }
                  }while(codigo <= 0 || codigo > 2);
                  
                  System.out.println("Informe a Cor da Bicicleta"); 
                  cor = Texto.nextLine();
                  System.out.println("Informe a Tipo da Bicicleta"); 
                  tipo = Texto.nextLine();
                  System.out.println("Informe a Quantidade de Marcha da Bicicleta"); 
                  marcha = dadosNumero.nextInt();
                  System.out.println("Informe o Valor do Aluguel da Bicicleta"); 
                  valorAluguel = dadosNumero.nextDouble();
                  bicicleta[codigo - 1].setCor(cor);
                  bicicleta[codigo - 1].setTipo(tipo);
                  bicicleta[codigo - 1].setMarcha(marcha);
                  bicicleta[codigo - 1].setValorAluguel(valorAluguel);
                  System.out.println("Bicicleta Alterado com sucesso"); 
                  System.out.println("=======================================================================================");
              break;
              case 3:
                  System.out.println("=======================================================================================");
                  System.out.println(cliente[0].exibeDados());
                  System.out.println(cliente[1].exibeDados());
                  System.out.println(cliente[2].exibeDados());
                  System.out.println(cliente[3].exibeDados());
                  System.out.println("=======================================================================================");
              break;
              case 4:
                  System.out.println("\n======================Alterar dados de Cliente=======================================");
                  System.out.println(cliente[0].exibeDados());
                  System.out.println(cliente[1].exibeDados());
                  System.out.println(cliente[2].exibeDados());
                  System.out.println(cliente[3].exibeDados());
                  
                  do{
                      System.out.println("\nInforme o Codigo : \n");
                      codigo = dadosNumero.nextInt();
                      if(codigo <= 0 || codigo > 4){
                         System.out.println("Código Invalido"); 
                      }
                  }while(codigo <= 0 || codigo > 4);
                  System.out.println("Informe Nome do Cliente"); 
                  cliente[codigo - 1].setNome(Texto.nextLine()); 
                  System.out.println("Informe Cpf do Cliente"); 
                  cliente[codigo - 1].setCpf(Texto.nextLine());
                  System.out.println("Informe Telefone do Cliente"); 
                  cliente[codigo - 1].setTelefone(Texto.nextLine());
                  System.out.println("Cliente Alterado com sucesso"); 
                  System.out.println("=======================================================================================");
              break;
              case 5:
                  contrato[contContrato] = new Contrato();
                  System.out.println("Informe o Cliente no contrato");
                  System.out.println(cliente[0].exibeDados());
                  System.out.println(cliente[1].exibeDados());
                  System.out.println(cliente[2].exibeDados());
                  System.out.println(cliente[3].exibeDados());
                  do{
                      System.out.println("\nInforme o Codigo : ");
                      codigo = dadosNumero.nextInt();
                      if(codigo <= 0 || codigo > 4){
                         System.out.println("Código Invalido"); 
                      }
                  }while(codigo <= 0 || codigo > 4);
                  contrato[contContrato].setCliente(cliente[codigo - 1]);
                  contrato[contContrato].setCodigoContrato(contContrato + 1);
                  System.out.println("Informe o Valor do Contrato: "); 
                  contrato[contContrato].setValorContrato(dadosNumero.nextDouble());
                  int cont = 0;
                  do{
                      
                      System.out.println("\n1-Cadastrar Bicicleta no Contrato\n0-Sair: ");
                      codigo = dadosNumero.nextInt();
                      if(codigo == 1){
                            System.out.println("\nBicicleta");
                            System.out.println(bicicleta[0].exibeDados());
                            System.out.println(bicicleta[1].exibeDados());
                            do{
                                System.out.println("\nInforme o Codigo : ");
                                codigo = dadosNumero.nextInt();
                                if(codigo <= 0 || codigo > 2){
                                   System.out.println("Código Invalido"); 
                                }
                            }while(codigo <= 0 || codigo > 2); 
                            contrato[contContrato].cadastraBicicleta(bicicleta[codigo - 1], cont);
                            cont++;
                            System.out.println("Bicicleta Cadastrada com sucesso");
                            op2 = codigo;
                      }
                      else{
                          op2 = codigo;
                      }
                  }while(op2 != 0);  
                  contContrato++;
                  System.out.println("=======================================================================================");
              break;
              case 6:
                  if (contContrato > 0) {
                      System.out.println("====================================Contratos=======================================");
                      for (int i = 0; i <contContrato; i++) {
                          System.out.println(contrato[i].exibeDados());
                          System.out.println("Bicicletas");
                          contrato[i].listarBicicleta();
                          System.out.println("=======================================================================================");
                      }
                  }else{
                      System.out.println("Não Existe Contrato: ");
                  }
                  System.out.println("=======================================================================================");
              break;
              case 0:
                  System.out.println("Finalizando....");
              break;
          }
       }while(opçãoMenu != 0);
    }
    
    public static int menu() {
        int op;
        Scanner Texto = new Scanner(System.in);
        System.out.println("Informe a Operação:");
        System.out.println("1 - Listar Bicicletas");
        System.out.println("2 - Alterar dados de Bicicleta");
        System.out.println("3 - Listar de Cliente");
        System.out.println("4 - Alterar dados de Cliente");
        System.out.println("5 - Abrir Contrato");
        System.out.println("6 - Listar Contrato");
        System.out.println("0 - Sair");
        op = Texto.nextInt();
          
        return op;
          
    }
   
}
