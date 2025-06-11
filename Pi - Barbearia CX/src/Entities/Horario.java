
package Entities;


public class Horario {
    private String horario;
    private String dataCorte;
    private String barbeiro;
    private String descCorte;
    private String nomeCliente;

    public Horario(String horario, String dataCorte, String barbeiro, String descCorte, String nomeCliente) {
        this.horario = horario;
        this.dataCorte = dataCorte;
        this.barbeiro = barbeiro;
        this.descCorte = descCorte;
        this.nomeCliente = nomeCliente;
    }

    public Horario() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDataCorte() {
        return dataCorte;
    }

    public void setDataCorte(String dataCorte) {
        this.dataCorte = dataCorte;
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }

    public String getDescCorte() {
        return descCorte;
    }

    public void setDescCorte(String descCorte) {
        this.descCorte = descCorte;
    }
    
    
}
