package mapa;

public class Bicicleta {
    private Integer codigoBicicleta;
    private String cor;
    private String tipo;
    private Integer marcha;
    private double valorAluguel;

    
    public Bicicleta(Integer codigoBicicleta, String cor, String tipo, Integer marcha, double valorAluguel) {
        this.codigoBicicleta = codigoBicicleta;
        this.cor = cor;
        this.tipo = tipo;
        this.marcha = marcha;
        this.valorAluguel = valorAluguel;
    }
    public  String exibeDados(){
        return "Dados da Bicicleta:\nCodigo: "+getCodigoBicicleta() + " - Cor: "+getCor()+" - Tipo: "+getTipo()+ " - Marcha: "+getMarcha() + " - Valor do Aluguel: "+getValorAluguel();
    }
    public Integer getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(Integer codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
