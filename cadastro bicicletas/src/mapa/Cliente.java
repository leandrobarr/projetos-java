package mapa;


public class Cliente {
    private String nome;
    private String cpf;
    private Integer codigo;
    private String telefone;

    public Cliente(String nome, String cpf, Integer codigo, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.telefone = telefone;
    }
    public  String exibeDados(){
        return "Dados do Cliente\nCodigo: "+getCodigo() + " - Nome: "+getNome()+" - Cpf: "+getCpf()+ " - Telefone: "+getTelefone();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
