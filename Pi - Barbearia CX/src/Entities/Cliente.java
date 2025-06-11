
package Entities;

public class Cliente {
    private String nome;
    private String idade;
    private String plano;

    public Cliente(String nome, String idade, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    
    
}
