package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoCliente {//Acesso Ao banco de dados
    public void adicionar(String nome, int cpf, String endereco, char sexo) throws SQLException{
       String sql = "insert into cliente(nome,cpf,endereco,sexo) values (?,?,?,?)";
       Connection c = SingletonConexao.getConexao();
       PreparedStatement s = c.prepareStatement(sql);
       s.setString(1, nome);
       s.setInt(2, cpf);
       s.setString(3, endereco);
       s.setString(4,""+sexo);
       s.execute();
       s.close();
    }
    public void atualizar(String nome, int cpf, String endereco, char sexo) throws SQLException{
       String sql = "update cliente set nome=(?), sexo=(?), endereco=(?) where cpf = (?)";
       Connection c = SingletonConexao.getConexao();
       PreparedStatement s = c.prepareStatement(sql);
       s.setString(1, nome);
       s.setLong(2, cpf);
       s.setString(3, endereco);
       s.setString(4,""+sexo);
       s.execute();
       s.close();
       }
    public void excluir( String nome) throws SQLException{
        String sql = "delete from cliente where nome=(?)";
        Connection c = SingletonConexao.getConexao();
        PreparedStatement s = c.prepareStatement(sql);
        int count = s.getUpdateCount();
        System.out.println("Linhas Atualizadas " + count);
        s.execute();
        s.close();
        
         
        
        
    }
    public ResultSet listar() throws SQLException{
        String sql = "Select * from cliente";
        Connection c = SingletonConexao.getConexao();
        PreparedStatement p = c.prepareStatement(sql);
        ResultSet resultado = p.executeQuery();
        return resultado;
    }

    public void adicionar(String nome, int WIDTH, String endereco, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
