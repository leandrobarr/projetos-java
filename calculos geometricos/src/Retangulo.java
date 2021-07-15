
public class Retangulo extends Poligono{
    private int b;
    private int a;

    public Retangulo(int b, int a, int lados) {
        super(lados);
        this.b = b;
        this.a = a;
    }

    
    @Override
    float area() {
        return a*b;
    }
    
    public void imprimirDados(){
        System.out.println("Retangulo");
        imprimir();
        System.out.println("Largura: "+a);
        System.out.println("Comprimento: "+b);
        System.out.println("Area: "+area());
    }
}
