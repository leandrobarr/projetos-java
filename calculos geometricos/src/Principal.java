import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        int a , l, qtd;
        Scanner entrada = new Scanner(System.in);
        
        Triangulo t;
        Retangulo r;
        
        System.out.println("\nCalculo de Area do Triangulo\n");
                    
        System.out.println("Informe a Quantidades de Lados: ");
        qtd = entrada.nextInt();
                    
        System.out.println("Informe a Base do triangulo: ");
        l = entrada.nextInt();
                    
        System.out.println("Informe a Altura do Triangulo: ");
        a = entrada.nextInt();
        
        t = new Triangulo(l, a, qtd);
        t.imprimirDados();
        System.out.println("-----------------------------------------");
        System.out.println("\nCalculo de Area do Retangulo\n");
                    
        System.out.println("Informe a Quantidades de Lados: ");
        qtd = entrada.nextInt();
                    
        System.out.println("Informe a largura do Retângulo: ");
        l = entrada.nextInt();
                    
        System.out.println("Informe o comprimento do Retângulo: ");
        a = entrada.nextInt();
        
        r = new Retangulo(l, a, qtd);
        r.imprimirDados();
    
    }
}
