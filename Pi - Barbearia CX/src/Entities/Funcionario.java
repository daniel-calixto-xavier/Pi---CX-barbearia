
package Entities;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private String idade;
    private String cargo;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, String idade, String cargo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.cpf = cpf;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
