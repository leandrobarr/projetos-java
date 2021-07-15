
public class Triangulo extends Poligono{
    private int b;
    private int a;

    public Triangulo(int b, int a, int lados) {
        super(lados);
        this.b = b;
        this.a = a;
    }
    
    
    @Override
    float area() {
        return (a * b) / 2;
    }
    
    public void imprimirDados(){
        System.out.println("Triangulo");
        imprimir();
        System.out.println("Altura: "+a);
        System.out.println("Base: "+b);
        System.out.println("Area: "+area());
    }
    
}
