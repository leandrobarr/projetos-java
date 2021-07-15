package mapa;

public class Contrato {
    private Integer codigoContrato;
    private Cliente cliente;
    private Bicicleta[] bicicleta;
    private double valorContrato;
    private  int cont ;
    public Contrato() {
        bicicleta = new Bicicleta[10];
        cont = 0;
    }

    public Contrato(Integer codigoContrato, Cliente cliente, double valorContrato) {
        this.codigoContrato = codigoContrato;
        this.cliente = cliente;
        this.valorContrato = valorContrato;
        
    }
    public  void cadastraBicicleta(Bicicleta e, int indice){
        bicicleta[indice] = new Bicicleta(0, "", "", 0, 0);
        bicicleta[indice] = e;
        cont = indice;
    }
    public  void listarBicicleta(){
        for (int i = 0; i <= cont; i++) {
            System.out.println(bicicleta[i].exibeDados());
        }
    }
    public  String exibeDados(){
        return "Dados do Contrato\nCodigo do Contrato: "+getCodigoContrato() + "\nCliente: "+getCliente().exibeDados()+"\nValor Contrato: "+getValorContrato();
    }
    public Integer getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(Integer codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta[] getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta[] bicicleta) {
        this.bicicleta = bicicleta;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
}
