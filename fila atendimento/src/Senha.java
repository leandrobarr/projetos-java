
public class Senha {
    private String tipo;
    private Integer senha;

    public Senha() {
    }

    public Senha(String tipo, Integer senha) {
        this.tipo = tipo;
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    
}
