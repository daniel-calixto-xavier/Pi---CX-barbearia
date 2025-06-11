package Entities;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BarbeariaDAO {

    public static boolean marcarHorario(Horario h) {
        String sql = "INSERT INTO marcarHorario(nomeCliente, horario, dataCorte, barbeiro, descCorte) VALUES(?,?,?,?,?)";
        try {
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);

            ps.setString(1, h.getNomeCliente());
            ps.setString(2, h.getHorario());
            ps.setString(3, h.getDataCorte());
            ps.setString(4, h.getBarbeiro());
            ps.setString(5, h.getDescCorte());

            ps.executeUpdate();
            System.out.println("Horário marcado com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao marcar horário: " + e);
            return false;
        }
    }

    public static boolean cadastrarFuncionario(Funcionario f) {
        String sql = "INSERT INTO funcionario(nome, cargo, idade, cpf) VALUES(?,?,?,?)";
        try {
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);

            ps.setString(1, f.getNome());
            ps.setString(2, f.getCargo());
            ps.setString(3, f.getIdade());
            ps.setString(4, f.getCpf());

            ps.executeUpdate();
            System.out.println("Funcionário cadastrado com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar funcionário: " + e);
            return false;
        }
    }

    public static boolean cadastrarCliente(Cliente c) {
        String sql = "INSERT INTO cliente(nome, idade, plano) VALUES(?,?,?)";
        try {
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);

            ps.setString(1, c.getNome());
            ps.setString(2, c.getIdade());
            ps.setString(3, c.getPlano());

            ps.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e);
            return false;
        }
    }

    public static List<Cliente> listarClientes(){
        String sql = "SELECT * FROM clientes";
        List clientes = new ArrayList();
        try {
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setNome(rs.getString("nome"));
                c.setIdade(rs.getString("idade"));
                c.setPlano(rs.getString("plano"));
                clientes.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes " + e);
        }
        return clientes;
    }

    public static List<Funcionario> listarFuncionarios() {
        String sql = "SELECT * FROM funcionario";
        List funcionarios = new ArrayList();

        try {
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();

                f.setNome(rs.getString("nome"));
                f.setCargo(rs.getString("cargo"));
                f.setIdade(rs.getString("idade"));
                f.setCpf(rs.getString("cpf"));
                funcionarios.add(f);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listarFuncionarios " + e);
        }
        return funcionarios;
    }

    public static List<Horario> listarHorarioCliente() {
        String sql = "SELECT barbeiro, horario, dataCorte FROM marcarHorario";
        List listaHoraCliente = new ArrayList();
        try {
            Conexao con = new Conexao();

            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Horario h = new Horario();
                h.setBarbeiro(rs.getString("barbeiro"));
                h.setHorario(rs.getString("horario"));
                h.setDataCorte(rs.getString("dataCorte"));
                listaHoraCliente.add(h);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar horário para o cliente " + e.getMessage(),
                    "!!", JOptionPane.ERROR_MESSAGE);
        }
        return listaHoraCliente;
    }

    public static List<Horario> listarHorarioFuncionario() {
        String sql = "SELECT nomeCliente, barbeiro, descCorte, horario, dataCorte FROM marcarHorario";
        List listaHoraFuncionario = new ArrayList();
        try {
            Conexao con = new Conexao();

            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Horario h = new Horario();
                h.setNomeCliente(rs.getString("nomeCliente"));
                h.setBarbeiro(rs.getString("barbeiro"));
                h.setDescCorte(rs.getString("descCorte"));
                h.setHorario(rs.getString("horario"));
                h.setDataCorte(rs.getString("dataCorte"));
                listaHoraFuncionario.add(h);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar horário para o cliente " + e.getMessage(),
                    "!!", JOptionPane.ERROR_MESSAGE);
        }
        return listaHoraFuncionario;
    }
    
    public static  List<Funcionario> buscarNomeBarbeiro(String nome){
        String sql = "SELECT nome, idade, cargo, cpf FROM funcionario WHERE nome LIKE ?";
        List Funcionario = new ArrayList();
        try{
            Conexao con = new Conexao();
            con.conectar();
            PreparedStatement ps = con.getConexao().prepareStatement(sql);
            
            ps.setString(1, "%" + nome + "%");
            ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Erro ao buscar funcionário " + e.getMessage());
        }
        return Funcionario;
    }
}
